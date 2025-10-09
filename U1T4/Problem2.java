package U1T4;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1 enter your name: ");
        String name = scan.nextLine();

        System.out.print("Player 2 enter your name: ");
        String name2 = scan.nextLine();

        System.out.print("Enter your number: ");
        int i1 = scan.nextInt();

        System.out.print("Enter your number: ");
        int i2 = scan.nextInt();
        
        if (i1 > i2){
            System.out.println(name + "'s number is biggger");
        } else if (i2 > i1) {
            System.out.println(name2 + "'s number is biggger");
        } else {
            System.out.println("The numbers are equal");
        }

        scan.close();
    }
}
