package java_code;

import javax.swing.*;
import java.awt.*;

public class chap9_13 {
    public static void main(String[] args){
        new Login();
    }

}

class Login extends JFrame{
    Login(){
        setTitle("登陆");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        this.setLayout(new GridLayout(3,1,5,5));
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JLabel l1 = new JLabel("用户名： ");
        JLabel l2 = new JLabel("密    码： ");
//        l1.setBounds(80,100,40,20);
//        l1.setBounds(80,300,40,20);
//        t1.setBounds(100,100,100,20);
//        t1.setBounds(100,300,100,20);
        JButton btn = new JButton("登陆");
        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        p3.add(btn);
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(p1);
        this.add(p2);
        this.add(p3);
    }
}
