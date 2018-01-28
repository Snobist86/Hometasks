package by.htp.pankov.hometask.two;

public class TaskTwoDotTwo {


    public static void main(String[] args) {

        int maxFibNumber = 100;
        int fibNumber = 0;

        for (int n = 0; n < Integer.MAX_VALUE; n++) {

            fibNumber = fibonacci(n);

            if (fibNumber > maxFibNumber) {

                break;
            }

            System.out.print(fibNumber + " ");
        }
    }


    private static int fibonacci (int fibNumber ) {

        if (fibNumber == 0) return 0;
        if (fibNumber == 1) return 1;

        return fibonacci(fibNumber - 1) + fibonacci(fibNumber - 2);

        }

    }
