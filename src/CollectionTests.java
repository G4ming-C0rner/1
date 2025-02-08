public class CollectionTests {
    public static void main(String[] args) {
        // Тест ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        assert arrayList.size() == 2 : "ArrayList size test failed";

        // Тест HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        assert hashMap.get("One") == 1 : "HashMap get test failed";

        // Тест TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        assert treeSet.first() == 1 : "TreeSet first test failed";
    }
}