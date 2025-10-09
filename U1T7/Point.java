package U1T7;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(int p){
        x = p;
        y = p;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public String coordinate(){

        return "(" + x + "," + y + ")";
    }

    public String quadrant(){
        String var = "";
        if (x > 0 && y > 0){
            var = "I";
        } else if (x < 0 && y > 0){
            var = "II";
        } else if (x < 0 && y < 0){
            var = "III";
        } else if (x > 0 && y < 0){
            var = "IV";
        } else if (x == 0 && y == 0){
            var = "origin";
        } else if (x == 0 || y == 0){
            var = "on an axis";
        }

        return var;
    }
}
