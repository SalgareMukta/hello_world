class IT2023bit016 {  
    // reverse string method
    public static String reverse(String inputString) {
        if (inputString == null || inputString.length() <= 1) {
            return inputString;
        }
        return reverse(inputString.substring(1)) + inputString.charAt(0);
    }

    // sum of digits method
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfDigits(number / 10);
    }

    // palindrome 
    public static boolean isPalindrome(String inputString) {
        if (inputString.length() <= 1) {
            return true;
        }
        if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
            return false;
        }
        return isPalindrome(inputString.substring(1, inputString.length() - 1));
    }

    public static void main(String[] args) {
        // for reverse string
        String inputString = "Utsav 2025";
        String reversed = reverse(inputString);
        System.out.println("Reversed: " + reversed);

        // for sum of digits
        int inputNumber = 170225;
        int sum = sumOfDigits(inputNumber);
        System.out.println("Sum of digits: " + sum);

        // for palindrome
        System.out.println(isPalindrome("171"));
        System.out.println(isPalindrome("172"));
    }
}

