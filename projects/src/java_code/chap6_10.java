package java_code;
import java.io.Serializable;
import java.io.*;

 class Students implements Serializable
{
    private String name;
    private char sex;
    private int year;
    private double gpa;

    public Students()
    {

    }
    public Students(String name,char sex,int year,double gpa)
    {
        this.name = name;
        this.sex = sex;
        this.year = year;
        this.gpa = gpa;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    public String getName()
    {
        return this.name;
    }

    public char getSex()
    {
        return this.sex;
    }

    public int getYear()
    {
        return this.year;
    }

    public double getGpa()
    {
        return this.gpa;
    }
}

public class chap6_10
{
    public static void main(String[] args)
    {
        Students st = new Students("Tom",'M',20,3.6);
        File file = new File("K:\\HelloWorld\\Java\\projects\\src\\java_code\\students.txt");
        try
        {
            file.createNewFile();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            //Student对象序列化过程
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.flush();
            oos.close();
            fos.close();

            //Student对象反序列化过程
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Students st1 = (Students) ois.readObject();
            System.out.println("name = " + st1.getName());
            System.out.println("sex = " + st1.getSex());
            System.out.println("year = " + st1.getYear());
            System.out.println("gpa = " + st1.getGpa());
            ois.close();
            fis.close();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}