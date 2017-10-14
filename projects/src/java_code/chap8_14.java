package java_code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class chap8_14 extends JFrame{
    DrawPane p;
    JButton btn=new JButton("清除");
    public chap8_14() {
        p=new DrawPane();
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.repaint();
            }
        });
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p,"Center");
        getContentPane().add(btn,"North");
        setTitle("画板");
        setSize(800,800);
        setVisible(true);
    }
    public static void main(String[] args) {
        new chap8_14();
    }
}
class DrawPane extends JPanel {
    int x1,y1,x2,y2;
    boolean first=true;
    public DrawPane() {
        x1=x2=y1=y2=0;
        MouseAdapter adapter=new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1) {
                    x1=x2=e.getX();
                    y1=y2=e.getY();
                }
            }
            public void mouseDragged(MouseEvent e) {
                Graphics g=getGraphics();
                if(first){
                    System.out.println("try");
                    x2=e.getX();
                    y2=e.getY();
                    draw(g);
                    first=false;
                }
                else{
                    x1=x2;
                    y1=y2;
                    x2=e.getX();
                    y2=e.getY();
                    draw(g);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if(e.getButton()==MouseEvent.BUTTON1){
                    x1=x2=y1=y2=0;
                }
            }
        };
        addMouseListener(adapter);
        addMouseMotionListener(adapter);

    }
    public void draw(Graphics g) {
        g.drawLine(x1,y1,x2,y2);
    }
}
