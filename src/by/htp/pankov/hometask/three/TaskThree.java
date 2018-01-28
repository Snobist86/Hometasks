package by.htp.pankov.hometask.three;

import java.util.Arrays;
import java.util.Random;

public class TaskThree {

    public static void main(String[] args) {

        Random random = new Random();

        int amtOne = (int) (Math.random() * 10 + 1);
        int amtTwo = (int) (Math.random() * 10 + 1);
        int[] numbersOne = new int[amtOne > amtTwo ? amtOne : amtTwo];
        int[] numbersTwo = new int[amtOne > amtTwo ? amtTwo : amtOne];

        for (int i = 0; i < numbersOne.length; i++) {
            numbersOne[i] = random.nextInt(100);
        }

        for (int i = 0; i < numbersTwo.length; i++) {
            numbersTwo[i] = random.nextInt(100);
        }

        System.out.println("Первый массив: " + Arrays.toString(numbersOne)
                + "\nВторой массив: " + Arrays.toString(numbersTwo));

        int[] fusion = getFusion(numbersOne, numbersTwo);

        System.out.println("Результирующий массив: " + Arrays.toString(fusion));

    }

    public static int[] getFusion(int[] numbersOne, int[] numbersTwo) {
        int[] fusion = new int[numbersOne.length + numbersTwo.length];

        int indexNumbersOne = 0;
        int indexNumbersTwo = 0;
        int indexFusion = 0;

            while (indexNumbersOne < numbersOne.length) {
                fusion[indexFusion] = numbersOne[indexNumbersOne];
                indexFusion++;
                indexNumbersOne++;

                while (indexNumbersTwo < numbersTwo.length) {
                    fusion[indexFusion] = numbersTwo[indexNumbersTwo];
                    indexFusion++;
                    indexNumbersTwo++;
                    break;
                }
            }
        return fusion;
    }
}
