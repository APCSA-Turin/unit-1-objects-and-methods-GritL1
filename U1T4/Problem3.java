package U1T4;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a 3 digit number: ");
        int i1 = scan.nextInt();

        int hundreds = i1 / 100;
        int tens = (i1 / 10) % 10;
        int ones = i1 % 10;

        System.out.println("The reverse of " + i1 + " is " + ones + tens + hundreds + ".");

        scan.close();
    }
}

