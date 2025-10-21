
public class Student {
    // instance variables
   private String name;
   private int grade;
   private int gpa;

   // constructor
   public Student(String student, int sGrade, int sGPA) {
       name = student;
       grade = sGrade;
       gpa = sGPA;
   }

   // method that introduces the Student
   public void introduce() {
        System.out.println("Student " + name + " is currently in " + grade + "th grade and has a grade point aveage of " + gpa);
   }

}

