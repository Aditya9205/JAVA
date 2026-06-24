import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();

        while (n > 0) {
            int temp = n % 10; // in temp last digit of the no is stored
            System.out.print(temp + " "); // no get printed
            n = n / 10; // that particular no. is removed and new no is added in a for eg : 123/10 =
                        // 12.3 ; new no. = 12

        }

    }

}
