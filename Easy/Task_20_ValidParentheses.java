// =============================================
// Task #20. Valid Parentheses
// =============================================

public void main(String[] args) {
    System.out.println(isValid("]"));
}

public boolean isValid(String s) {
    Deque<Character> arr = new ArrayDeque<>();

    for (char c : s.toCharArray()) {
        switch (c) {
            case '(' -> arr.push(')');
            case '[' -> arr.push(']');
            case '{' -> arr.push('}');

            default -> {
                if (arr.isEmpty() || arr.pop() != c) {
                    return false;
                }
            }
        }
    }
    return arr.isEmpty();
}