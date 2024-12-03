public class Task12 {
    public static void main(String[] args) {
        int size = 5; // Определяем размер квадратного массива
        int [][] matrix = new int[size][size];  // Создаем квадратный двумерный массив

        for (int i = 0; i < size; i++) {   // Заполняем диагональные элементы единицами
            matrix[i][i] = 1;
        }
        for (int i = 0; i < size; i++) { // Проверяем и выводим массив
            for (int j = 0; j < size; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку
        }
    }
}
