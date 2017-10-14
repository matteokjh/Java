package java_code;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class chap9_13x {

    public static void main(String[] args) {
        new JSliderDemo();
    }
    public static class JSliderDemo extends JFrame implements ChangeListener{
        private JSlider slider = new JSlider(0,80);
        private JTextField text = new JTextField();

        JSliderDemo(){
            JFrame frame=new JFrame("滑块");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            text.setText("字体");
            text.setBounds(100,0,200,200);
            text.setEditable(false);
            text.setFont(new Font("宋体", Font.PLAIN, 16));
            frame.setBounds(200,200,400,400);
            frame.setResizable(true);
            slider.setMajorTickSpacing(10);
            slider.setMinorTickSpacing(5);
            panel.add(text);
            panel.add(slider);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            text.validate();
            slider.addChangeListener(this);
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            if((JSlider)e.getSource()==slider){
                int str=slider.getValue();
                text.setFont(new Font("宋体", Font.PLAIN, str/3));
            }
        }
    }


}