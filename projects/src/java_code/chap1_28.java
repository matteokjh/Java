package java_code;

import java.util.Scanner;

public class chap1_28 {
    static int a[]=new int[10];
    public static void main(String[] args) {
        System.out.println("请输入长度：");
        Scanner n = new Scanner(System.in);
        int length;
        length=n.nextInt();//注意数列长度为1-10；
        Fibonacci(length);
        for(int i=0;i<length;i++){
            a[i]=Fibonacci(i);
            System.out.println("a["+i+"]:"+a[i]);
        }

    }
    public static int Fibonacci(int length){
        if(length<=10&&length>=0){
            if (length==1||length==0)return length;
            else
                return Fibonacci(length-1)+ Fibonacci(length-2);
        }
        else return -1;
    }
}
