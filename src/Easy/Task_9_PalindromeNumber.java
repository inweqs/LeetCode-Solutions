// =============================================
// Task #9. Palindrome Number
// =============================================

public static void main(String[] args) {
    int input = 121;

    // First solution - Using StringBuilder
    String reversed = new StringBuilder(String.valueOf(input)).reverse().toString();
    System.out.println(Integer.toString(input).equals(reversed));

    // Second solution - Using Mathematics
    int original = input;
    int reversedNumber = 0;

    while (input > 0) {
        int lastDigit = input % 10;
        reversedNumber = reversedNumber * 10 + lastDigit;

        input /= 10;
    }
    System.out.println(original == reversedNumber);
}