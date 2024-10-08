public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Your code here
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam")); // Output: true
        System.out.println(isPalindrome("banana")); // Output: false
        System.out.println(isPalindrome("")); // Output: true
    }
}

// Write a method isPalindrome(String s) that takes a string s and returns true if the string is
// a palindrome, and false otherwise. A palindrome is a word, phrase, number, or other sequences of 
// characters that reads the same forward and backward, ignoring case, spaces, 
// and non-alphanumeric characters.
