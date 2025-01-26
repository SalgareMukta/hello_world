public class Practical6b {
// 2nd pattern
    public static void main(String[] args) {
        // Call display1 with size 3 to print the pattern
        display1(3);
    }

    static void display1(int size) {
        // Loop for both upper and lower parts combined
        for (int ln = 1; ln <= size * 2 - 1; ln++) {
            int rowSize = (ln <= size) ? ln : 2 * size - ln; // Handle upper and lower parts
            
            // Print leading spaces
            for (int dot = size - rowSize; dot > 0; dot--) {
                System.out.print(" ");
            }

            // Print alternating symbols (+ for upper, * for lower)
            for (int sign = 1; sign <= 2 * rowSize - 1; sign++) {
                if (sign % 2 == 1) {  // Odd position: print symbol
                    System.out.print((ln <= size) ? "+" : "*");
                } else {  // Even position: print space
                    System.out.print(" ");
                }
            }

            System.out.println();  // Move to the next line after each row
        }
    }
}

