package by.htp.pankov.hometask.one;

import java.util.Scanner;

public class taskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double xOne;
        double xTwo;

        if (isZero(a)) {
            System.out.println("You have a rough humour!");
        }

        if (isPositive(discriminant(a, b, c)) && a != 0) {
            xOne = (- b + Math.pow( discriminant(a, b, c), 0.5) ) / (2 * a);
            xTwo = (- b - Math.pow( discriminant(a, b, c), 0.5) ) / (2 * a);
            System.out.println("The equation has two decisions.");
            System.out.println("xOne = " + xOne);
            System.out.print("xTwo = " + xTwo);
        }

        if (isZero(discriminant(a, b, c)) && a != 0) {
            xOne = (- b) / (2 * a);
            xTwo = xOne;
            System.out.println("The equation has two identical decisions");
            System.out.println("xOne = " + xOne);
            System.out.print("xTwo = " + xTwo);
        }

        if (!(isPositive(discriminant(a, b, c) ) ) ) {
            System.out.println("Both decisions are complex numbers and you can solve this equation yourself.");
        }
    }

    public static boolean isPositive (double a) {
        return a > 0;
    }

    public static boolean isZero (double a) {
        return a == 0;
    }

    public static double discriminant (double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}
