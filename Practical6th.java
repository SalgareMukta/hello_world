public class Practical6th {
    public static void main(String[] args) {
        int n = 3; // Size 

        // Upper part 
        for (int i = 1; i <= n; i++) {
            // Print spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }

        // Lower part 
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
           
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

