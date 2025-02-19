import java.util.Scanner;
/*
        From today i am gonna do java again, My exam is there that why i left this and focus on studies
        Today learning about OOP in java
        video 3 CWH

        OOP tries to map code instruction with real world making the code short and easier to understand.
        OOP promotes DRY principle
        Do not Repeat Yourself
         */
//For Q 1
//class A
//{
//    void display()
//    {
//        System.out.println("This is class A");
//    }
//}
//class B extends A
//{
//    void displayB()
//    {
//        super.display(); // super.display() == A.display();
//        System.out.println("This is class B");
//    }
//}

//For Q 2
//class A
//{
//    void display()
//    {
//        System.out.println("This is class A (Parent)");
//    }
//}
//class B extends A
//{
//    void displayB()
//    {
//        super.display(); // super.display() == A.display();
//        System.out.println("This is class B (Child)");
//    }
//}
//class C extends B
//{
//    void displayC()
//    {
//        super.displayB();
//        System.out.println("This is class C (GrandChild)");
//    }
//}

//For Q 3
class Animal
{
    void makesound(){
        System.out.println("Animals make sound.");
    }
}
class Dog extends Animal
{
    void makesound()
    {
        super.makesound();
        System.out.println("Bow Bow!!");
    }
}
class Cat extends Animal
{
    void makesound()
    {
        super.makesound();
        System.out.println("Meow Meow!!");
    }
}
public class Day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Solving some question
//        Q 1 :
//        Write a Java program where:
//
//        class A has a method displayA() that prints "This is class A".
//        class B inherits class A and has a method displayB() that prints "This is class B".
//                In main(), create an object of class B and call both methods.
//        B b = new B();
//        b.displayB();

//        Q 2 :
//        Create a Java program with three classes:
//
//        class A (Parent) → class B (Child) → class C (Grandchild).
//        class A has a method showA(), class B has showB(), and class C has showC().
//        In main(), create an object of class C and call all three methods.
//        C c = new C();
//        c.displayC();

//        Q 3 :
//        Write a Java program with:
//
//        class Animal (Parent) having a method makeSound().
//        class Dog and class Cat inherit Animal and override makeSound().
//        In main(), create objects of Dog and Cat and call their makeSound() methods.
//
//        Dog d = new Dog();
//        Cat c = new Cat();
//
//        d.makesound();
//        c.makesound();







    }
}
