
package java_code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class chap9_12 {
    public static void main(String[] args) {
        new Jfilechooser();
    }


    static class Jfilechooser extends JFrame implements ActionListener {

        JButton button;
        JTextPane textpane;
        FileInputStream readfile;
        JScrollPane scroll;
        Container con;
        JFileChooser chooser = new JFileChooser();


        public Jfilechooser() {
            super("TXT文件打开窗口");
            button = new JButton("打开文件");
            button.addActionListener(this);
            textpane = new JTextPane();
            scroll = new JScrollPane(textpane);
            setSize(new Dimension(400, 400));
            setVisible(true);
            con = getContentPane();
            con.add(button, BorderLayout.NORTH);
            con.add(scroll, BorderLayout.CENTER);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                    System.exit(0);
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                int state = chooser.showOpenDialog(null);
                File file = chooser.getSelectedFile();
                if (file != null && state == JFileChooser.APPROVE_OPTION) {
                    try {
                        readfile = new FileInputStream(file);
                        textpane.read(readfile, this);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }
}