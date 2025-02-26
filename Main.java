public class Main {
    public static void main(String[] args) {
        CalculateSquare.numSquare(6);
        System.out.println("1. Квадрат числа: " + CalculateSquare.numSquare(6));

        CylinderVolume.calculateCylinderVolume(4,5);
        System.out.println("2. Об'єм циліндра: " + CylinderVolume.calculateCylinderVolume(4,5));

        int[] numbers = {2, 2, 2, 2};
        SumArraysNums.sumArraysElements(numbers);
        System.out.println("3. Сума всіх елементів масиву: " + SumArraysNums.sumArraysElements(numbers));

        String input = "Важко, вже каша в голові!";
        ReverseString.reverseString("Важко, вже каша в голові!");
        System.out.println("4. Оригінальний рядок: " + input);
        System.out.println("   Рядок в зворотньому порядку: " + ReverseString.reverseString("Важко, вже каша в голові!"));

        ExponentiationNums.exponentiation(3,3);
        System.out.println("5. Результат a^b = " + ExponentiationNums.exponentiation(3,3));

        TextRepeater.repeatText(5, "В мене вийшло!");
    }

}

