public class Reciept {
    public static void main(String[] args) {
        double aC = .6;
        double pC = 3.59;
        double rC = 4.40925 * 1.39;
        int NumbOfA = 3;
        int NumbOfP = 2;
        int NumbOfR = 1;
        double cashG = 20;
        

        double NumbOfItems = NumbOfA + NumbOfP + NumbOfR;
        double totalCost = (aC * NumbOfA) + (pC *NumbOfP) + (rC * NumbOfR);
        double averageCost = totalCost / NumbOfItems;
        double change = cashG - totalCost;

        System.out.println("Customer: Stacey");
        System.out.println("Number of items: " + NumbOfItems);
        System.out.println("Total cost: " + totalCost);
        System.out.println("Average cost: " + averageCost);
        System.out.println("");
        System.out.println("Cash Tendered: " + cashG);
        System.out.println("Change recieved " + change);


    }
}
