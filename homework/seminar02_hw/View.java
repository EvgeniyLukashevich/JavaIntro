package homework.seminar02_hw;

import java.util.Scanner;

public class View {

    static String[] sizeMessages = new String[] { "size", "Введите размер массива: ",
            "Введите размер массива (целое число больше нуля): " };
    static String[] minMessages = new String[] { "value", "Введите наименьшее возможное значение элемента: ",
            "Введите наименьшее возможное значение элемента (целое число): " };
    static String[] maxMessages = new String[] { "value", "Введите наибольшее возможное значение элемента: ",
            "Введите наибольшее возможное значение элемента (целое число): " };

    public static boolean checkUserInput(String checkTarget, String input) throws NumberFormatException {
        try {
            Integer.parseInt(input);
            if (checkTarget != sizeMessages[0])
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
        if (Integer.parseInt(input) > 0)
            return true;
        else
            return false;
    }

    public static int inputArrayOption(String[] messages) {
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.print(messages[1]);
        String userInput = input.nextLine();
        boolean check = checkUserInput(messages[0], userInput);
        while (check == false) {
            System.out.print(messages[2]);
            userInput = input.nextLine();
            check = checkUserInput(messages[0], userInput);
        }
        option = (Integer.parseInt(userInput));
        return option;
    }

    public static void showArray(int[] array, String message) {
        System.out.println(message);
        System.out.print("| ");
        for (int index = 0; index < array.length; index++)
            System.out.print(array[index] + " | ");
    }
}
