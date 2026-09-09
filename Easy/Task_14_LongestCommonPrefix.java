// =============================================
// Task #14. Longest Common Prefix
// =============================================

public static void main(String[] args) {
    String[] input = {"flower","fkow"};

    // Method #1 - Reference comparison
    String reference = input[0];

    for (String s : input) {
        while (true) {
            if (!s.startsWith(reference) && !reference.isEmpty()) {
                reference = reference.substring(0, reference.length() - 1);
            }
            else {
                break;
            }
        }
    }

    // Method 2 - Vertical Scanning


    
    if (reference.isEmpty()) {
        System.out.println("\"\"");
    }
    else {
        System.out.println(reference);
    }
}