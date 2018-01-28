package by.htp.pankov.hometask.four;

public class TaskTwo {

    public static void main(String[] args) {

        String romanNumber = "MMMcMXiV";
        String trueRomanNumber = romanNumber.toUpperCase();
        int arabNumber = 0;

        arabNumber = getArabNumber(trueRomanNumber);

        System.out.println("Римское число: " + trueRomanNumber + "\nАрабское число: " + arabNumber);
    }

    private static int getArabNumber(String trueRomanNumber) {

        int arabNumber = 0;

        for (int i = 0; i < trueRomanNumber.length(); i++) {

            char symbol = trueRomanNumber.charAt(i);
            int value = romanToArab(symbol);
            int number;

            if (value == -1) {
                System.out.println("Неверное значение");
            }

            if (i != trueRomanNumber.length() - 1) {

                char nextSymbol = trueRomanNumber.charAt(i + 1);
                int nextValue = romanToArab(nextSymbol);

                if (value < nextValue) {
                    number = nextValue - value;
                    i++;
                } else {
                    number = value;
                }
            } else {
                number = value;
            }

            arabNumber += number;
        }
        return arabNumber;
    }

    private static int romanToArab(char value) {

        switch (value) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
}

