package java_code;

import java.util.Scanner;

import static java.util.regex.Pattern.matches;

public class chap4_8 {
    public static void main(String[] args){
        System.out.println("请输入邮箱地址： ");
        Scanner email=new Scanner(System.in);
        String Email=email.nextLine();
//        String rex="^([[a-z]\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        String rex="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        if(matches(rex,Email)){
            System.out.println("Email available!");
        }else if(!matches(rex,Email)){
            System.out.println("Email invalid!");
        }

    }
}
