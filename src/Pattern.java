import java.awt.font.FontRenderContext;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int v = 1;
        int f = 1;
        int x = 1;
        for (v = 1; v<7; v++){
            for (int z=7; z>=v; z--){
                System.out.print(" ");
            }
           for (f=1; f<=x; f=f+1){
               System.out.print(v);
           }
           x=x+2;
            System.out.println();
        }
    }
}
