// =============================================
// Task #640. Solve the Equation
// =============================================

public void main(String[] args) {
    solveEquation("2x+3=x-5");
}

public void solveEquation(String equation) {
    // Split the input into left and right parts using "=" as a delimiter
    // Then, split each part into terms and store them in an array
    String[] partedEquation = equation.replace("-","+-").split("=");

    String[] left = partedEquation[0].split("\\+");
    String[] right = partedEquation[1].split("\\+");

    // Calculate the totals for `a` and `b`, accounting for sign changes
    int[] res_left = calculate_a_and_b(left, -1);
    int[] res_right = calculate_a_and_b(right,1);

    int a = res_left[0] + res_right[0];
    int b = res_left[1] + res_right[1];

    // Output the result
    if (a != 0) {
        System.out.println("x=" + b/a); // CHANGE TO RETURN
    } else if (a == 0 && b == 0) {
        System.out.println("Infinite solutions"); // CHANGE TO RETURN
    } else if (a == 0 && b != 0) {
        System.out.println("No solution"); // CHANGE TO RETURN
    }
}


// Helper method to calculate 'a' and 'b' using a sign multiplier
public int[] calculate_a_and_b(String[] nums, int multiplier) {
    int a = 0;
    int b = 0;
    for (String s : nums) {
        if (s.isEmpty()) continue;
        else if (s.contains("x")) {
            if (s.equals("-x")) {
                a += 1 * multiplier;
            } else if (s.equals("x")) {
                a -= 1 * multiplier;
            } else a -= Integer.parseInt(s.replace("x", "")) * multiplier;
        } else {
            b += Integer.parseInt(s) * multiplier;
        }
    }
    return new int[] {a, b};
}