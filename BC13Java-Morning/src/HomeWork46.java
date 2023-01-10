import java.util.Arrays;

public class HomeWork46 {
    public static void main(String[] args) {
        // создаём массив
        // заполняем массив
        // распечатываем массив
        //создать копию
        // сортируем копию массива bubbleSort
        // распечатываем
        //сортируем копию CocktailSort
        // распечатываем
        //сортируем копию первоначального массива CombSort
        char[] myArray = createCharArray(40);
        System.out.println("Оригинал массива " + "\n" + Arrays.toString(myArray));
        createCharArray(40);
        char[] newArray = myNewCopyArray(myArray);
        System.out.println("Копия массива    " + "\n" + Arrays.toString(newArray));
        System.out.println("Это bubbleSort копии массива               " + "\n" + Arrays.toString(bubbleSort(newArray)));
        System.out.println("CocktailSort копии первоначального массива " + "\n" + Arrays.toString(cocktailSort(myArray)));
        System.out.println("CombSort копии первоначального массива     " + "\n" + Arrays.toString(combSort(myArray)));
    }

    private static char[] combSort(char[] arr) {
        final double FACTOR = 1.24733095;
        int step = arr.length;
        while (step > 1) {
            boolean swapped = false;
            step = (int) (step / FACTOR);
            for (int i = 0; step + i < arr.length; i++) {
                if (arr[i] > arr[i + step]) {
                    swap(arr, i, i + step);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    private static void swap(char[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = (char) temp;
    }

    public static char[] cocktailSort(char[] array) {
        char start = 0;
        char end = (char) (array.length - 1);
        while (start <= end) {
            boolean swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    char temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i] < array[i - 1]) {
                    char temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            start++;
            if (!swapped) {
                break;
            }
        }

        return array;
    }

    public static char[] bubbleSort(char[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                char temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count > 0) {
            bubbleSort(array);
        }

        return array;
    }

    private static char[] myNewCopyArray(char[] array) {
        char[] copy = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    private static char[] createCharArray(int length) {
        char[] array = new char[length];
        for (int i = 0; i < length; i++) {
            //array[i] = getMeChar(256, 383);// латинский алфавит
            //array[i] = getMeChar(13500, 13999);// китайский
            //array[i] = getMeChar(65166, 65256);// арабский
            array[i] = getMeChar(1488, 1505);// арамейский

        }
        return array;
    }

    public static char getMeChar(int start, int end) {
        char myChar = (char) (Math.random() * ((start - end) + 1) + end);
        return myChar;
    }

}
