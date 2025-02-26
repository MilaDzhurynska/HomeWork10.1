public class SumArraysNums {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Сума всіх елементів масиву: " + sum);
    }
    /*Напишіть метод, який приймає масив цілих чисел та обчислює
   і повертає суму всіх елементів масиву.
   */
    public static int sumArraysElements(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
