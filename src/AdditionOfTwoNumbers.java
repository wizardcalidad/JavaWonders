import java.util.Scanner;
public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any two number: ");
        int num = sc.nextInt();

        do {
            int x = num/10;
            int y = num%10;

            int Sum = x + y;

            System.out.println("The sum of the numbers is " + Sum);

            System.out.println();
            System.out.print("Enter another pair of numbers or 0 to terminate: ");
            num = sc.nextInt();
            System.out.println();

        } while (num != 0);


    }
}
