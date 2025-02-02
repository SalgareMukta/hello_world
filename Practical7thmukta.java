public class Practical7th {

    public static void main(String[] args) {
        Practical7th a = new Practical7th();
        // Call all methods to print each alphabet in sequence
       /* a.printM();
        System.out.println();
        a.printU();
        System.out.println();
        a.printK();
        System.out.println();
        a.printT();
        System.out.println();
        a.printA();
        System.out.println();
*/
        int size =5;
        for(int i = 1; i <= size; i++)
        {
        System.out.println(a.printM(i,size) +" "+ a.printU(i,size) +" "+  a.printK(i,size) +" "+ a.printT(i,size)+ " "+ a.printA(i,size));
        }
}

   public String printM(int i, int size) {
    String pattern = "";
    for (int j = 1; j <= size; j++) {
        // Left and Right vertical lines of M
        if (j == 1 || j == size) {  
            pattern += "* ";
        } 
        // Left diagonal (first half of M)
        else if (i == j && i <= size / 2) {  
            pattern += "* ";
        } 
        // Right diagonal (second half of M)
        else if (i + j == size + 1 && i <= size / 2 + 1) {  
            pattern += "* ";
        } 
        else {  
            pattern += "  "; // Spaces in between
        }
    }
    return pattern;
}


    // Method to print pattern for U
    public String printU(int i, int size) {
            String pattern = "";
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == size) {
                    pattern+="* ";
                } else {
                    pattern+="  ";
                }
            }
           return pattern;
        
    }

    // Method to print pattern for K
     public String printK(int i, int size) {
        String pattern = "";
        for (int j = 1; j < size; j++) {
            if (j == 1 || i + j == size) { 
                // Left vertical line OR upper diagonal
                pattern+="* ";
            } else if (i - j == 1) { 
                // Lower diagonal
                pattern+="* ";
            } else {
                pattern+="  "; // Print spaces
            }
        }
        return pattern;
    
}

    public String printT(int i, int size) {
    String pattern = "";
    
    // Print the top horizontal line 
    if (i == 1) {
        for (int j = 1; j <= size; j++) {
            pattern += "* ";
        }
    } 
    // Print the vertical line in the middle
    else if (i <= size) {
        for (int j = 1; j <= size; j++) {
            if (j == (size + 1) / 2) {  // The center column
                pattern += "* ";
            } else {
                pattern += "  ";  // Spaces
            }
        }
    }
    return pattern;
}

    // Method to print pattern for A
    public String printA(int i, int size) {
            String pattern = "";
            for (int j = 1; j <= size; j++) {
                if (i == 1 || j == 1 || j == size || i == size-2) {
                    pattern+="* ";
                } else {
                    pattern+="  ";
                }
            }
    return pattern;
         
    }
    
}
 

