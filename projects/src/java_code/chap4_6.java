package java_code;

public class chap4_6 {
    public static void main(String[] args){

        long startTime = System.currentTimeMillis();    //获取开始时间
        String s="abcedfg";
        for(int i=0;i<10000;i++)
            s+="a";
        long endTime = System.currentTimeMillis();    //获取结束时间


//        long startTime2 = System.currentTimeMillis();
        long startTime2 = System.nanoTime();
        StringBuffer v = new StringBuffer("abcedfg");
        for(int i=0;i<10000;i++)
            v.append("a");
//        long endTime2 = System.currentTimeMillis();
        long endTime2 = System.nanoTime();


//        long startTime3 = System.currentTimeMillis();
        long startTime3 = System.nanoTime();
        StringBuilder g = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            g.append("a");
        }
        long endTime3 = System.nanoTime();
//        long endTime3 = System.currentTimeMillis();
        System.out.println("String程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        System.out.println("StringBuffer程序运行时间：" + (endTime2 - startTime2) + "ns");    //输出程序运行时间
        System.out.println("StringBuilder程序运行时间：" + (endTime3 - startTime3) + "ns");    //输出程序运行时间
    }
}
