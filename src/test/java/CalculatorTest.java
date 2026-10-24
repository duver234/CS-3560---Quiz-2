import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
