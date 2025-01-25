import java.util.Scanner;
public class Day3 {
    public static void main(String[] agrs){
//        Today solving some question on string .
//        Before that remember, String is a class in JAVA, but we can use string as a primitive datatype.
//        Note That !!
//        A String is a sequence of characters and string is immutable that means it is unchangeable.
//        Lets start some Question!

        Scanner sc = new Scanner(System.in);

//        Q 1 : Write a program to find the length of the following string using the .length() method:
//        System.out.print("Enter a String : ");
//        String a = sc.next();
//        int len = a.length();
//        System.out.println("Your entered string : "+a+"\nLength of string : "+len);


//        Q 2 : Write a program to convert the string to uppercase using .toUpperCase():
//        System.out.print("Enter a String : ");
//        String a = sc.next();
//        String newA = a.toUpperCase();
//        System.out.printf("Your enter string : %s\nUpperCase string : %s",a,newA); //Refer the last of this file to know more.


//        Q 3 : Write a program to convert the string to lowercase using .toLowerCase():
//        System.out.print("Enter a String : ");
//        String a = sc.next();
//        String newA = a.toLowerCase();
//        System.out.printf("Your enter string : %s\nLowerCase string : %s",a,newA);


//        Q 4 : Write a program to remove leading and trailing whitespace from the string using .trim():
//        System.out.print("Enter a String to trim the spaces : ");
//        String a = sc.nextLine();//sc.nextLine(); To take input with space nor it will jst take till the user enter space.
//        String trimmed = a.trim();
//        System.out.println("Actual String : "+a+"\nTrimmed string : "+trimmed);


//        Q 5 : Write a program to extract the substring "Programming" from the string using .substring():
//        Given String : String str = "Java Programming is fun";
//        String str = "Java Programming is fun";
//        String newStr = str.substring(5,16);
//        System.out.println(newStr);
/*
* //For this
* I counted the index number of String and
* I get to know that programming comes on
* index 5 to 15 but we have to take 16 because
* substring() function need start index and end index
* but it exclude the end index so we take 16
* then it will include 15 neither the  g will not print
*/


//        Q 5 : Write a program to replace all occurrences of the letter 'a' with '@' in the following string using .replace():
//        Given String : String str = "Java Programming Language";
//        String str = "Java Programming Language";
//        String newStr = str.replace('a','@');
//        System.out.println(newStr);

//        Output : J@v@ Progr@mming L@ngu@ge


//        Q 6 : Write a program that takes the following string and performs these operations:
//              Trim the whitespace.
//              Convert the trimmed string to uppercase.
//              Replace 'A' with '*'.
//              Given String : String str = "  java string methods  ";
//        String str = "  java string methods  ";
//        String newStr = str.trim();
//        newStr = newStr.toUpperCase();
//        newStr = newStr.replace('A','*');
//        System.out.println(newStr);

//      Output : J*V* STRING METHODS

//        Q 7 : Write a program to check if the string "Java Programming" (case-insensitive) matches "JAVA PROGRAMMING" after converting both to lowercase.
//        String s1,s2;
//        s1 = "Java Programming";
//        s2 = "JAVA PROGRAMMING";
//        String newS1 = s1.toLowerCase();
//        String newS2 = s2.toLowerCase();
//
//        if(newS1.equals(newS2))//We learned new String function
//        {
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }

//        Some remaining function tomorrow

    }
}


/* TODAY I HAVE LEARNED THAT
* System.out.printf() and System.out.format()
* is like c
* which means that we can you format specifiers
* for int -> %d
* float and double -> %f
* char -> %c
* string -> %s
* */
