public class Nested {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (char c = 'A'; c <= 'E'; c++) {
            for (int n = 1; n <= 3; n++) {
                System.out.println(c + " " + n);
            }
        }
        System.out.println("\n");

        // Look at the first set of nested loops ("CN"). Which variable changes faster?
        // Is it the variable controlled by the outer loop (c) or the variable
        // controlled by the inner loop (n)? Answer in a comment.
        // Answer: inner

        // Change the order of the loops so that the "c" loop is on the inside and the
        // "n" loop is on the outside. How does the output change?
        // Answer: The output now prints the letters in order of A-E three times instead
        // of each letter 3 times in a row. The numbers are printed 3 times in a row
        // instead of in order of 123 three diffeent times
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            // Add a System.out.println() statement after the close brace of the inner loop
            // (the "b" loop), but still inside the outer loop. How does the output change?
            // Answer: the inner loop ran through its 3 iterations before printing the
            // output of the next iteration on a new line. Therefore it shows three sets of
            // numbers on each line.

            // * You will add a line of code here.
            System.out.println();
        }

        // Look at the second set of nested loops ("AB"). Change the print() statement
        // to println(). How does the output change? (Then change it back to print().)
        // Answer print() prints the output on the same line and println()will print
        // each output on a new line
        System.out.println("\n");

    }
}