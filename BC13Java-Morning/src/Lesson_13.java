public class Lesson_13 {
    public static void main(String[] args) {
        threeThousand();
        split();
        System.out.println(leapYear(1800));
        System.out.println(leapYear(1900));
        System.out.println(leapYear(2100));
        System.out.println(leapYear(2120));
        System.out.println(leapYear(1884));
        split();
        System.out.print(findPrimeNumbers(20));
        split();
        System.out.print(evenNumbers(20));
        split();
    }

    public static void split() {
        System.out.println("--------------");
    }

    ;

    public static void threeThousand() {
        int number = 3000;
        for (int i = 1; i < number; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.println(i);
            }
        }
    }

    //Високосный год
    public static String leapYear(int year) {
        String result = "";
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            result = year + " - високосный год";
        } else {
            result = year + " - невисокосный год";
        }
        return result;
    }

    //Простые числа
    public static String findPrimeNumbers(int lastNumber) {
        String result = "";
        for (int i = 2; i <= lastNumber; i++) {
            if (isPrime(i)) {
                result += i + " - простое число" + "\n";
            }
        }
        return result;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    //Четные числа
    public static String evenNumbers(int lastNumber) {
        String result = "";
        for (int i = 1; i <= lastNumber; i++) {
            if (isEven(i)) {
                result += i + " - четное число" + "\n";
            }
        }
        return result;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
