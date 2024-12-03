public class Task10 {
    public static void main(String[] args) {
        // Создаем массив длиной 100
        int[] array = new int[100];

        // Заполняем массив числами от 1 до 100
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1; // Устанавливаем значение
        }
        // Выводим числа
        for (int num : array) {
            System.out.print(num + " "); // Печатаем каждое число
        }
    }
}
