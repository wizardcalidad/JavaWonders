public class NumberTriangleOne {
    public static void main(String[] args) {
        int space = 6;
        for (int i = 1; i<=6; i++){
            for (int j =1; j<=space; j++ ){
                System.out.print(" ");
            }
            for (int c =1; c<= (2 * i-1); c++){
                System.out.print(i);
            }
            space--;
            System.out.println();
        }

    }
}
