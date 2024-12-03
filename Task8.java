public class Task8 {
    public static boolean leapYear(int year) {
        // Если год делится на 4
        if (year % 4 == 0) {
            // Если год делится на 100
            if (year % 100 == 0) {
                // Если год делится на 400
                if (year % 400 == 0) {
                    return true; // Это високосный год
                } else {
                    return false; // Это не високосный год
                }
            } else {
                return true; // Это високосный год
            }
        } else {
            return false; // Это не високосный год
        }
    }

    public static void main(String[] args) {
        System.out.println(leapYear(2024)); // Печатает: true
        System.out.println(leapYear(1900)); // Печатает: false
        System.out.println(leapYear(2000)); // Печатает: true
        System.out.println(leapYear(2021)); // Печатает: false
    }
}
