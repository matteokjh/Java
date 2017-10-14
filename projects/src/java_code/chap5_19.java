package java_code;

import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class chap5_19 {
    public static void main(String[] args){
        Class<chap5_17> c = chap5_17.class;
        System.out.print("类名：");
        System.out.println(c.getName());
        System.out.print("修饰符名：");
        System.out.println(Modifier.toString(c.getModifiers()));
        System.out.print("接口名：");
        Type[] ifs = c.getInterfaces();
        if(ifs.length!=0){
            for(Type inf : ifs){
                System.out.println(inf.toString());
            }
        }else System.out.println("no interface");
        System.out.print("方法名：");
        Member[] mes = c.getMethods();
        if(mes.length!=0){
            for(Member mef : mes )
                System.out.println(mef.toString());
        }else System.out.println("no method");
    }
}
