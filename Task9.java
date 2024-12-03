public class Task9 {
    public static void main(String[] args) {
        // Создаем массив с элементами 0 и 1
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        // Заменяем 0 на 1 и 1 на 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1; // Заменяем 0 на 1
            } else {
                array[i] = 0; // Заменяем 1 на 0
            }
        }

        // Выводим результат
        for (int num : array) {
            System.out.print(num + " "); // Печатаем элементы массива
        }
    }
}