public class ValueOfPie {
    public static void main(String[] args) {

        for (int n =1; n<=200; n+=2){
           double pi = 0.0;
           if (n == -1){
               switch (n){
                   case 1:
                       pi = pi - (4 / n);
                       break;
                   case 0:
                       pi = pi + (4 / n);
                       break;
                   default:
                       pi = pi;
                       break;
               }
               System.out.println(pi);
           }
        }

    }
}
