package U1T5Lab2;
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type in a decimal between 100.00 and 999.99 with up to 2 decimals: ");
        double origin = scan.nextDouble();
        
        origin = origin * 100;
        
        int hund = 1 + (int) (origin / 10000) % 10;
        int tens = 1 + (int) (origin / 1000) % 10;
        int ones = 1 + (int) (origin / 100) % 10;
        int tenths = 1 + (int) (origin / 10) % 10;
        int hundths = 1 + (int) (origin % 10);

        if (hund == 10){
            hund = 0;
        }
        if (tens == 10){
            tens = 0;
        }
        if (ones == 10){
            ones = 0;
        }
        if (tenths == 10){
            tenths = 0;
        }
        if (hundths == 10){
            hundths = 0;
        }

        System.out.print("The adjusted number is: ");
        System.out.print(hund);
        System.out.print(tens);
        System.out.print(ones);
        System.out.print(".");
        System.out.print(tenths);
        System.out.println(hundths);

        scan.close();
    }

}
