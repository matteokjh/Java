package java_code;

public class chap2_21 {
    public static void main(String[] args){
        Duel q=new Duel();
        q.man();
        q.woman();
        q.daddy();
        q.boy();
        q.girl();
    }
}
interface Port1{
    void man();
    void boy();
}
interface Port2{
    void woman();
    void girl();
}
interface Port3 extends Port1,Port2{
     void daddy();
}
class win{

}
class Duel extends win implements Port3{
    public void man(){
        System.out.println("man");
    }
    public void boy(){
        System.out.println("boy");
    }
    public void woman(){
        System.out.println("woman");
    }
    public void girl(){
        System.out.println("girl");
    }
    public void daddy(){
        System.out.println("daddy");
    }
}