public class HollowTriangle {
    public static void main(String[] args) {
            /*for (int i = 1; i<=10; i++){
                for (int j=10; j>=i; j--) {

                    if (i==1 || j==10) {

                        System.out.print("*");
                    }
                    else{
                       // System.out.print(" ");
                    }
                }
                System.out.println();
            }*/
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {

                if (j == i || j == 10 || i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

