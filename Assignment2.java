public class Assignment2 {
    public static void main(String[] args) {
        if (args.length == 0) return;

        String str = args[0];

        if (isValidNumber(str)) {
            int num = Integer.parseInt(str);
            System.out.println(calculateDigitSum(num)); 
            System.out.println(checkIfPalindrome(str));
        }

        System.out.println("Total Palindrome Substrings: " + findPalindromeSubstrings(str));
    }

    public static String calculateDigitSum(int num) {
        if (num < 10) return num + "=" + num;

        int last = num % 10;
        String prev = calculateDigitSum(num / 10);
        int sum = Integer.parseInt(prev.split("=")[1]) + last; 
        
        return prev.split("=")[0] + "+" + last + "=" + sum;
    }

    public static String checkIfPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return str + " is NOT a Palindrome because '" + str.charAt(i) + 
                        "' at position " + (i + 1) + " does not match '" + 
                        str.charAt(j) + "' at position " + (j + 1) + ".";
            }
            i++;
            j--;
        }
        return str + " is a Palindrome";
    }

    public static int findPalindromeSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isSubstringPalindrome(str, i, j)) count++;
            }
        }
        return count;
    }

    public static boolean isSubstringPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    private static boolean isValidNumber(String str) {
        return str.matches("\\d+");
    }
}

