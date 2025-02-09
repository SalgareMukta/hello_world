public class Practical8th {
    public static void main(String args[]) {
        Practical8th obj = new Practical8th ();
        obj.printPt1(3, 1);  
        System.out.println();
        obj.printPt2(3, 1);  
        System.out.println();
        obj.printPt3(5);     
        System.out.println();
    }
    
    // 1st part
    void printPt1(int size, int ln) {
        if (ln < size + 1) {  // Recursion condition 
            printSpace(size, ln);  
            printStar(ln, 1, "* ");  
            System.out.println();
            printPt1(size, ln + 1);  // Recursive call 
            printSpace(size, ln);  
            printStar(ln, 1, "/ ");  
            System.out.println();
        }
        if (ln == size + 1) {  
            printStar(ln, 1, "+ ");
            System.out.println();
        }
    }
    
   
    void printStar(int ln, int position, String symbol) {
        if (position <= ln) {  
            System.out.print(symbol);
            printStar(ln, position + 1, symbol);  // Recursive call 
        }
    }
    
    // 2nd part
    void printPt2(int size, int ln) {
        if (ln < size + 1) {  // Recursion condition
            printStar(ln, 1, "* ");  
            System.out.println();
            printPt2(size, ln + 1);  
            printStar(ln, 1, "* ");
            System.out.println();
        }
        if (ln == size + 1) { 
            printStar(ln, 1, "* ");
            System.out.println();
        }
    }
    
   
    void printSpace(int size, int ln) {
        if (ln <= size) {  // Recursion condition 
            System.out.print(" ");
            printSpace(size, ln + 1);  // Recursive call 
        }
    }
    
    // part 3rd
    void printPt3(int size) {
        displayPt3(size, 1);  
        displayPlus3(size, 1); 
    }
    
   
    void displayPt3(int size, int ln) {
        if (size % 2 == 1) {  // If size is odd
            if (ln == size / 2 + 1) {  // Base case to print middle row
                printStar3(ln, 1);
                System.out.println();
            } else if (ln <= (size / 2) + 1) { 
                printSpace3(size, ln);  
                printStar3(ln, 1);  
                System.out.println();
                displayPt3(size, ln + 1);  // Recursive call 
                printSpace3(size, ln);  
                printStar3(ln, 1);  
                System.out.println();
            }
        } else {  // If the size is even
            if (ln < (size / 2) + 1) {  
                printSpace3(size, ln); 
                printStar3(ln, 1);  
                System.out.println();
                displayPt3(size, ln + 1);  
                printSpace3(size, ln);  
                printStar3(ln, 1);  
                System.out.println();
            }
        }
    }
    
    
    void printStar3(int ln, int position) {
        if (position <= (2 * ln) - 1) {  // Recursion condition 
            System.out.print("* ");
            printStar3(ln, position + 1);  // Recursive call 
        }
    }
    
    
    void printSpace3(int size, int ln) {
        if (ln <= size / 2) {  // Recursion condition
            System.out.print(" ");
            printSpace3(size, ln + 1);  // Recursive call
        }
    }
    
    void displayPlus3(int size, int ln) {
        if (ln <= size) {  
            showPt3(size, 1); 
            displayPlus3(size, ln + 1);  // Recursive call t
        }
    }
    
   
    void showPt3(int size, int space) {
        if (space < size / 2 + 1) { 
            System.out.print(" ");
            showPt3(size, space + 1);  // Recursive call 
        } else if (space == size / 2 + 1) { 
            System.out.print("+ ");
            System.out.println();
        }
    }
}

