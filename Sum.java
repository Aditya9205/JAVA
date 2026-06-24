import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter the first no : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // takes input a

        System.out.print("Enter the second no : ");
        int b = input.nextInt(); // takes input b

        int sum = a + b;

        System.out.println("sum is : " + sum);

    }
}