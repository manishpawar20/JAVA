public class Day2 {
    public static void main(String[] args) {
        //Arithmetic and Resulting Datatype Problems
//        int a = 10;
//        double b = 20.5;
//        float c = 5.5f;
//        System.out.println(a + b * c);
//        ANS : Double

//        Predict the output:
//        int x = 15;
//        int y = 4;
//        System.out.println(x / y);  // Integer division
//        System.out.println(x / (double)y);  // Explicit typecasting
//        ANS : 3
//              3.75


//          int a = 5;
//          int b = a++ + ++a + --a - a--;
//          System.out.println(a);
//          System.out.println(b);
//          After calculation:
//          a = 5
//          5+7+6-6
//          b = 12


//        Find the output of the following:
//        int x = 10;
//        x++;
//        ++x;
//        System.out.println(x--);
//        System.out.println(--x);

//        ANS : 12
//              10

//        Operator Precedence Problems
//        Predict the output of the following expression:
//        int a = 5, b = 10, c = 15;
//        int result = a + b * c / b - c % a;
//        System.out.println(result);
//        ANS : 5 + 10 * 15 / 10 - 15 % 5
//              5 + 150 / 10 - 15 % 5
//              5 + 15 - 0
//              20
//        Rearrange the following expression using parentheses to clarify operator precedence:
//        int result = 10 + 20 * 3 / 5 % 2;
//        int result = (10 + ((20 * 3) / 5) % 2); // <- rearranged and given parentheses
//        System.out.println(result);
//        ANS : 10

//        Why does the following code give a compilation error?

//        short x = 5;
//        short y = 10;
//        short z = x + y;
//        System.out.println(z);
//        ANS : Because we know that after the addition of two short literals they became a int literal .
//              So we should make the z variable an int. Corrected code is written below:
//        short x = 5;
//        short y = 10;
//        int z = x + y;
//        System.out.println(z);
    }
}
