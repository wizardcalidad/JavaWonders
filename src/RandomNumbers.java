import java.util.Scanner;
import java.security.SecureRandom;
public class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int num = 0;
        int rand = 0;

        do{
            System.out.println("Guess a number between 1 and 100: ");
            num = sc.nextInt();
            rand = random.nextInt(100);

            if (num == rand) {
                System.out.println("Yes! You're very correct! You're the NUMBER KING");
            }
            if (num < rand) {
                System.out.println("Just like a snail thinker. Too low, try again, but the correct number is "+ rand);
            }
            if (num > rand) {
                System.out.println("You're jumping like a antelope. Too high, try again!!!, but the correct number is "+ rand);
            }

        }while (num!=rand);


    }
}
