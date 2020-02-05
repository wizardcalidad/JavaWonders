import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number: ");
        int num = sc.nextInt();
        int i =2;
        boolean check = false;
        while(i<= num/2){
            if (num%i == 0) {
                check = true;
                break;
            }

                i++;
            }
        if (check==false){
            System.out.println( num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
