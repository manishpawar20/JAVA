import java.util.*;
class Employee1
{
    String name;
    float salary;
    public Employee1()
    {
        salary = 10000;
    }
    public void getname(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
public class Day15 {
    public static void main(String[] args) {
//        QQ : Overload the employee constructor to initialize the salary to 10000
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String n = sc.nextLine();
        Employee1 e1 = new Employee1();
        e1.getname(n);
        e1.display();
    }
}
