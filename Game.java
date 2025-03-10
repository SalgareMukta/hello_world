public class Game {
    private int n;
    private int[][] grid;

    public Game(int n) {
        this.n = n;
        this.grid = new int[n][n];
    }

    // Generates a Sudoku puzzle
    public void generate() {
        fill(); 
        hide(); 
        display(); 
    }

    // Fill the grid using a simple pattern
    private void fill() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = (i + j) % n + 1; 
            }
        }
    }

    // Hide some numbers to create a puzzle
    private void hide() {
        int count = (n * n) / 3;  
        while (count > 0) {
            int r = (int) (System.nanoTime() % n);
            int c = (int) (System.nanoTime() % n);
            if (grid[r][c] != 0) {
                grid[r][c] = 0;  
                count--;
            }
        }
    }

    // Print the Sudoku grid
    public void display() {
        int width = (n >= 10) ? 3 : 2; 
        String format = "| %" + width + "s ";
        
        // Generate horizontal line dynamically
        StringBuilder line = new StringBuilder("+");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < width + 2; j++) {
                line.append("-");
            }
            line.append("+");
        }

        // Print Sudoku grid
        for (int i = 0; i < n; i++) {
            System.out.println(line);
            for (int j = 0; j < n; j++) {
                System.out.printf(format, (grid[i][j] == 0 ? " " : grid[i][j]));
            }
            System.out.println("|");
        }
        System.out.println(line); 
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide grid size as a command-line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println("Size must be 2 or greater.");
            return;
        }

        Game game = new Game(n);
        game.generate();
    }
}

