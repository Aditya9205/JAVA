import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // float num = sc.nextInt(); // this can convert int into float as a type
        // casting the LHS datatype > RHS datatype
        // System.out.println(num);

        // type casting
        // int num1 = (int) (67.89f);
        // System.out.println(num1);
        // result = 67

        // automatic type promotion in expressions
        // int a = 257; // byte can only upto 256
        // byte b = (byte) (a); // here it stores 257 % 256 = 1
        // System.out.println(b); // result =1
        // byte a = 10;
        // byte b = 20;
        // byte c = 30;
        // int d = a + b / c;
        // // a*b = 2000 here but bytes can store upto 256 but here java automatically
        // increase storage of bytes as operation is performed in integer
        // System.out.println(d);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        System.out.println((f * b) + ", " + (i / c) + ", " + (d * s));
        // output = float , integer , double
        System.out.println(result);
        // entire result is converted into double as the biggest datatype is double here

    }

}
