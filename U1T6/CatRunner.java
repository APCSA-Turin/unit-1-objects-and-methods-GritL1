public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Luca", 8, 25);
        Cat cat2 = new Cat("Orange", 3, 15);
        
        cat1.introduce();
        cat1.printCatInfo();

        cat2.printCatInfo();
        cat2.introduce();
        
    }
}
