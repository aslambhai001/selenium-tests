public class javapractice1 {
    public static int minSwapsToBalance(String s) {
        int countXY = 0; // Count for pattern starting with X
        int countYX = 0; // Count for pattern starting with Y
        
        for (int i = 0; i < s.length(); i++) {
            char expectedCharForXY = (i % 2 == 0) ? 'X' : 'Y';
            char expectedCharForYX = (i % 2 == 0) ? 'Y' : 'X';
            
            if (s.charAt(i) != expectedCharForXY) {
                countXY++;
            }
            if (s.charAt(i) != expectedCharForYX) {
                countYX++;
            }
        }
        
        // Return the minimum of the two counts
        return Math.min(countXY, countYX);
    }

    public static void main(String[] args) {
        String input = "XXYYXY"; // Example input
        int result = minSwapsToBalance(input);
        System.out.println("Minimum swaps required: " + result);
    }
}
