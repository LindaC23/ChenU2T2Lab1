public class Point {
    // instance variables
    private int x;
    private int y;

    // constructor that accepts both instance variables
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    // constructor that accepts only one value
    public Point(int z){
        x = z;
        y = z;
    }

    // constructor with no value, sets x and y to 0
    public Point(){
        x = 0;
        y = 0;
    }

    // getter method for x
    public int getX(){
        return x;
    }

    // getter method for y
    public int getY(){
        return y;
    }

    // setter method for x
    public void setX(int newX){
        x = newX;
    }

    // setter method for y
    public void setY(int newY){
        y = newY;
    }

    // method that returns the x and y value as a String coordinate in the format "(x,y)"
    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }

    public String quadrant(){

    }
}

