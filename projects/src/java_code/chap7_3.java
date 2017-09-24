//
//3. 下面的省会和城市数据格式：省会 （城市）。请用Map(String, String[])来存    储省会与城市数据。编程实现输入省会名，列出城市列表。
//        "广东", ("广州","深圳","潮州","韶关","湛江","惠州","清远","东莞","江门","茂名","肇庆","汕尾","河源","揭阳","梅州","中山","德庆","阳江","云浮","珠海","汕头","佛山")
//        "广西", ("南宁","桂林","阳朔","柳州","梧州","玉林","桂平","贺州","钦州","贵港","防城港","百色","北海","河池","来宾","崇左")
//        "云南", ("昆明","保山","楚雄","德宏","红河","临沧","怒江","曲靖","思茅","文山","玉溪","昭通","丽江","大理")

package java_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chap7_3 {

    static String[] a={"广州","深圳","潮州","韶关","湛江","惠州","清远","东莞","江门","茂名","肇庆","汕尾","河源","揭阳","梅州","中山","德庆","阳江","云浮","珠海","汕头","佛山"};
    static String[] b={"南宁","桂林","阳朔","柳州","梧州","玉林","桂平","贺州","钦州","贵港","防城港","百色","北海","河池","来宾","崇左"};
    static String[] c={"昆明","保山","楚雄","德宏","红河","临沧","怒江","曲靖","思茅","文山","玉溪","昭通","丽江","大理"};
    public static void main(String[] args){
        Map<String,String[]> city = new HashMap<>();

        city.put("广东",a);
        city.put("广西",b);
        city.put("云南",c);
        m(city);
        }

    private static void m(Map<String,String[]> city) {
        System.out.println("请输入省会名：（0--结束）");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        String[] p;
        switch(i){
            case "广州":
                p=city.get("广东");
                for(String q : p){
                    System.out.print(q+ " ");
                }
                System.out.print("\n\n");
                break;
            case "南宁":
                p=city.get("广西");
                for(String q : p){
                    System.out.print(q+ " ");
                }
                System.out.print("\n\n");
                break;
            case "昆明":
                p=city.get("云南");
                for(String q : p){
                    System.out.print(q+ " ");
                }
                System.out.print("\n\n");
                break;
            case "0": System.out.println("结束");return;
            default:
                System.out.println("请输入正确的城市名!\n");
        }
        m(city);
    }
}
