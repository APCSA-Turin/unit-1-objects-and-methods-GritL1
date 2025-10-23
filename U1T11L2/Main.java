package U1T11L2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int numWords = 1;


        System.out.println("Enter first word: ");
        String last = scan.nextLine();

        while (score < 50) {
            System.out.print("Enter next word: ");
            String current = scan.nextLine();

            if (last.equals(current)){
                score -= 10;
                System.out.println("-10 points: current word matches previous word; Score: " + score);
                
            }
            if (last.compareTo(current) > 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; Score: " + score);
                
            }
            if (last.compareTo(current) < 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; Score: " + score);
                
            }

            String lLs = last.substring(last.length() - 2);
            String fLs = current.substring(0, 2);

            if (fLs.equals(lLs)) {
               score += 5;
               System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }

            String fL = last.substring(0, 1);
            if (current.indexOf(fL) != -1) {
               score += 3;
               System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }

            last = current;
            numWords ++;
        }
        System.out.println("You win! It took you " + numWords + " words! Try again to get a better score!");
    }   
        
}

