public class TextRepeater {
    public static void main(String[] args) {
        repeatText(2, "бла бла бла");
    }
    /*Напишіть метод, який приймає параметри: ціле число n і рядок text.
    Метод повинен вивести текстовий рядок text n рази,
    розділяючи кожен рядок символом переносу.
     */
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}