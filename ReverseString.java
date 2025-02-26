public class ReverseString {
    public static void main(String[] args) {
        String input = "ab";
        String reversed = reverseString(input);
        System.out.println("Оригінальний рядок: " + input);
        System.out.println("Рядок в зворотньому порядку: " + reversed);
    }
        /* Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок,
     який складається з букв цього рядка у зворотньому порядку.
     */
        public static String reverseString(String str) {
            char[] charArray = str.toCharArray(); // Перетворюємо рядок у масив символів
            String reversed = ""; // Результуючий рядок

            for (int i = charArray.length - 1; i >= 0; i--) {
                reversed += charArray[i]; // Додаємо символ до нового рядка
            }
            return reversed;
        }
    }
