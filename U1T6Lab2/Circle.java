package U1T6Lab2;

public class Circle {
   private double radius;

   public Circle(double rad){
        radius = rad;
   }

   public void area() {
        System.out.println("A circle with a radius of " + radius + " has an area of " + radius * radius * Math.PI);
   }
}
