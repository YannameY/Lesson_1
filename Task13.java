public class Task13 {
    public static void main(String[] args) {
        // Длина массива и начальное значение
        int len = 5;
        int initialValue = 10;
        int [] array = createArray(len, initialValue); // Создаем массив

        // Печатаем массив
        for (int i =0; i < array.length; i++) {
            System.out.println(array[i] + " ");  // Выводим каждое значение
        }

    }
    // Метод для создания массива
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len]; // Создаем массив заданной длины

        for (int i = 0; i<len; i++) { // Заполняем массив значением initialValue
            array[i] = initialValue;
        }
        return array; // Возвращаем заполненный массив
    }
}
