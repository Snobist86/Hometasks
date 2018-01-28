package by.htp.pankov.hometask.five;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void print() {
        System.out.println("Координата Х: " + coordinateX + "\nКоордината Y: " + coordinateY);
    }

    public double distance() {

        int squareX = (int) Math.pow(coordinateX, 2);
        int squareY = (int) Math.pow(coordinateY, 2);

        return Math.pow((squareX + squareY), 0.5);
    }

}
