package by.htp.pankov.hometask.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskThree {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество дней");

        int day = Integer.parseInt(reader.readLine());
        int sumRainfall = 0;
        int maxRainfall = 0;
        int averageRainfall;

        System.out.println("Количество дней: " + day);

        System.out.println("Введите количество осадков по дням");

        for (int i = 1; i <= day; i++) {

            int rainfall = Integer.parseInt(reader.readLine());

            if (rainfall > maxRainfall) {

                maxRainfall = rainfall;
            }

            sumRainfall += rainfall;
        }

       averageRainfall = isAverageRainfall(day, sumRainfall);

        System.out.printf("Сумма осадков за %d дней = %d \nСреднее количество осадков = %d\n", day, sumRainfall, averageRainfall);
        System.out.printf("Максимальное количество осадков = %d", maxRainfall);

    }

    private static int isAverageRainfall(int day, int sumRainfall) { return (sumRainfall / day); }

}