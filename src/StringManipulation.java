import java.util.Arrays;
    public class StringManipulation {

    
        // 1. Reverse a String
        public static String reverseString(String s) {
            return new StringBuilder(s).reverse().toString();
        }
    
        // 2. Check for Palindrome
        public static boolean isPalindrome(String s) {
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equals(reversed);
        }
    
        // 3. Count Occurrences of a Character in a String
        public static int countOccurrences(String s, char c) {
            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == c) {
                    count++;
                }
            }
            return count;
        }
    
        // 4. Check if a String is Anagram of Another String
        public static boolean isAnagram(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    
        // 5. Count Vowels and Consonants in a String
        public static void countVowelsAndConsonants(String s) {
            int vowels = 0, consonants = 0;
            String vowelsList = "aeiouAEIOU";
            for (char ch : s.toCharArray()) {
                if (vowelsList.indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
        }
    
        // 6. String Compression
        public static String compressString(String s) {
            StringBuilder compressed = new StringBuilder();
            int count = 1;
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    compressed.append(s.charAt(i));
                    if (count > 1) {
                        compressed.append(count);
                    }
                    count = 1;
                }
            }
            return compressed.toString();
        }
    
        // 7. Reverse Words in a String
        public static String reverseWords(String s) {
            String[] words = s.split(" ");
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            return reversed.toString().trim();
        }
    
        // 8. Find the Missing Character in a String
        public static char findMissingCharacter(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != (char) ('a' + i)) {
                    return (char) ('a' + i);
                }
            }
            return ' ';
        }
    
        public static void main(String[] args) {
            // Example usage
            System.out.println("Reversed String: " + reverseString("hello")); // olleh
            System.out.println("Is Palindrome: " + isPalindrome("madam")); // true
            System.out.println("Occurrences of 'l': " + countOccurrences("hello", 'l')); // 2
            System.out.println("Is Anagram: " + isAnagram("listen", "silent")); // true
            countVowelsAndConsonants("hello world"); // Vowels: 3, Consonants: 7
            System.out.println("Compressed String: " + compressString("aabcccccaaa")); // a2b1c5a3
            System.out.println("Reversed Words: " + reverseWords("hello world")); // world hello
            System.out.println("Missing Character: " + findMissingCharacter("abcdegh")); // f
            
        }
    }

