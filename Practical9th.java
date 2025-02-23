public class Practical9th {

    // Iterative factorial
    public static long iterativeFactorial(long num) {
        long result = 1;
        for (long i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive factorial
    public static long recursiveFactorial(long num) {
        if (num == 0 || num == 1) return 1;  
        return num * recursiveFactorial(num - 1);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter array size as a command-line argument!");
            return;
        }

        // array size
        int arrayLength = Integer.parseInt(args[0]);  
        long[] values = new long[arrayLength];

        // declaring the variables
        long startTime, endTime, totalIterTime = 0, totalRecTime = 0;

        // Generating random numbers
        for (int index = 0; index < arrayLength; index++) {
            values[index] = (System.nanoTime() % 20) + 1;

            // Iterative time
            startTime = System.nanoTime();
            iterativeFactorial(values[index]);
            endTime = System.nanoTime();
            totalIterTime += (endTime - startTime);

            // Recursive time
            startTime = System.nanoTime();
            recursiveFactorial(values[index]);
            endTime = System.nanoTime();
            totalRecTime += (endTime - startTime);
        }

        // Print results
        System.out.println("\nIterative Time: " + totalIterTime + " ns");
        System.out.println("Recursive Time: " + totalRecTime + " ns");

        if (totalIterTime < totalRecTime) 
            System.out.println("Iterative method is faster.");
        else if (totalIterTime > totalRecTime) 
            System.out.println("Recursive method is faster.");
        else 
            System.out.println("Both methods took the same time.");
    }
}

