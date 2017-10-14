//将5个学生信息student添加到java.util.ArrayList，并为学生添加equals方法，equals方法判断id 相同者为同一学生，
//实现功能：程序可以判断是否该学生、删除学生。列出全部学生。
//学生类：student(String id,String name,Char gender,Date birth)
package java_code;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Student{

    String id;
    String name;
    char gender;
    Date birth;
    Student(String id, String name, char gender, String birthDate) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = dateFormat.parse(birthDate);
    }
}
public class chap7_1 {

    public static void main(String[] args) throws ParseException {
        Student S1 = new Student("s1","ken",'m',"1998-02-01");
        Student S2 = new Student("s2","ben",'f',"2017-09-23");
        Student S3 = new Student("s3","jenny",'f',"1922-10-11");
        Student S4 = new Student("s4","len",'m',"1934-01-12");
        Student S5 = new Student("s5","pen",'f',"1998-02-02");
        List<Student> list = new ArrayList();
        list.add(S1);
        list.add(S2);
        list.add(S3);
        list.add(S4);
        list.add(S5);
        System.out.println(list);
        System.out.println("请输入数字0-3：");
        System.out.println("0--退出程序；   1--搜索学生； 2--删除学生； 3--学生信息；\n");
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        m(i,list);
        System.out.println("结束");
    }
    private static void m(int i,List<Student> list) {
        switch (i){
            case 0: return;
            case 1: chap7_1.search(list);break;
            case 2: chap7_1.delete(list);break;
            case 3: chap7_1.show(list); break;
            default: System.out.println("非法输入！\n");
        }
        System.out.println("请输入数字0-3：");
        System.out.println("0--退出程序；   1--搜索学生； 2--删除学生； 3--学生信息\n");
        Scanner sb = new Scanner(System.in);
        i=sb.nextInt();
        m(i,list);
    }

    private static void show(List<Student> list) {
        Student p;
        for(int j=0;j<list.size();j++){
            p=list.get(j);
            System.out.println("id: "+p.id+"   name: "+p.name+"  gender: "+p.gender+"   birthdate: "+p.birth);
        }
        System.out.println("\n");
    }

    private static void delete(List<Student> list) {
        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        String id=sc.nextLine();
        Student p;
        for(int j=0;j<list.size();j++){
            p=list.get(j);
            if(p.id.equals(id))
            {
                list.remove(j);
                System.out.println("学生"+p.id+"已删除\n");
                return;
            }
        }
        System.out.println("学生不存在！\n");
    }
    private static void search(List<Student> list) {
        System.out.println("请输入学生id：");
        Scanner sc = new Scanner(System.in);
        String i=sc.nextLine();
        Student p;
        for(int j=0;j<list.size();j++){
            p = list.get(j);
            if(p.id.equals(i))
            {
                System.out.println("该学生存在！\n");
                return;
            }
        }
        System.out.println("学生不存在！\n");
    }

}
