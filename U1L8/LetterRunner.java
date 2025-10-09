package U1L8;

public class LetterRunner {
    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.greeting("Alfred");
        letter.specialMessage();
        letter.closing();

        letter.writeLetter("Wesley");
    }
}
