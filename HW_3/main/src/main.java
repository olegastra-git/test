import java.util.Scanner;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        main main = new main();

        main.testEvenNumber();
        main.testOddNumber();
        main.testZero();
        main.testPositiveNumber();
        main.testNegativeNumber();
        main.testLargeNumber();
        main.testPrimeNumber();
        main.testDecimalNumber();
        main.testInvalidInput();

        main.testNumberInInterval();
    }

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        if (n > 25 && n < 100) {
            return true;
        } else {
            return false;
        }
    }

    public void testEvenNumber() {
        assert (evenOddNumber(2) == true);
        assert (evenOddNumber(0) == true);
        assert (evenOddNumber(-2) == true);
        assert (evenOddNumber(100) == true);
    }

    public void testOddNumber() {
        assert (evenOddNumber(3) == false);
        assert (evenOddNumber(1) == false);
        assert (evenOddNumber(-1) == false);
        assert (evenOddNumber(101) == false);
    }

    public void testZero() {
        assert (evenOddNumber(0) == true);
    }

    public void testPositiveNumber() {
        assert (evenOddNumber(10) == true);
        assert (evenOddNumber(25) == false);
        assert (evenOddNumber(100) == true);
        assert (evenOddNumber(99) == false);
    }

    public void testNegativeNumber() {
        assert (evenOddNumber(-5) == true);
        assert (evenOddNumber(-25) == false);
        assert (evenOddNumber(-100) == true);
        assert (evenOddNumber(-99) == false);
    }

    public void testLargeNumber() {
        assert (evenOddNumber(1000000) == true);
        assert (evenOddNumber(999999) == false);
    }

    public void testPrimeNumber() {
        assert (evenOddNumber(7) == false);
        assert (evenOddNumber(13) == false);
        assert (evenOddNumber(17) == false);
    }

    public void testDecimalNumber() {
        try {
            evenOddNumber(3);
            // If no exception is thrown, the test has failed
            assert (false);
        } catch (IllegalArgumentException e) {
            // If an IllegalArgumentException is thrown, the test has passed
            assert (true);
        }
    }

    public void testInvalidInput() {
        try {
            evenOddNumber(Integer.parseInt("abc"));
            // If no exception is thrown, the test has failed
            assert (false);
        } catch (IllegalArgumentException e) {
            // If an IllegalArgumentException is thrown, the test has passed
            assert (true);
        }
    }

    public void testNumberInInterval() {
        assert (numberInInterval(50) == true);
        assert (numberInInterval(25) == false);
        assert (numberInInterval(101) == false);
        assert (numberInInterval(24) == false);
    }
}