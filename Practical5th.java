public class Practical5th {

    // a. using for loop
    public static int getFactorialForLoop(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by each number from 1 to 'number'
        }
        return factorial;
    }

    // b. using while loop
    public static int getFactorialWhileLoop(int number) {
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i; // Multiply factorial by 'i' while 'i' is <= 'number'
            i++; // Increment 'i' by 1
        }
        return factorial;
    }

    // c. without using any looping statement (using recursion)
    public static int getFactorialNoLoop(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * getFactorialNoLoop(number - 1); // Recursive call
    }

    // d. Get sum using a while loop
    public static int getSumWithArray(int[] num) {
        int sum = 0;
        int i = 0;
        while (i < num.length) {
            sum += num[i]; // Adding each element of the array
            i++;
        }
        return sum;
    }

    // e. Get sum using various primitive data types 
    public double getSumWithPrimitive(int a, float b, double c, long d, short e) {
        return a + b + c + d + e; 
    }

    public static void main(String[] args) {
        Practical5th obj = new Practical5th();                                                        
        System.out.println("Factorial of 5 using for loop: " + getFactorialForLoop(5));
        System.out.println("Factorial of 5 using while loop: " + getFactorialWhileLoop(5));
        System.out.println("Factorial of 5 without loop (recursion): " + getFactorialNoLoop(5));

        // Test for getSum using array and while loop
        int[] numArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of array using while loop: " + getSumWithArray(numArray));

        // Test for getSum using various primitive data types
        System.out.println("Sum using primitive types: " + obj.getSumWithPrimitive(1, 2.5f, 3.75, 4L, (short) 5));
    }
}

