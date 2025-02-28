import java.util.HashMap;
public class FindFirstUnique {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        System.out.println("Первое уникальное число: " + findFirstUnique(array));
    }

    public static int findFirstUnique(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (int num : array) {
            if (frequencyMap.get(num) == 1) {
                return num;
            }
        }
        return -1; // Если уникальных чисел нет
    }
}