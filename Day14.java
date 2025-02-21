import java.util.*;

//For Q 1
class Employee
{
    int salary;
    String name;

    public int getsalary()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary : ");
        salary= sc.nextInt();
        return salary;
    }
    public String getname()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");
        name = sc.nextLine();
        return name;
    }

}

//For Q 2
class Cellphone
{



    public void optionInCell()
    {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("Select option : ");
        i = sc.nextInt();
        switch (i)
        {
            case 1 :
                System.out.println("Ringing...");
                break;
            case 2 :
                System.out.println("Vibrating....");
                break;
            case 3 :
                System.out.println("Silent...");
                break;
            default:
                System.out.println("Invalid option in this cellphone.");
        }
    }
}

//For Q 3
class Square
{
    float side;

    public void getSide()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of side : ");
        side = sc.nextFloat();
    }

    public float areaOfSquare()
    {
        return side*side;
    }
    public float perimeterOfSquare()
    {
        return (4*side);
    }
}

//For Q 4
class Rectangle
{
    float len;
    float bre;

    public void getSide()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of length and breadth : ");
        len = sc.nextFloat();
        bre = sc.nextFloat();
    }

    public float areaOfRectangle()
    {
        return len*bre;
    }
    public float perimeterOfRectangle()
    {
        return (2*len+2*bre);
    }
}


//For Q 5
class TommyVecetti
{
    public void hit()
    {
        System.out.println("Hitting...");
    }
    public void run()
    {
        System.out.println("Running...");
    }
    public void fire()
    {
        System.out.println("Firing...");
    }
}


//For Q 6
class Circle
{
    float radius;

    public void getRadius()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of radius : ");
        radius = sc.nextFloat();
    }

    public float areaOfCircle()
    {
        return (3.14f*radius*radius);
    }
    public float perimeterOfCircle()
    {
        return (2*3.14f*radius);
    }
}



public class Day14 {

    public static void main(String[] args) {
//        Today I am solving Basic Questions on Object Oriented Programming

//        Q 1 : Create a class Employee with the following properties and methods:
//        Salary (property) (int)
//                getSalary (method returning int)
//        name (property) (String)
//                getName (method returning String)
//        setName (method changing name)

//        Employee e1 = new Employee();
//        System.out.println("Name is "+e1.getname());
//        System.out.println("Salary is "+e1.getsalary());




//        Q 2 : Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.

//        Cellphone c1 = new Cellphone();
//        System.out.println("Option in Cellphone:\n1.Ringing\n2.Vibrating\n3.Silent");
//        c1.optionInCell();



//        Q 3 :  Create a class Square with a method to initialize its side, calculating area, perimeter etc.

//        Square s1 = new Square();
//        s1.getSide();
//        System.out.println("Perimeter of Sqaure is "+ s1.perimeterOfSquare());
//        System.out.println("Area of Sqaure is "+ s1.areaOfSquare());



//        Q 4 : Create a class Rectangle & problem 3.
//        Rectangle r1 = new Rectangle();
//        r1.getSide();
//        System.out.println("Perimeter of Rectangle is "+r1.perimeterOfRectangle());
//        System.out.println("Area of Rectangle is "+r1.areaOfRectangle());



//        Q 5 : Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
//        Scanner sc = new Scanner(System.in);
//        TommyVecetti p1 = new TommyVecetti();
//        int option;
//        do {
//            System.out.println("Control the player1 : ");
//            System.out.println("Options :\n1.Run\n2.Hitting\n3.Fire\n4.Exit");
//            System.out.print("Select a option : ");
//            option = sc.nextInt();
//            switch (option) {
//                case 1 -> p1.run();
//                case 2 -> p1.hit();
//                case 3 -> p1.fire();
//                case 4 -> {
//                    System.out.println("Exiting Game....");
//                    break;
//                }
//                default -> System.out.println("Invalid option!!");
//            }
//        }while (option<4);



//        Q 6 : Repeat problem 4 for a circle.

//        Circle c1 = new Circle();
//        c1.getRadius();
//        System.out.println("Perimeter of Circle is "+c1.perimeterOfCircle());
//        System.out.println("Area of Circle is "+c1.areaOfCircle());



    }
}
