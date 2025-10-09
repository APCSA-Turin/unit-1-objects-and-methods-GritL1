/* This code SHOULD print out "The number of books is 10"
   but there are two compiler errors that prevent compilation.
   Find and fix the errors.
*/
public class DebugMe {
   public static void main(String[] args) {

     // this code SHOULD print out "Number of trees in the park: 20"
     int treeCount;
     treeCount = 20;
     System.out.println("Number of trees in the park: " + treeCount);

     // this code SHOULD print out "Number of runners in the park: 5"
     int runnerCount;
     runnerCount = 5;
     System.out.println("Number of runners in the park: " + runnerCount);
     
     // this code SHOULD print out "Average pace of runners: 6.25"
     double runnerPace;
     runnerPace = 6.25;
     System.out.println("Average pace of runners: " + runnerPace);
   }
}

