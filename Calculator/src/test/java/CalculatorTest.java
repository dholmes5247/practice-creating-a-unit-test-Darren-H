import org.example.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers () {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 7 );
        assertEquals(12, result, "Addition of two numbers 5 & 7");
        System.out.println("Completed successfully");
    }

    @Test
    public void testAddNegativeNumbers () {
        Calculator calculator = new Calculator();

        int result = calculator.add(-3, -6);
        assertEquals(-9, result, "Adding -3 + -6");
    }

    @Test
    public void testAddWithZero () {
        Calculator calculator = new Calculator();

        int result = calculator.add(0, 5);
        assertEquals(5, result, "Adding a zero as a number");
    }
}

/*
The test class mirrors the name of the class being tested (with Test at the
end)  - YES
The test method name clearly describes what is being tested - YES
The test can run independently and doesn’t rely on other tests - YES
There is at least one test for the normal (“happy path”) case - Yes
There is at least one test for an edge case or unusual input - YES
The test uses appropriate assertions to verify behavior - YES
*/