public class Task11 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        // Проходим по массиву
        for (int i = 0; i < array.length; i++) {
            if (array[i] <6) {
                array[i] = array[i] * 2; // Умножаем на 2

            }
            for (int num : array) {
                System.out.print(num + " "); // Печатаем
        }
    }
}
}