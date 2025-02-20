 public class Numberoperations {

        // 1. Fibonacci Series
        public static void fibonacciSeries(int n) {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    
        // 2. Find Factorial of a Number
        public static int factorial(int n) {
            if (n == 0) return 1;
            return n * factorial(n - 1);
        }
    
        // 3. Prime Number Check
        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    
        // 4. Sum of Digits of a Number
        public static int sumOfDigits(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    
        // 5. Armstrong Number
        public static boolean isArmstrong(int n) {
            int original = n, sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit * digit;
                n /= 10;
            }
            return sum == original;
        }
    
        // 6. Armstrong Number for N-Digits
        public static boolean isArmstrongNDigits(int n) {
            int original = n, sum = 0, digits = String.valueOf(n).length();
            while (n != 0) {
                int digit = n % 10;
                sum += Math.pow(digit, digits);
                n /= 10;
            }
            return sum == original;
        }
    
        // 7. Palindrome Number
        public static boolean isPalindromeNumber(int n) {
            int original = n, reversed = 0;
            while (n != 0) {
                reversed = reversed * 10 + n % 10;
                n /= 10;
            }
            return original == reversed;
        }
    
        // 8. Find GCD of Two Numbers
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    
        // 9. Find LCM of Two Numbers
        public static int lcm(int a, int b) {
            return a * (b / gcd(a, b));
        }
    
        // 10. Sum of Prime Numbers within a Range
        public static int sumOfPrimesInRange(int start, int end) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isPrime(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    
        // 11. Check Leap Year
        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    
        // 12. Find Largest Prime Factor of a Number
        public static int largestPrimeFactor(int n) {
            int largest = -1;
            while (n % 2 == 0) {
                largest = 2;
                n /= 2;
            }
            for (int i = 3; i * i <= n; i += 2) {
                while (n % i == 0) {
                    largest = i;
                    n /= i;
                }
            }
            if (n > 2) {
                largest = n;
            }
            return largest;
        }
    
        public static void main(String[] args) {
            // Example usage
            System.out.println("Fibonacci Series:");
            fibonacciSeries(10);
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Is 7 prime? " + isPrime(7));
            System.out.println("Sum of digits of 123: " + sumOfDigits(123));
            System.out.println("Is 153 an Armstrong number? " + isArmstrong(153));
            System.out.println("Is 1634 an Armstrong number for N digits? " + isArmstrongNDigits(1634));
            System.out.println("Is 121 a palindrome number? " + isPalindromeNumber(121));
            System.out.println("GCD of 56 and 98: " + gcd(56, 98));
            System.out.println("LCM of 12 and 18: " + lcm(12, 18));
            System.out.println("Sum of primes between 10 and 50: " + sumOfPrimesInRange(10, 50));
            System.out.println("Is 2024 a leap year? " + isLeapYear(2024));
            System.out.println("Largest prime factor of 13195: " + largestPrimeFactor(13195));
        }
    }

}
