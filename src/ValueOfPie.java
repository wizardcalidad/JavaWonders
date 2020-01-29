public class ValueOfPie {
    public static void main(String[] args) {
       int i =1;
       int n =1;
        double negativePi =1.0;
        double positivePi =1.0;
        int pi = 4;
        while (i<=200000){
            switch(pi){
                case 1:
                    negativePi = -(4/i);
                    i+=2;
                    break;
                case 2:
                    positivePi = + (4/i);
                    break;
                default:
                    pi = 4;
                    break;
            }

            double valueOfPi  = (double) (pi + negativePi + positivePi);
            System.out.println(valueOfPi);
        }

    }
}
