package by.htp.pankov.hometask.one;

import java.util.Scanner;

public class taskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lenthHouseOne = scanner.nextInt();
        int widthHouseOne = scanner.nextInt();
        int lenthHouseTwo = scanner.nextInt();
        int widthHouseTwo = scanner.nextInt();

        final int e = 15;
        final int f = 10;

        if ((lenthHouseOne <= 0) || (widthHouseOne <= 0) || (lenthHouseTwo <= 0) || (widthHouseTwo <= 0)) {
            System.out.println("Are you stuped?");
        }

        if (((lenthHouseOne * widthHouseOne) + (lenthHouseTwo * widthHouseTwo)) <= (e * f)) {
                if ((((lenthHouseOne + lenthHouseTwo) <= e) && (widthHouseOne <= f) && (widthHouseTwo <= f))
                        || (((lenthHouseOne + lenthHouseTwo) <= f) && (widthHouseOne <= e) && (widthHouseTwo <= e))
                        || (((widthHouseOne + widthHouseTwo) <= e) && (lenthHouseOne <= f) && (lenthHouseTwo <= f))
                        || (((widthHouseOne + widthHouseTwo) <= f) && (lenthHouseOne <= e) && (lenthHouseTwo <= e))) {
                    System.out.println("Houses can be built on this area");
                } else {
                    System.out.println("Houses can't be built on this area");
                }
            } else {
                System.out.println("Houses can't be built on this area");
            }
        }
    }
