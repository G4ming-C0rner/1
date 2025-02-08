public class CheckingArraySorting {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Пример отсортированного массива
        checkSorted(array);
    }

    public static void checkSorted(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}