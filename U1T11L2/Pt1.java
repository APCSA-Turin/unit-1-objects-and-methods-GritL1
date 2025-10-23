package U1T11L2;
import java.util.Scanner; 

public class Pt1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String one = scan.nextLine();
        System.out.println("Enter second string: ");
        String two = scan.nextLine();
        if (one.equals(two)){
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are NOT equal");
            if (one.compareTo(two) < 0) {
                System.out.println(one + " comes before " + two + " alphabetically.");
            } else if (one.compareTo(two) > 0) {
                System.out.println(two + " comes before " + one + " alphabetically.");
            } 
        } 
    }
}
