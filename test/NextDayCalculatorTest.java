import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    public void testNextDay() {
        LocalDate result = NextDayCalculator.nextDay(2018, 1, 1);
        LocalDate expected = LocalDate.of(2018, 1, 2);
        assertEquals(expected, result);
    }

    @Test
    public void testNextDay2() {
        LocalDate result = NextDayCalculator.nextDay(2018, 1, 31);
        LocalDate expected = LocalDate.of(2018, 2, 1);
        assertEquals(expected, result);
    }

    @Test
    public void testNextDay3() {
        LocalDate result = NextDayCalculator.nextDay(2023, 2, 28);
        LocalDate expected = LocalDate.of(2023, 2, 29);
        assertEquals(expected, result);
    }

    @Test
    public void testNextDay4() {
        LocalDate result = NextDayCalculator.nextDay(2000, 2, 28);
        LocalDate expected = LocalDate.of(2000, 2, 29);
        assertEquals(expected, result);
    }
    
}