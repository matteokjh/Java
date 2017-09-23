package java_code;

import java.util.Scanner;

public class chap1_33 {
    public static void main(String[] args){
        Scanner q = new Scanner(System.in);
        int n=q.nextInt();
        int i,j,m=n,t;
        char p=' ';
        int a[][]=new int[n][n+1];
        for(i=0;i<n;i++){
            for(t=0;t<m;t++)
                System.out.print(p);
            a[i][0]=1;
            a[i][i]=1;
            System.out.print(a[i][0]+"  ");
            for(j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
                System.out.print(a[i][j]+"  ");
            }
            if(!(i==0))System.out.print(a[i][i]);
            System.out.println("\n");
            m--;
        }
    }
}
