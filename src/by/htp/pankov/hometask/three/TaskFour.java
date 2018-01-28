package by.htp.pankov.hometask.three;

import java.util.Arrays;
import java.util.Random;

public class TaskFour {

    public static void main(String[] args) {

        Random random = new Random();

        int stroka = 2;
        int stolbec = 3;

        int[][] array = new int[stroka][stolbec];

        for (int i = 0; i < stroka; i++) {
            for (int j = 0; j < stolbec; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Исходный массив: ");

        for (int i = 0; i < stroka; i++) {
            for (int j = 0; j < stolbec; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(linearize(array, stroka, stolbec)));

    }

    public static int[] linearize(int[][] array, int stroka, int stolbec) {

        int[] line = new int[stroka * stolbec];

        for (int k = 0; k < line.length; k++) {
            for (int i = 0; i < stroka; i++) {
                for (int j = 0; j < stolbec; j++, k++) {
                    line[k] = array[i][j];
                }
            }
        }
        return line;
    }
}