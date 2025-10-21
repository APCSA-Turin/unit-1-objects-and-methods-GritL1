package U1T11L1;
import java.util.Scanner;

public class Pt1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String one = scan.nextLine();
        System.out.println("Enter second string: ");
        String two = scan.nextLine();
        if (one.equals(two)){
            System.out.println("Both strings have the same length");
        } else if (one.length() > two.length()){
            System.out.println(one + " is longer");  
        } else {
            System.out.println(two + " is longer"); 
        }
        System.out.println("First half: " + one.substring(0, (one.length() / 2)));
        System.out.println("Second half: " + one.substring((one.length() / 2), one.length()));
        System.out.println("First half: " + two.substring(0, (two.length() / 2)));
        System.out.println("Second half: " + two.substring((two.length() / 2), two.length()));
        if (one.indexOf(two) == -1){
            System.out.println(two + " is NOT found in " + one);
        } else {
            System.out.println(two + " is found in " + one + " at index " + one.indexOf(two));
        }
    }
}