/* Today I am practicing more question on what i have studied till now.*/


import org.w3c.dom.css.Rect;

import java.util.Scanner;
//For Q 1
class Cylinder
{
    int radius, height;

    public void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius and height of cylinder : ");
        radius = sc.nextInt();
        height = sc.nextInt();
    }
    public void setter()
    {
        System.out.println("Radius of Cylinder : "+ radius);
        System.out.println("Height of Cylinder : "+ height);
    }
    public void calculate()
    {
        double VolumeOfCylinder = ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
        double SurfaceArea = (Math.PI*radius*height);
        System.out.println("Surface of Cylinder : "+ VolumeOfCylinder);
        System.out.println("Volume of Cylinder : "+ SurfaceArea);
    }

}

//For Q 3
class Cylinder1
{
    int radius, height;
    Cylinder1(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
    }

    public void setter()
    {
        System.out.println("Radius of Cylinder : "+ radius);
        System.out.println("Height of Cylinder : "+ height);
    }
    public void calculate()
    {
        double VolumeOfCylinder = ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
        double SurfaceArea = (Math.PI*radius*height);
        System.out.println("Surface of Cylinder : "+ VolumeOfCylinder);
        System.out.println("Volume of Cylinder : "+ SurfaceArea);
    }
}

//For Q 4
class Rectangle
{
    int len,bre;
    Rectangle()
    {
        len = 5;
        bre = 5;
    }
    Rectangle(int l , int b)
    {
        len = l;
        bre = b;
    }
    public void display()
    {
        System.out.println("Length : "+len);
        System.out.println("Breadth : "+bre);
    }
}


//For Q 5
class Sphere
{
    int radius;
    public void getter()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of sphere : ");
        radius = sc.nextInt();
    }
    public void setter()
    {
        System.out.println("Radius of sphere : "+ radius);
    }
    public void calculate()
    {
        double VolumeOfsphere = ((4/3.0)*Math.PI*radius*radius*radius);         //4/3 π r^3
        double SurfaceArea = (4*Math.PI*radius*radius);                         //4πr^2
        System.out.println("Surface of sphere : "+ VolumeOfsphere);
        System.out.println("Volume of sphere : "+ SurfaceArea);
    }
}

public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q 1 : create a class cylinder and use getter and setters to set its radius and height
//          Volume of Cylinder :  π r² h
//          Surface area of cylinder : 2πrh+2πr^2
//        Cylinder c1 = new Cylinder();
//        c1.getter();
//        c1.setter();


//        Q 2 : use Q1 to calculate surface and volume of the cylinder
//        Cylinder c1 = new Cylinder();
//        c1.getter();
//        c1.setter();
//        c1.calculate();


//        Q 3 : Use a constructor and repeat Q 1

//        System.out.println("Enter radius and height of cylinder : ");
//        int radius = sc.nextInt();
//        int height = sc.nextInt();
//        Cylinder1 c2 = new Cylinder1(radius,height);
//        c2.setter();
//        c2.calculate();


//        Q 4 : Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters
//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle(12,23);
//        System.out.println("1 rectangle ");
//        r1.display();
//        System.out.println("2 rectangle ");
//        r2.display();


//         Q 5 : Repeat Q 1 for a sphere
//         surface area of sphere : 4πr^2
//         volume of sphere : 4/3 π r^3
//        Sphere s1 = new Sphere();
//        s1.getter();
//        s1.setter();
//        s1.calculate();



    }
}
