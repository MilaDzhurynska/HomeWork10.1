public class Methods {
    public static void main(String[] args) {
        int res = numSquare(5);
        System.out.println("Квадрат числа: " + res);

        double volume = calculateCylinderVolume(2, 3);
        System.out.println("Об'єм циліндра: " + volume);

        int[] numbers = {1, 2, 3, 4, 5};
        int sumArrays = sumArraysElements(numbers);
        System.out.println("Сума всіх елементів масиву: " + sumArrays);

        String input = "Важко, вже каша в голові!";
        String reversed = reverseString(input);
        System.out.println("Оригінальний рядок: " + input);
        System.out.println("Реверсований рядок: " + reversed);
    }

    // Метод приймає ціле число як аргумент і повертає його квадрат
    public static int numSquare(int number) {
        int square = number * number;
        return square;
    }

    /* Напишіть метод, який приймає два аргументи типу double - радіус та висоту -
     і повертає об'єм циліндра. Виведіть об'єм циліндра на екран.
     */
    public static double calculateCylinderVolume(double radius, double height) {
        double CylinderVolume = Math.PI * Math.pow(radius, 2) * height;
        return CylinderVolume;
    }

    /*Напишіть метод, який приймає масив цілих чисел та обчислює
    і повертає суму всіх елементів масиву.
    */
    public static int sumArraysElements(int[] array){
        int sum = 0;
        for (int value:array){
            sum += value;
        }
        return sum;
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

