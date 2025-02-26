public class CalculateSquare {
    public static void main(String[] args) {
        int res = numSquare(5);
        System.out.println(res);
    }

    // Метод приймає ціле число як аргумент і повертає його квадрат
    public static int numSquare(int number) {
        int square = number * number;
        return square;
    }
}
