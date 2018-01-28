package by.htp.pankov.hometask.two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskOne {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int num = number;
        int sum = 0;

        for (int i = 1; num > 0; i++) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("Сумма цифр числа " + number + " = " + sum);
    }
}
