public class PythagoreanTriple {
    public static void main(String[] args) {
        int i;
        int j;
        int k;
        for ( i=1; i<=500; i++){
            for ( j =1; j<=500; j++){
                for (k =1; k<=500; k++){
                    if ((Math.pow(i,2) + Math.pow(j,2) == Math.pow(k,2))){

                        System.out.printf("%d\t%d\t%d\t%n", i,j,k);
                    }
                }
            }
        }
    }
}
