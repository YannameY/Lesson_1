public class Task4 {
    // Этот метод проверяет, находится ли сумма двух чисел в диапазоне от 10 до 20
    public static boolean checkSumSingn(int a, int b) {
        int sum = a + b;
        // Проверяем, находится ли сумма в диапазоне от 10 до 20
        if (sum >= 10 && sum <= 20) {  // Условие: сумма должна быть больше или равна 10 и меньше или равна 20
            return true; // Если да, возвращаем true
        } else {
            return false; // Если нет, возвращаем false
        }
    }

    public static void main(String[] args) {
        // Вызываем метод checkSumSingn с разными парами чисел и печатаем результат
        System.out.println(checkSumSingn(5,7)); // true (5 + 7 = 12)
        System.out.println(checkSumSingn(10,15)); // false (10 + 15 = 25)

    }
}
