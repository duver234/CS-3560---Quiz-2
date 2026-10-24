import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;


public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();


    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"})
    // Checking for months that do have 31 days
    public void testHas31Days(DateChecker.Month month) {
        assertTrue(dateChecker.has31Days(month));
    }


    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    // Checking for months that do NOT have 31 days
    public void testDoesNotHave31Days(DateChecker.Month month) {
        assertFalse(dateChecker.has31Days(month));
    }


    // Will be testing for the specific case of February
    @Test
    public void testFebruaryEdgeCase() {
        assertFalse(dateChecker.has31Days(DateChecker.Month.FEBRUARY));
    }


    // Will be testing if invalid inputs are handled properly
    @Test
    public void testInvalidMonthThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> dateChecker.has31Days(null)
        );
    }
}
