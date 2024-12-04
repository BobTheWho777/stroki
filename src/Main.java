import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }

    public static int calculateSumOfDigits(String input) {
        int sum = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }
    public static String findLongestString(String[] array) {
        if (array == null || array.length == 0) {
            return null; // Возвращаем null, если массив пустой или равен null
        }

        String longest = array[0]; // Начинаем с первого элемента

        for (String str : array) {
            if (str.length() > longest.length()) {
                longest = str; // Обновляем longest, если найдено более длинное слово
            }
        }

        return longest;
    }
    public static String reverseString(String input) {
        if (input == null) {
            return null; // Проверка на null
        }

        StringBuilder reversed = new StringBuilder(); // Используем StringBuilder для построения строки

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i)); // Добавляем символы с конца к началу
        }

        return reversed.toString(); // Преобразуем StringBuilder в строку и возвращаем
    }
}