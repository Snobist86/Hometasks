package by.htp.pankov.hometask.five;

public class Main {

    public static void main(String[] args) {

        Point pointOne = new Point(10,10);
        Rectangle figure = new Rectangle(pointOne, new Point(5,5));

        System.out.println(figure.squareRectangle());
        System.out.println(figure.getDiagonal());

        System.out.printf("Square of the rectangle is %s", figure.squareRectangle());
        System.out.printf("\nDistance to point is %s", pointOne.distance());

    }
}
