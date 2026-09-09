// =============================================
// Task #13. Palindrome Number
// =============================================

public static void main(String[] args) {
    String text = "MMXXVI";

    Map<Character, Integer> numbers = new HashMap<>();

    char[] keys = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    int[] values = {1, 5, 10, 50, 100, 500, 1000};

    for (int i = 0; i < keys.length; i++) {
        numbers.put(keys[i], values[i]);
    }

    int res = 0;
    for (int i = 0; i < text.length(); i++) {

        char symbol = text.charAt(i);
        int value = numbers.getOrDefault(symbol, 0);
        int nextValue = (i + 1 < text.length()) ? numbers.getOrDefault(text.charAt(i + 1), 0) : 0;

        if (numbers.containsKey(symbol)) {
            if (value >= nextValue) {
                res += value;
            }
            else {
                res -= value;
            }
        }
    }
    System.out.println(text + "\n" + res);
}