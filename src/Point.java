public class Point {
    // variables
    private int x;
    private int y;

    // constructor that accepts 2 instances
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // constructor that accepts 1 instance, sets each to the same val
    public Point(int xy) {
        x = xy;
        y = xy;
    }

    // constructor that accepts no instances, sets it to the origin
    public Point() {
        x = 0;
        y = 0;
    }

    // "getter" method that returns x
    public int getX() {
        return x;
    }

    // "getter" method that returns y
    public int getY() {
        return y;
    }

    // "setter" method that changes x
    public void setX(int newX) {
        x = newX;
    }

    // "setter" method that changes y
    public void setY(int newY) {
        y = newY;
    }

    // method that returns the x and y
    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }

    //method that returns where the coordinate is
    public String quadrant() {
        String location;

        if (x < 0 && y > 0) {
            location = "II";
        } else if (x < 0 && y < 0) {
            location = "III";
        } else if (x > 0 && y > 0) {
            location = "I";
        } else if (x > 0 && y < 0) {
            location = "IV";
        } else if (x == 0 && y == 0) {
            location = "origin";
        } else {
            location = "on an axis";
        }

        return location;
    }
}
