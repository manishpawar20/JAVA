import java.util.Scanner;

public class Day11 {
    static int sum(int... arr)
    {
        int res=0;
        for(int a: arr)
        {
            res += a;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        Today i am learning varargs
//        So it is like an array lets see some problems

//        1 Q : Sum of Numbers (Using Varargs)
//        Write a method sum(int... numbers) that takes a variable number of integers and returns their sum.

        int [] num = new int [10];
        System.out.println("Enter how many elements you want to sum : ");
        int n = sc.nextInt();
        System.out.println("Enter maximum "+n+" elements : ");
        for(int i = 0;i<n;i++)
        {
            num[i] = sc.nextInt();
        }

        System.out.println("After adding all of them and answer is "+sum(num));

    }
}
