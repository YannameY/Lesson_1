public class Task7 {
    // Это метод, который принимает строку (text) и число (times)
    public static void printString(String text, int times) {

        for (int i = 0; i < times; i++) { // Здесь мы используем цикл for, чтобы повторить действие
            System.out.println(text); // Печатаем текст каждый раз, когда выполняется цикл
        }
    }
    public static void main(String[] args) {
        printString("Hello world",3); // Здесь мы вызываем наш метод printString
    }
}
