package U1T6_Return;

public class Main {
    public static void main(String[] args) {
        ChatBot bot = new ChatBot("BoB",13);
        bot.greeting("Grit");
        bot.weather();
        System.out.println(bot.convertFeetToMeters(10));
        bot.favoriteNumber(14);
        System.out.println(bot.addNumbers(2, 3, 4));
        System.out.println(bot.goodbye());
        System.out.println(bot.question("happy"));
        bot.divisible(16);
        System.out.println(bot.squared(5));
        System.out.println(bot.bday());
        bot.oddeven(19);
        System.out.println(bot.money(6));
    }
}
