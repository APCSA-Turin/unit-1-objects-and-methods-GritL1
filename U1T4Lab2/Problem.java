package U1T4Lab2;
import java.util.Scanner;
public class Problem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int i1 = scan.nextInt();
        System.out.println("Please enter the number you want to do math operators with: ");
        double i2 = scan.nextDouble();

        double x = i1;
        x += i2;
        double x2 = i1;
        x2 -= i2;
        double x3 = i1;
        x3 *= i2;

        double x4 = i1;
        if (i2 == 0){
            System.out.println("Cannot divide by zero! Giving you the result for -1 and 1 instead.");
            double y = i2;
            double xx = x4;
            y++;
            x4 /= y;
            System.out.println("The number you entered / 1 is " + x4);
            double y2 = i2;
            y2--;
            xx /= y2;
            System.out.println("The number you entered / -1 is " + xx);
        } else {
            System.out.println("The number you entered / the 2nd number is " + x4);
        }
        double x5 = i1;
        x5 %= i2;

        System.out.println("The number you entered + the 2nd number is " + x);
        System.out.println("The number you entered - the 2nd number is " + x2);
        System.out.println("The number you entered * the 2nd number is " + x3);
        System.out.println("The number you entered % the 2nd number is " + x5);
        scan.close();
    }
}