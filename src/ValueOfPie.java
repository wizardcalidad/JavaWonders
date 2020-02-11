public class ValueOfPie
{
    public static void main(String[] args)
    {
       double pi = 4.00;
        double x = 0.0;
        int d = 3;

        for(int i =1;i <= 200000; i++)
        {
            switch(i % 2)
            {
                case 0:
                    x = (4.00 / d);
                    break;
                case 1:
                    x =  (-4.00 / d);
                    break;
            }
            pi += x;
            d += 2;
        }
        System.out.println(pi);
    }
}
