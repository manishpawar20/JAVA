import java.sql.SQLOutput;
import java.util.Scanner;
public class Day10 {
//    For Q1
    static int twoSum(int a, int b)
    {
        int c= a+b;
        return c;
    }

//    For Q2
    static int maxNum(int x,int y, int z)
    {
        if(x > y && x > z)
        {
            return x;
        }
        else if(y > x && y > z)
        {
            return y;
        }
        else{
            return z;
        }
    }

//    For Q3
    static  boolean isEven(int num)
    {
        if(num%2==0)
            return true;
        else
            return false;
    }

//    For Q4
//    without Static
    int factorial(int n)
    {
        int fac = 1;
        if(n<=0)
        {
            System.out.println("Invalid number.");
            return n;
        }
        else{
            for (int i=1;i<=n;i++)
            {
                fac = fac *i;
            }
            return fac;

        }
    }

//    For method overloading
//    For Q1
    static void add(int a, int b)
    {
        System.out.println("Addition of two integers is "+(a+b));
    }
    static void add(int a, int b,int c)
    {
        System.out.println("Addition of three integers is "+(a+b+c));
    }

    static void add(double a,double b)
    {
        System.out.println("Addition of two double is "+(a+b));
    }


//    For Q2
    static int area(int side)
    {
        int a = side*side;
        return a;
    }
    static int area(int length,int width)
    {
        int a = length*width;
        return a;
    }
    static double area(double r)
    {
        double a = 3.14*r*r;
        return a;
    }


//    For Q3
    static String concat(String a, String b)
    {
        String add;
        add = a+b;
        return add;
    }
    static String concat(int a, int b)
    {
        String a1 = String.valueOf(a);
        String b1 = String.valueOf(b);
        String add;
        add = a1+b1;
        return add;
    }
    static String concat(String a, int b)
    {
        String b1 = String.valueOf(b);
        String add;
        add = a+b1;
        return add;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Today I learned method and method overloading in java
        /*
        *Sometimes our program grows in size and we want to separate the logic of main method to other method.
        *
        * Method : A method is a function written inside a class.
        * Since java is an object oriented language, we need to write the method inside some class.
        *
        * Method Overloading : If two or more method can have same name but differetn parameters.
        * such methods are called overloaded method.
        */
//        Solving some question to clear my concepts
//        Q 1 : Sum of Two Numbers:
//              Write a method sum(int a, int b) that takes two integers as arguments and returns their sum.
//        System.out.println("Enter two numbers : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int c = twoSum(a,b);
//        System.out.println("Addition of "+a+" and "+b+" is "+c);

//        Q 2 : Find the Maximum of Three Numbers:
//              Write a method max(int a, int b, int c) that returns the largest of the three numbers.
//        System.out.println("Enter three numbers : ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int max = maxNum(a,b,c);
//        System.out.println("Maximum number among three of them is "+max);


//        Q 3 : Check if a Number is Even or Odd:
//              Write a method isEven(int num) that returns true if the number is even, otherwise false.

//        System.out.println("Enter a numbers : ");
//        int a = sc.nextInt();
//        boolean con = isEven(a);
//        if(con)
//            System.out.println(a+" is Even.");
//        else
//            System.out.println(a+" is odd.");


//        Q 4 : Calculate Factorial of a Number:
//              Write a method factorial(int n) that returns the factorial of a given number.
//        One example using calling a method with object.
//        System.out.println("Enter a number : ");
//        int a = sc.nextInt();
//        Day10 obj = new Day10(); // Now we gonna create a method with out static.
//        int fac = obj.factorial(a);
//        System.out.println("Factorial of "+a+" is "+fac);

//        Now some question on method overloading.
//        Q 1 : Overloaded Addition Method:
//              Write overloaded methods add(int a, int b), add(double a, double b), and add(int a, int b, int c)
//              to perform addition for different data types and arguments.

//        System.out.println("Enter two integers :");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("Enter two doubles :");
//        double a1 = sc.nextDouble();
//        double b1 = sc.nextDouble();
//        System.out.println("Enter three integers :");
//        int a2 = sc.nextInt();
//        int b2 = sc.nextInt();
//        int c2 = sc.nextInt();
//
//        System.out.println("Addition for different data types and arguments with the help of method overloading");
//        add(a,b);
//        add(a1,b1);
//        add(a2,b2,c2);


//        Q 2 : Calculate Area of Different Shapes:
//              Write overloaded methods:
//              area(int side) → returns the area of a square.
//              area(int length, int width) → returns the area of a rectangle.
//              area(double radius) → returns the area of a circle.

//        System.out.println("Enter the side of square to find area : ");
//        int side = sc.nextInt();
//        System.out.println("Enter the length and width of rectangle to find area : ");
//        int len = sc.nextInt();
//        int wid = sc.nextInt();
//        System.out.println("Enter the radius of circle to find area : ");
//        double r = sc.nextDouble();
//        int sqArea = area(side);
//        int recArea = area(len,wid);
//        double cirArea = area(r);
//        System.out.println("Area of Square is "+sqArea);
//        System.out.println("Area of Rectangle is "+recArea);
//        System.out.println("Area of Circle is "+cirArea);


//        Q 3 : Concatenation Using Overloading:
//              Write overloaded methods concat(String a, String b), concat(int a, int b), and concat(String a, int b)
//              that return the concatenated result of the given parameters.

//        System.out.println("Enter two strings : ");
//        String a = sc.next();
//        String b = sc.next();
//        System.out.println("Enter two numbers : ");
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        System.out.println("Enter one string and one numbers : ");
//        String c = sc.next();
//        int c1 = sc.nextInt();
//
//        String twoString = concat(a,b);
//        String twoInt = concat(a1,b1);
//        String oneStringOneInt = concat(c,c1);
//
//        System.out.println("Concatenating "+a+" and "+b+" is "+twoString);
//        System.out.println("Concatenating "+a1+" and "+b1+" is "+twoInt);
//        System.out.println("Concatenating "+c+" and "+c1+" is "+oneStringOneInt);



    }
}
