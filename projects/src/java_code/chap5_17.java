package java_code;

import static java_code.TurtleThread.i;


public class chap5_17 {

    public static void main(String[] args){
        TurtleThread turtle = new TurtleThread("龟");
        RabiThread rabbit = new RabiThread("兔");
        turtle.setPriority(Thread.MAX_PRIORITY);
        rabbit.setPriority(Thread.MIN_PRIORITY);
        turtle.start();
        rabbit.start();
    }
}

class TurtleThread extends Thread{
    public static int j = 1;
    public static int i;
    public TurtleThread(String str){
        super(str);
    }
    public void run(){
        for(int i=0;j<100;i++){
            j = i * 5;
            System.out.println(getName()+"跑了"+ j + "米" );
            try{
                sleep((int) (Math.random()*1000));
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        if (j>=100)
            System.out.println("END!"+getName()+"跑完了！");
    }
}

class RabiThread extends Thread{
    public RabiThread(String str){
        super(str);
    }
     public void run() {
         for (i = 0; i <= 10; i++) {
             System.out.println(getName() + "跑了" + i * 10 + "米");
             try {
                 sleep((int) (Math.random() * 1000));
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
             if (i == 6) {
                 try {
                     System.out.println("兔子遥遥领先，睡觉");
                     this.sleep(6000);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }
             }
         }

         if (i > 10)
             System.out.println("END!" + getName() + "跑完了！");

     }
}
