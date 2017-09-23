package java_code;

public class chap2_12 {
    public static void main(String[] args){
        System.out.println("book1调试带参数构造方法：");
        Book book1=new Book("a","b",1);
        Book book2=new Book();
        book1.printBook();
        System.out.println("book2调试不带参数构造方法：");
        book2.setBook("java","jk",46);
        book2.printBook();
    }
}

class Book{

    private String name;
    private String author;
    private int num;

    public Book(String name,String author,int num){
        this.name=name;
        this.author=author;
        this.num=num;
    }
    public Book(){

    }
    public void setBook(String name,String author,int num){
        this.name=name;
        this.author=author;
        this.num=num;
    }
    public void printBook(){
        System.out.println("name="+this.name);
        System.out.println("author="+this.author);
        System.out.println("num="+this.num);
        System.out.println("\n");
    }

}