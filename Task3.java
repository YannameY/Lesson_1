public class Task3 {
    public static void compareNumbers() {
        // Метод для сравнения двух чисел
        int a = 20; // Объявляем переменную a и присваиваем ей значение 20
        int b = 15; // Объявляем переменную b и присваиваем ей значение 15

        // Сравниваем a и b
        if (a >=b) { // Если a больше или равно b
            System.out.println("a >= b");  // Печатаем сообщение, что a больше или равно b
        } else { // Иначе
            System.out.println("a < b"); // Печатаем сообщение, что a меньше b
        }
    }

    public static void main(String[] args) {
        compareNumbers(); // Вызываем метод compareNumbers, чтобы провести сравнение

    }
}
