public class Task2 {
    // Метод для определения и печати цвета в зависимости от значения
    public static void printColor() {
        int value = 1000; // Объявляем переменную value и присваиваем ей значение 1000

        // Проверяем значение переменной value и определяем цвет
        if (value <= 0) { // Если value меньше или равно 0
            System.out.println("Красный"); // Печатаем "Красный"
        } else if (value > 0 && value <= 100) { // Если value больше 0 и меньше или равно 100
            System.out.println("Желтый"); // Печатаем "Желтый"
        } else {
            System.out.println("Зеленый "); // Печатаем "Зеленый"

        }
    }

    public static void main(String[] args) {
        printColor(); // Вызываем метод printColor для вывода цвета

    }
}

