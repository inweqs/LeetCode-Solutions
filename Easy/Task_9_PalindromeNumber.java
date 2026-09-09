// =============================================
// Task #9. Palindrome Number
// =============================================

public void main(String[] args) {
    int input = 121;
}

// First solution - Using StringBuilder
public boolean isPalindrome(int x) {
    String reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
    return Integer.toString(x).equals(reversed);
}

public boolean _isPalindrome(int x) {
    // Second solution - Using Mathematics
    int original = x;
    int reversedNumber = 0;

    while (x > 0) {
        int lastDigit = x % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;

        x /= 10;
    }
    return original == reversedNumber;
}