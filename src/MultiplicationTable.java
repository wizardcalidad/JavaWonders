import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number: ");
        int num = sc.nextInt();
        int i = 1;
        int m = 1;

        while(i<= 12){
            m = num * i;
            System.out.printf("%d\t * %d\t = %d%n", num, i , m );
         i++;
        }

    }
}
