public class Lesson_14 {
    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));// → "loHi"
        System.out.println(minCat("Hello", "java"));// → "ellojava"
        System.out.println(minCat("java", "Hello"));// → "javaello"
        System.out.println(minCat("Privet", "Mir"));// → "vetMir"
        split();
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        split();
        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        split();
        System.out.println(sumDigits(123));//-> 6 (1+2+3)
        System.out.println(sumDigits(768));// -> 21 (7+6+8)
    }

    public static void split() {
        System.out.println("-----------------------");
    }

    public static String minCat(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1.substring(str1.length() - str2.length()) + str2;
        } else {
            return str1 + str2.substring(str2.length() - str1.length());
        }
    }

    public static String doubleChar(String str) {
        String result = "";
        int countChar = str.length();
        for (int i = 0; i < countChar; i++) {
            String currentChar = String.valueOf(str.charAt(i));
            result += currentChar + currentChar;
        }
        return result;
    }

    public static int loneSum(int a, int b, int c) {
        int result = 0;
        if (a != b && b != c && c != a) {
            result = a + b + c;
        } else if (a == b && b == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else {
            return a;
        }
        return result;
    }

    public static int sumDigits(int n) {
        int result = 0;
        int number = n;
        String str = String.valueOf(n);
        int lengthN = str.length();
        for (int i = 0; i < lengthN; i++) {
            int digit = number % 10;
            result += digit;
            number /= 10;
        }
        return result;
    }
}