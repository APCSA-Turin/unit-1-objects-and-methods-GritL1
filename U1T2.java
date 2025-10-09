/* today and tomorrow's temperature 
*/

public class U1T2 {
    public static void main(String[] args){
        final int NUMBER = 32; //Constant variable for conversion
        double decimal;
        boolean trueOrFalse = true;
        String words = "This is very ";
        int tempC = 25;

        decimal = 1.8;
        System.out.println("Todays temperature is " + tempC * decimal + NUMBER); 
        tempC = 20;
        System.out.println("Tomorrow it will be " + tempC * decimal + NUMBER);
        if (tempC < 40){
            System.out.println(words + trueOrFalse + ".");
        } else {
            System.out.println(words + "False.");
        }
        
    }
}
