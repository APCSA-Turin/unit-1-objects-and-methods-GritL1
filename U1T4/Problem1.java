package U1T4;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scan.nextLine();

        System.out.println("Welcome " + name);

        System.out.println("Please enter the first integer:");
        int i1 = scan.nextInt();

        System.out.println("Please enter the second integer:");
        int i2 = scan.nextInt();

        System.out.println("Please enter the third integer:");
        int i3 = scan.nextInt();

        System.out.println("The average of " + i1 + ", " + i2 + ", and " + i3 + " is "+ ((i1 + i2 + i3) / 3));

        scan.close();
    }
}

