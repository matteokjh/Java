//4. 将题2广东城市存入HashSet，其中海边城市（“惠州”,“茂名”,“汕尾”,“揭阳”,“中山”,“阳江”,“珠海”,“汕头” ）存另一HashSet，利用集合运算，求出广东的内陆城市。


package java_code;

import java.util.HashSet;
import java.util.Set;

public class chap7_4 {
    public static void main(String[] args){
        Set<String> gd = new HashSet<>();
        String[] q = {"惠州","茂名","汕尾","揭阳","中山","阳江","珠海","汕头"};
        Set<String> sand = new HashSet<>();
        Set<String> sea = new HashSet<>();

        for(String e : q){
            sea.add(e);
        }
        for(String e : chap7_3.a){
            gd.add(e);
        }
        for(String e : gd ){
            if(!sea.contains(e))
                sand.add(e);
        }
        System.out.println("广东全部城市：");
        System.out.println(gd);
        System.out.println("广东的沿海城市为：");
        System.out.println(sea);
        System.out.println("广东的内陆城市为：");
        System.out.println(sand);

    }
}
