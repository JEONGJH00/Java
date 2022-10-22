package test01;

class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

public class T19 {
    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println(p.getX() + " " + p.getY());
        ColorPoint cp = new ColorPoint(0, 0, "Red");
        System.out.println(cp.getX() + " " + cp.getY() + " " + cp.getColor());
    }
}//
