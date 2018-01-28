package by.htp.pankov.hometask.three;

import java.util.Arrays;

public class TaskTwo {

    public static void main(String[] args) {

        int[] numbersDouble = {2, 10, 0, 10, 84, 63, 74, 74, 52, 2};

        System.out.println("Исходный массив\n" + Arrays.toString(numbersDouble));

        isNotDouble(numbersDouble);
        System.out.println(Arrays.toString(numbersDouble));

        System.out.println("Преобразованный массив\n" + Arrays.toString(isCheckZero(numbersDouble)));
    }

    public static int[] isNotDouble(int[] values) {

        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                continue;
            }
            for (int j = i; j < values.length; j++) {
                if (values[i] == values[j] && i != j) {
                    values[j] = 0;
                }
            }
        }
        return values;
    }

    public static int[] isShiftZeroRight(int[] values) {

        for (int i = 0; i < values.length; i++) {
            if (values[i] != 0) {
                continue;
            }
            int index = i;
            for (int j = i + 1; j < values.length - 1; j++, i++) {

                int thridGlass = values[i];
                values[i] = values[j];
                values[j] = thridGlass;
            }
            i = index;
        }
        return values;
    }

    public static int[] isCheckZero(int[] values) {

        isShiftZeroRight(values);

        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == 0) {
             isShiftZeroRight(values);
            }
        }
        return values;
    }
}