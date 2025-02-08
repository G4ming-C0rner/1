import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        arrayList.add(5); // Добавление элемента
        System.out.println("ArrayList: " + arrayList);

        // HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        System.out.println("HashMap: " + hashMap);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(5, 3, 1, 4, 2));
        System.out.println("TreeSet: " + treeSet);

        // Методы Collections для ArrayList
        Collections.reverse(arrayList);
        System.out.println("ArrayList после reverse: " + arrayList);
        Collections.shuffle(arrayList);
        System.out.println("ArrayList после shuffle: " + arrayList);
    }
}