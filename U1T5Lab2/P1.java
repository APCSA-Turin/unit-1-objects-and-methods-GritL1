package U1T5Lab2;
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first test score: ");
        double i1 = scan.nextDouble();
        System.out.print("Please enter the second test score: ");
        double i2 = scan.nextDouble();
        System.out.print("Please enter the third test score: ");
        double i3 = scan.nextDouble();
        System.out.print("Please enter the fourth test score: ");
        double i4 = scan.nextDouble();

        double average =  (i1 + i2 + i3 + i4) / 4;
        System.out.println("The average is " + average);
        int roundedAverage = (int) (average / 1) + 1;
        roundedAverage = Math.round(roundedAverage);
        if (roundedAverage >= 65){
            System.out.println("The rounded average is " + roundedAverage + " which is passing");
        } else {
            System.out.println("The rounded average is " + roundedAverage + " which is failing");
        }
    
        scan.close();
    }

}


  
        

        

       

        
 