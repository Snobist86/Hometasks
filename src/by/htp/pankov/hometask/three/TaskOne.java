package by.htp.pankov.hometask.three;

import java.util.Arrays;
import java.util.Random;

public class TaskOne {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        System.out.println("Двинутый массив: " + Arrays.toString(getTransfer(numbers)));
    }

    public static int [] getTransfer(int[] numbers) {

        int[] numberPlus = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (i == numbers.length - 1) {
                numberPlus[0] = numbers[i];
            } else {
                numberPlus[i + 1] = numbers[i];
            }
        }

        for (int i = 0; i < numberPlus.length; i++) {
            numbers[i] = numberPlus[i];
        }
        return numbers;
    }
}
