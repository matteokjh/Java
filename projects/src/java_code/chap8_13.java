package java_code;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class chap8_13{
    public static void main(String[] args) throws Exception
    {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//设置皮肤
        new DragTest().setVisible(true);
    }
}
class DragTest extends JFrame
{

    JPanel panel;//要接受拖拽的面板
    private ArrayList<Object> totalName = new ArrayList<>();
    int exist = 0;

    public DragTest()
    {
        panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 400);
        setTitle("拖拽音频文件到下面");
        drag();//启用拖拽
    }

    public void drag()//定义的拖拽方法
    {


        //panel表示要接受拖拽的控件
        new DropTarget(panel, DnDConstants.ACTION_COPY_OR_MOVE, new DropTargetAdapter()
        {
            @Override
            public void drop(DropTargetDropEvent dtde)//重写适配器的drop方法
            {
                try
                {
                    if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))//如果拖入的文件格式受支持
                    {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);//接收拖拽来的数据
                        List<File> list =  (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
                        String temp="";
                        for(File file :list){
                            if(file.toString().toLowerCase().endsWith(".mp3")){
                                temp+=file.getAbsolutePath()+";\n";
                                String trueName = file.toString().substring(file.toString().lastIndexOf("\\")+1,file.toString().indexOf("."));
                                if(!totalName.contains(trueName)){
                                    totalName.add(trueName);
                                    class MouseDemo extends JButton {
                                        public MouseDemo(){
                                            this.addMouseListener(new MouseAdapter(){
                                                public void mouseClicked(MouseEvent e){
                                                    if(e.getClickCount() == 2){
                                                        JOptionPane.showMessageDialog(null,"doubleClicked!");
                                                        System.out.println(trueName);
                                                        String file="K:\\HelloWorld\\Java\\projects\\src\\"+trueName+".mp3";
                                                        try {
                                                            Runtime.getRuntime().exec("cmd /c start "  +  file.replaceAll(" ", "\" \""));
                                                        } catch (IOException e1) {
                                                            e1.printStackTrace();
                                                        }
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    MouseDemo jb = new MouseDemo();
                                    jb.setText(trueName);
                                    jb.setVisible(true);
                                    jb.setPreferredSize(new Dimension(100,50));
                                    panel.add(jb);

                                }else{
                                    JOptionPane.showMessageDialog(null,trueName+" .mp3 文件已存在！");
                                    exist = 1;
                                    continue;
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,file.toString().toLowerCase()+"  文件格式必须为\".mp3\"");
                            }

                                validate();
                                dtde.dropComplete(true);//指示拖拽操作已完成
                        }
                        if(temp!=""&&exist==0)
                            JOptionPane.showMessageDialog(null, "成功导入！路径为： "+temp);
                    }
                    else
                    {
                        dtde.rejectDrop();//否则拒绝拖拽来的数据
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}