package by.htp.pankov.hometask.one;

import java.util.Scanner;

public class taskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();
        int monthNumber = scanner.nextInt();
        int yearNumber = scanner.nextInt();

        int monthNumberReserve = 1;

        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("Month is wrong and the result of the program will be incorrect");
        }

        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7
                || monthNumber == 8 || monthNumber == 10) {

            if (dayNumber > 0 && dayNumber < 31) {
                dayNumber++;
            } else {

                if (dayNumber == 31) {
                    dayNumber = 1;
                    monthNumberReserve += monthNumber;
                } else {
                    System.out.println("Day is wrong and the result of the program will be incorrect");
                }
            }
        }

        if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {

            if (dayNumber > 0 && dayNumber < 30) {
                dayNumber++;
            } else {

                if (dayNumber == 30) {
                    dayNumber = 1;
                    monthNumberReserve += monthNumber;
                } else {
                    System.out.println("Day is wrong and the result of the program will be incorrect");
                }
            }
        }

        if (monthNumber == 2) {

            if (isLeapYear(yearNumber)) {
                if (dayNumber > 0 && dayNumber < 29) {
                    dayNumber++;
                } else {
                    if (dayNumber == 29) {
                        dayNumber = 1;
                        monthNumberReserve += monthNumber;
                    } else {
                        System.out.println("Day is wrong and the result of the program will be incorrect");
                    }
                }
            } else {
                if (dayNumber > 0 && dayNumber < 28) {
                    monthNumberReserve += monthNumber;
                } else {
                    if (dayNumber == 28) {
                        dayNumber = 1;
                        monthNumberReserve += monthNumber;
                    } else {
                        System.out.println("Day is wrong and the result of the program will be incorrect");
                    }
                }
            }
        }

        if (monthNumber == 12) {
            if (dayNumber > 0 && dayNumber < 31) {
                ++dayNumber;
            } else {
                if (dayNumber == 31) {
                    dayNumber = 1;
                    monthNumberReserve = 1;
                    yearNumber++;
                } else {
                    System.out.println("Day is wrong and the result of the program will be incorrect");
                }
            }
        }

        monthNumber = monthNumberReserve;

        System.out.println("Next day will be: " + dayNumber + "." + monthNumber + "." + yearNumber);
    }

    public static boolean isLeapYear(int year) {

        return (year % 4 == 0 || !(year % 100 == 0) || year % 400 == 0);
    }
}