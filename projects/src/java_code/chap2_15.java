package java_code;

public class chap2_15 {
    public static void main(String[] args){
        Employee man1 = new Employee("a",10000,"front-end",1998,02,01);
        System.out.println("before set:");
        System.out.println("name= "+man1.getName());
        System.out.println("Department= "+man1.getDepartment());
        System.out.println("Salary= "+man1.getSalary());
        System.out.println("Year= "+man1.getYear());
        System.out.println("Month= "+man1.getMonth());
        System.out.println("Day= "+man1.getDay()+"\n");
        System.out.println("After set:");
        man1.setName("b");
        man1.setDepartment("design");
        man1.setSalary(5000);
        man1.setYear(2008);
        man1.setMonth(12);
        man1.setDay(03);
        System.out.println("name= "+man1.getName());
        System.out.println("Department= "+man1.getDepartment());
        System.out.println("Salary= "+man1.getSalary());
        System.out.println("Year= "+man1.getYear());
        System.out.println("Month= "+man1.getMonth());
        System.out.println("Day= "+man1.getDay()+"\n");

        Employee a[]=new Employee [3];
        a[0]=new Employee("a1",10000,"front-end",2000,02,01);
        a[1]=new Employee("a2",20000,"medium-end",3000,03,02);
        a[2]=new Employee("a3",30000,"end-end",4000,04,03);
        System.out.println("a[0]= "+a[0].name+"\na[1]= "+a[1].name+"\na[2]= "+a[2].name);


    }
}
class Employee{
    public Employee(String name,int salary,String department,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.year=year;
        this.month =month;
        this.day=day;
    }
        int year;
        int month;
        int day;
        public int getYear(){
            return this.year;
        }
        public int getMonth(){
            return this.month;
        }
        public int getDay(){
            return this.day;
        }
        public void setYear(int year){
            this.year=year;
        }
        public void setMonth(int month){
            this.month=month;
        }
        public void setDay(int day){
            this.day=day;
        }
    String name;
    String department;
    int salary;
    public String getName(){
        return this.name;
    }
    public String getDepartment(){
        return this.department;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}