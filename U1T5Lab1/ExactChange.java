package U1T5Lab1;
import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an amount in dollars and cents: ");
        double money = scan.nextDouble();
        
        money = (money * 100);
        int q = (int) money / 25;
        int money2 = (int) (money - q*25);
        int d = (int) money2 / 10;
        int money3 = (money2 - d*10);
        int n = (int) money3 / 5;
        int money4 = (money3 - n*5);
        int p = (int) money4;


        int coin_min = (q+d+n+p);


        System.out.println("The minimum number of coins is " + coin_min);
        System.out.println(q + " quarters");
        System.out.println(d + " dimes");
        System.out.println(n + " nickels");
        System.out.println(p + " pennies");

        scan.close();
    }
}