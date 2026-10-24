import java.util.Arrays;

public class DateChecker {

    // Enum of all of the months
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }


    // These are the months with 31 days in them: Jan, Mar, May, Jul, Aug, Oct, Dec
    private DateChecker.Month[] monthThirtyOneDays = {Month.JANUARY, Month.MARCH, Month.MAY,
            Month.JULY, Month.AUGUST, Month.OCTOBER,
            Month.DECEMBER};


    public boolean has31Days(Month month) {
        if (month == null || !Arrays.asList(Month.values()).contains(month)) {
            throw new IllegalArgumentException("Please enter valid month input.");
        }

        if (Arrays.asList(monthThirtyOneDays).contains(month)) {
            return true;
        }
        else {
            return false;
        }
    }

}
