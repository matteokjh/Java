package java_code;

import javax.swing.*;
import java.awt.*;

public class chap8_5 {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Draw qwer = new Draw();
    }
}
 class Draw extends JFrame
{
    MyPanel mp = null ;
    public Draw()
    {
        mp = new MyPanel();

        this.add(mp);
        this.setSize(400,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel    //我自己的面板，用于绘图和实现绘图区域
{
    //覆盖JPanel的paint方法
    //Graphics是绘图的重要类，可以理解成一支画笔
    public void paint(Graphics g)
    {
        super.paint(g);
        //画圆
        g.drawOval(210, 30, 70, 70);
        //画直线
        g.drawLine(20, 30, 20, 100);
        //画出矩形边框
        g.drawRect(40, 30, 100, 70);
        //画填充矩形
        g.setColor(Color.BLUE);     //设置颜色
        g.fillRect(150,30,50,70);

    }
}
