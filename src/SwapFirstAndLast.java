import java.util.Arrays;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        System.out.println("Array 1: " + Arrays.toString(array));
        swapFirstAndLast(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void swapFirstAndLast(int[] array) {
        if (array.length < 1) return; // Проверка на пустой массив
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }
}