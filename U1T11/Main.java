package U1T11;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Abby", "Smith", 2023);
        student.addTestScore(95);
        student.addTestScore(98);
        student.printStudentInfo();
        System.out.println(student.getStudentInfo());
    }
}
