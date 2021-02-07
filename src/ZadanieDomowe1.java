public class ZadanieDomowe1 {

    public static void main(String[] args) {

        // 1. 4 zmienne typu int
        // 2. Sprawdzamy czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdzamy czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste

        int numOne = 23;
        int numTwo = 3;
        int numThree = 95;
        int numFour = 444;

        int sumOne = numOne + numTwo;
        int sumTwo = numThree + numFour;

        if (sumOne % 2 == 0) {
            System.out.println("Sum of int 1 and 2 is even");
        } else {
            System.out.println("Sum of int 1 and 2 is odd");
        }

        if (sumTwo % 2 == 0) {
            System.out.println("Sum of int 3 and 4 is even");
        } else {
            System.out.println("Sum of int 3 and 4 is odd");
        }

        if (sumTwo % 2 == 0 && sumOne % 2 == 0) {
            System.out.println("All sums are even");
        } else {
            System.out.println("Not all sums are even");
        }

    }


}
