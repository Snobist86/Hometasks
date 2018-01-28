package by.htp.pankov.hometask.four;

public class TaskOne {

    public static void main(String[] args) {

        String simpleString = "ArgentinaManitNegra";

        System.out.println(isPalindrom(simpleString));
    }

    public static boolean isPalindrom (String simpleString){

        boolean result = false;
        String reverseOrder = new StringBuilder(simpleString).reverse().toString();

        if (reverseOrder.compareToIgnoreCase(simpleString) == 0){
            result = true;
        }

        return result;
    }
}
