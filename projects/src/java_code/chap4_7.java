package java_code;
//import java.util.Locale;
//import java.util.ResourceBundle;
import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class chap4_7 extends JFrame{
    public static void main(String[] args){
        JButton jb=new JButton("切换");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
//        JTextArea textArea = new JTextArea();
        JTextField f=new JTextField();
        f.setText("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        panel.setLayout(new FlowLayout());
//        textArea.setSize(400,500);
        f.setSize(300,300);
        //当TextArea里的内容过长时生成滚动条
//        panel.add(new JScrollPane(textArea));
        panel.add(jb);
        panel.add(f);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setLocation(500,400);
        frame.setVisible(true);

        Locale localeEn = new Locale("en", "US");
        Locale localeZh = new Locale("zh", "CN");
        ResourceBundle rbEn = ResourceBundle.getBundle("resource_en_US", localeEn);
        ResourceBundle rbZh = ResourceBundle.getBundle("resource_zh_CN", localeZh);
        String a=rbEn.getString("us.gdut");
        String b=rbZh.getString("cn.gdut");
//        textArea.setText(a);
        f.setText(a);
        System.out.println("en-US: " + a);
        System.out.println("zh_CN：" + b);

        jb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
//                textArea.setText(b);
                if(f.getText().equals(a)){
                    f.setText(b);
                }else if(f.getText().equals(b)){
                    f.setText(a);
                }
            }
        });

    }

}
