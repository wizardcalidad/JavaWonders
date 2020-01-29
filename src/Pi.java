public class Pi {
    public static void main(String[] args) {
        double sign = 1;
        double num = 4;
        double frac = 0;
        for (int i = 0; i<=200000; i++){
            double den = 2 * i + 1;
            if (i%2==1){
                sign = (-1);
            }
            num = num * sign;

            frac = frac + (num/den);
          //  System.out.printf("%f/%f%n",num, den);
            System.out.println(frac);
        }

        }


}
