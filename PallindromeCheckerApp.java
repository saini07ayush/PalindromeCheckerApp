package App.Src;

public class PallindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pallindrome Checker Management System");
        System.out.println("Version 1.0");
        System.out.println("System initialized successfully");

        // UC2 - Hardcoded Palindrome Check
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("\n--- UC2: Hardcoded Palindrome Check ---");
        System.out.println("Word   : " + word);

        if (word.equals(reversed)) {
            System.out.println("Result : \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result : \"" + word + "\" is NOT a Palindrome.");
        }
    }
}
