package by.htp.pankov.hometask.two;

public class TaskTwoDotOne {
    public static void main(String[] args) {

        int maxFibNumber = 500;
        int fibNumber = 0;
        int nextFibNumber = 1;

        System.out.print(fibNumber + " ");

        while (nextFibNumber < maxFibNumber) {

            System.out.print(nextFibNumber + " ");

            nextFibNumber = fibNumber + nextFibNumber;

            fibNumber = nextFibNumber - fibNumber;

        }
    }
}
