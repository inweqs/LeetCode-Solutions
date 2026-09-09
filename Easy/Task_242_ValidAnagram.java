// =============================================
// Task #242. Valid Anagram
// =============================================

public void main(String[] args) {
    String s = "test";
    String t = "sett";

    System.out.println(isAnagram_(s, t));
}

// Compare by sorting
public boolean isAnagram_(String s, String t) {
    char[] chars_s = s.toLowerCase().toCharArray();
    char[] chars_t = t.toLowerCase().toCharArray();

    Arrays.sort(chars_s);
    Arrays.sort(chars_t);

    return Arrays.equals(chars_s, chars_t);
}