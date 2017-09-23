package java_code;

import java.util.Arrays;

public class chap1_31 {
    public static void main(String[] args){
        int a[][]=new int[4][4];
        int b[]=new int[16];
        int e=200;
        int k=0;
        //int n=0;
        System.out.println("排序前：");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            {
                e-=10;
                a[i][j]=e;
                b[k++]=a[i][j];
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
                //System.out.println("b["+(k-1)+"]"+b[k-1]);
            }
        }
        Arrays.sort(b);
//        for(int m:b){
//            System.out.println("b["+n+"]"+m);
//            n++;
//        }
        e=0;
        System.out.println("排序后：");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            {
                a[i][j]=b[e++];
                System.out.println("a["+i+"]["+j+"]="+a[i][j]);
                //System.out.println("b["+(k-1)+"]"+b[k-1]);
            }
        }




    }
}
