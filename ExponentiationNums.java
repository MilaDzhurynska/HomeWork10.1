public class ExponentiationNums {
    public static void main(String[] args) {
        int pow = exponentiation(2, 3);
        System.out.println("Результат a^b = " + pow);
    }

    /* Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b
    (a підняте до степеня b).
     */
    public static int exponentiation(int a, int b) {
        return (int) Math.pow(a, b); // приводимо до int, бо за замовчуванням йде double
    }
}
