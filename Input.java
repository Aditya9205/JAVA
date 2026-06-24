import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("please enter some input : ");
        Scanner input = new Scanner(System.in);
        // int a = input.nextInt(); // takes the number
        // System.out.println("your number is : " + a);

        String name = input.next(); // next prints everything before the first space for eg : hey hello : it will
                                    // print only hey
        System.out.println(name);

        System.out.print("please enter some input : ");
        Scanner sc = new Scanner(System.in);
        // nextLine prints the whole sentenc.
        String name1 = sc.nextLine();
        System.out.println(name1);

    }

}
