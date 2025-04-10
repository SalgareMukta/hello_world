import java.util.Random;
import java.util.Scanner;

public class DynamicSudoku {

    public static void main(String[] args) {
        int size = 4; // Changed from 3 to 4
        new DynamicSudoku().startGame(size);
    }

    public void startGame(int size) {
        if (size <= 0) {
            System.out.println("Please enter a positive size.");
            return;
        }

        int[][] board = new int[size][size];
        fillBoard(board, size);
        hideCells(board, size);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayBoard(board, size);

            System.out.print("\nEnter row (1-" + size + ", 0 to stop): ");
            int row = scanner.nextInt() - 1;
            if (row == -1) break;

            System.out.print("Enter column (1-" + size + "): ");
            int col = scanner.nextInt() - 1;

            if (row < 0 || row >= size || col < 0 || col >= size || board[row][col] != 0) {
                System.out.println("Invalid or filled cell. Try again.");
                continue;
            }

            System.out.print("Enter number (1-" + size + "): ");
            int num = scanner.nextInt();
            if (num < 1 || num > size) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            board[row][col] = num;
        }

        System.out.println("\nChecking your solution...");
        System.out.println(isValid(board, size) ? "Success!" : "Incorrect solution.");
    }

    private void fillBoard(int[][] board, int size) {
        Random rand = new Random();
        for (int row = 0; row < size; row++) {
            boolean[] used = new boolean[size + 1];
            for (int col = 0; col < size; col++) {
                int num;
                do {
                    num = rand.nextInt(size) + 1;
                } while (used[num] || columnHas(board, col, num, row));
                board[row][col] = num;
                used[num] = true;
            }
        }
    }

    private boolean columnHas(int[][] board, int col, int num, int uptoRow) {
        for (int r = 0; r < uptoRow; r++) {
            if (board[r][col] == num) return true;
        }
        return false;
    }

    private void hideCells(int[][] board, int size) {
        int blanks = (size * size) / 3;
        Random rand = new Random();
        while (blanks > 0) {
            int r = rand.nextInt(size);
            int c = rand.nextInt(size);
            if (board[r][c] != 0) {
                board[r][c] = 0;
                blanks--;
            }
        }
    }

    private void displayBoard(int[][] board, int size) {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                System.out.print("+---");
            }
            System.out.println("+");
            for (int c = 0; c < size; c++) {
                System.out.printf("| %s ", board[r][c] == 0 ? " " : board[r][c]);
            }
            System.out.println("|");
        }
        for (int c = 0; c < size; c++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }

    private boolean isValid(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            boolean[] rowCheck = new boolean[size + 1];
            boolean[] colCheck = new boolean[size + 1];
            for (int j = 0; j < size; j++) {
                int rowVal = board[i][j];
                int colVal = board[j][i];

                if ((rowVal != 0 && rowCheck[rowVal]) || (colVal != 0 && colCheck[colVal])) {
                    return false;
                }
                rowCheck[rowVal] = true;
                colCheck[colVal] = true;
            }
        }
        return true;
    }
}
1
