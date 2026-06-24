import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        long n = sc.nextLong();
        System.out.print("enter which no occurrence is to find : ");
        int find = sc.nextInt();
        int count = 0;

        while (n > 0) {
            long temp = n % 10; // gives the last digit of the number
            if (find == temp) { // checks the desired no
                count++; // occurrence coutning
            }
            n = n / 10; // removes the last no eg 123/10 = 12.3 and only intergeter is counted no next
                        // no to go in loop is 12

        }
        System.out.println("number is occurrered : " + count);

    }
}
