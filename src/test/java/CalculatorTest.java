import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;





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
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test
    public void testisEven() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    public void testisOdd() {
        assertFalse(calculator.isEven(3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
        String expectedMessage = "Ints CANNOT be divided by 0";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
