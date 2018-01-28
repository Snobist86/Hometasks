package by.htp.pankov.hometask.five;

public class Rectangle {

    private Point pointOne;
    private Point pointTwo;


    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Rectangle(Point pointOne, Point pointTwo) {
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    public int squareRectangle() {
        return getLenght()* getHeight();
    }

    private int getValue(int valueOne, int valueTwo) {
        return Math.abs(valueOne - valueTwo);
    }

    private int getLenght (){
        return getValue(pointOne.getCoordinateX(), pointTwo.getCoordinateX());
    }

    private int getHeight (){
        return getValue(pointOne.getCoordinateY(), pointTwo.getCoordinateY());
    }

    public double getDiagonal (){
        double length = (double) getLenght();
        double height = (double) getHeight();

        return Math.sqrt((Math.pow(length, 2)+ Math.pow(height,2)));
    }


}