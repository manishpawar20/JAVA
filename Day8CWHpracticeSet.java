import java.util.Scanner;

public class Day8CWHpracticeSet {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);

//        Q 1 : Write a program to print the following pattern :
//        ****
//        ***
//        **
//        *
//        System.out.println("How many rows : ");
//        int n = sc.nextInt();
//        for(int i = 1; i <=n;i++)
//        {
//            for (int j = 0;j <= n-i;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//        Q 2 : Write a program to sum first n even numbers using a while loop.
//        System.out.print("Enter n number: ");
//        int n = sc.nextInt();
//        int sum =0;
//        System.out.println("Even number till n are : ");
//        for (int i = 2;i<=n;i=i+2)
//        {
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println("Sum of n even numbers is "+sum);

//        Q 3 : Write a program to print the multiplication table of a given number n.
//        System.out.print("Enter a number to get the multiplication table of that : ");
//        int n = sc.nextInt();
//        This is for till n number mean n = 5 so it will display table of 1,2,3,4,5
//        for(int i = 1; i<=n; i++)
//        {
//            for(int j=1; j <= 10;j++)
//            {
//                System.out.println(i+" x "+j+" = "+i*j);
//            }
//        }
//      This is only of one specific table like n = 5 so it will display only table of 5.
//        for (int i = 1;i<=10;i++)
//        {
//            System.out.println(n+" x "+i+" = "+n*i);
//        }

//        Q 4 :  Write a program to print a multiplication table of 10 in reverse order.
//        System.out.print("Enter a number to get the multiplication table of that : ");
//        int n = sc.nextInt();
//        for (int i = 10;i>0;i--)
//        {
//            System.out.println(n+" x "+i+" = "+n*i);
//        }

//        Q 5 : Write a program to find the factorial of a given number using for loops.
//        System.out.print("Enter a number to get the Factorial of that : ");
//        int n = sc.nextInt();
//        int fac=1;
//        for(int i = 1; i <=n;i++)
//        {
//            fac = fac*i;
//        }
//        System.out.println("Factorial of  "+n+" is "+fac);


//        Q 6 : Repeat problem 5 using a while loop
//         System.out.print("Enter a number to get the Factorial of that : ");
//         int n = sc.nextInt();
//        int fac=1;
//        int i=1;
//        while(i<=n)
//        {
//            fac = fac*i;
//            i++;
//        }
//         System.out.println("Factorial of  "+n+" is "+fac);

//        Q 7 : Repeat problem 1 using for/while loop.
//        ****
//        ***
//        **
//        *
//        System.out.println("How many rows : ");
//        int n = sc.nextInt();
//        for(int i = 0; i <=n;i++)
//        {
////            for (int j = 0;j <= n-i;j++)
////            {
////                System.out.print("*");
////            }
//            int j =0;
//            while(j<n-i)
//            {
//                System.out.print("*");
//                j++;
//            }
//            System.out.print("\n");
//        }

//        Q 8 : What can be done using one type of loop can also be done using the other two types of loops - True or False.
//        Ans : True

//        Q 9 : Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
//        System.out.print("Enter a number to get the multiplication table of that : ");
//        int n = sc.nextInt();
//        int n =8;
//        int sum = 0;
//        for (int i = 1;i<=10;i++)
//        {
//            System.out.println(n+" x "+i+" = "+n*i);
//            sum = sum + n*i;
//        }
//        System.out.println("Sum of numbers occurring in the multiplication table of 8 : " + sum);


//        Q 10 : A do-while loop is executed:
//        At least once
//        At least twice
//        At most once
//        Ans : At least once

//        Q 11 : Repeat problem 2 using for loop.
//        I have already done that using for loop so i am gonna do that with while loop

//        System.out.print("Enter n number: ");
//        int n = sc.nextInt();
//        int sum =0;
//        int i = 0;
//        System.out.println("Even number till n are : ");
//        while(i<n)
//        {
//            i +=2;
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println("Sum of n even numbers is "+sum);


    }

}
