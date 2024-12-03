public class Task6 {
    // Этот метод проверяет, является ли число отрицательным
    public static boolean checkNumber(int number) {

        if (number < 0) { // Если число меньше 0, то оно отрицательное
            return true; // Возвращаем true, если число отрицательное
        } else {
            return false;// Возвращаем false, если число не отрицательное
        }
    }
    public static void main(String[] args) { // Вызываем метод checkNumber с разными числами и печатаем результат
        System.out.println(checkNumber(-3)); // Это должно вернуть true, потому что -3 отрицательное
        System.out.println(checkNumber(3)); // Это должно вернуть false, потому что 3 положительное
        System.out.println(checkNumber(0)); // Это должно вернуть false, потому что 0 не отрицательное
    }
}

