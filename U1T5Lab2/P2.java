package U1T5Lab2;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a stock ticker symbol: ");
        String symbol = scan.nextLine();

        System.out.print("How many shares do you own: ");
        int shares = scan.nextInt();

        System.out.print("Enter the change in stock price as a positive or negative decimal: ");
        double priceChange = scan.nextDouble();

        if (priceChange < 0){
            int valueChange = (int) ((shares * priceChange) - 0.5);  
            System.out.println("Change in stock value: $" + valueChange + " dollars");
        } else {
            int valueChange = (int) ((shares * priceChange) + 0.5);
            System.out.println("Change in stock value: $" + valueChange + " dollars");
        }

        scan.close();
    }
}
