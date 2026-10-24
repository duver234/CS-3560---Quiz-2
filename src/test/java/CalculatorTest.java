import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        // Test with positive numbers
        int expected = 3;
        int actual = calculator.sum(1, 2);
        assertEquals(expected, actual);

        // Test with negative numbers
        expected = 5;
        actual = calculator.sum(-1, 6);
        assertEquals(expected, actual);

        // Test with 0
        expected = 6;
        actual = calculator.sum(0, 6);
        assertEquals(expected, actual);

    }


    @Test
    public void testSubtract() {
        // Test with 0
        assertEquals(0, calculator.subtract(3, 3));

        // Test with negative numbers
        assertEquals(-2, calculator.subtract(3, 5));
    }

    @Test
    public void testMultiply() {
        // Test with 0
        assertEquals(0, calculator.multiply(0, 3));

        // Test with negative numbers
        assertEquals(-8, calculator.multiply(-2, 4));
    }


    @Test
    public void testDivide() {
        // Test with 0
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(10, 0)
        );

        assertEquals(2, calculator.divide(4, 2));

    }

}
