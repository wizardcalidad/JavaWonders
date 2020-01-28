public class NumberTriangleTwo {
        public static void main(String[] args) {
            int space = 6;
            for (int i = 1; i<=6; i++){
                for (space=6; space >= i; space--){
                    System.out.print(" ");
                }
                for (int j =1; j<=i; j++ ){
                    System.out.print(i-j+1);
                }
                for (int c =2; c<= i; c++){
                    System.out.print(c);
                }
                System.out.println();
            }

        }

}
