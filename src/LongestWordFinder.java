public class LongestWordFinder {

    public static String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return ""; // Возвращаем пустую строку, если текст пустой или null
        }

        // Разбиваем текст на слова по пробелам и знакам препинания
        String[] words = text.split("\\s+"); // Разделяем только по пробелам

        String longestWord = "";
        for (String word : words) {
            // Убираем знаки препинания из слова (если они есть)
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String text = "Метод для поиска самого длинного слова в тексте на Java.";
        String longestWord = findLongestWord(text);
        System.out.println("Самое длинное слово: " + longestWord);
    }
}