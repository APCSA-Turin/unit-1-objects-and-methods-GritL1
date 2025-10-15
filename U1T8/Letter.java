package U1T8;

public class Letter {
    private String var;

    
    public Letter(String name) { 
        var = name;
    }
    
    public void writeLetter(String name){
        greeting(name);
        specialMessage();
        closing();
        System.out.println("From, " + var + "!");
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }

}
