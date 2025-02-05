import java.util.*;
public class Day12 {
//    For Q1
    static void mulTable(int n)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

//     For Q2
    static void printPattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int z=1;z<=i;z++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    For Q3
    int sumNthNum(int n)
    {
        int i=0,sum=0;
        while(i<=n)
        {
            sum += i;
            i++;
        }
        return sum;
    }

//    For Q4
    static void printPattern2(int n)
    {
        for (int i = 0;i<n;i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    For Q5
    static int fibo(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
//    Recursion is used here, which means the function calls itself.
//    Base case is important to stop the recursion.
//    Without it, the program would enter into infinite recursion.


//    For Q6
    static double AverageNum(int[] arr,int n)
    {
        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum += arr[i];
        }

        double result = (double) sum/ n;
        return result;
    }

    public static void main(String[] args){


//        Today I completed methods and recursion in java
//        I am solving CWH Practice Question
        Scanner sc = new Scanner(System.in);


//        Q 1 : Write a Java method to print the multiplication table of a number n.
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//        mulTable(n);

//        Q 2 : Write a program using functions to print the following pattern:
//                 *
//
//                 **
//
//                 ***
//
//                 ****
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//        printPattern(n);


//        Q 3 : Write a recursive function to calculate the sum of first n natural numbers.
//        System.out.println("Enter n number : ");
//        int n = sc.nextInt();
//        Day12 obj = new Day12();
//        System.out.println("Sum of first "+n+" natural numbers are "+obj.sumNthNum(n));


//        Q 4 : Write a function to print the following pattern:
//              ****
//              ***
//              **
//              *
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//        printPattern2(n);


//        Q 5 : Write a function to print the nth term of the Fibonacci series using recursion.
//        System.out.println("Enter nth term number : ");
//        int n = sc.nextInt();
//        int result = fibo(n);
//        System.out.println(n+"th term of fibonacci series is "+result);

//        Q 6 : Write a function to find the average of a set of numbers passed as arguments.
//        int [] arr = new int[10];
//        System.out.print("Enter how many number you want to pass : ");
//        int n = sc.nextInt();
//        System.out.println("Enter elements in array : ");
//        for(int i = 0; i < n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Average of a set of numbers passed by you is "+AverageNum(arr,n));
        
    }
}
