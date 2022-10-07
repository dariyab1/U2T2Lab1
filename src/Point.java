


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int value) {
        x = value;
        y = value;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public String coordinate() {
        return "(" + x + "," + y + ")";

    }

    public String quadrant() {
        String position="";
        if (y == 0) {
            position= "on x-axis";
        }
        if (x > 0) {
            if (y > 0) {
                position="I";
            }
            if (y < 0) {
                position= "IV";
            }
        } else if (x < 0) {
            if (y > 0) {
                position= "II";
            }
            if (y < 0) {
                position= "III";
            }
        } else if (x == 0) {
            if (y == 0) {
                position = "origin";
            } else {
                position = "on y-axis";
            }
        }

        return position;
    }

}

