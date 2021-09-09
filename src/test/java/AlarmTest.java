import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    @DisplayName("More than 30 Persons should return a warning")
    public void testGetCapacityStatusWarning() {
        //Given
        int numberOfPeople = 31;

        //When
        String actual = Alarm.getCapacityStatus(numberOfPeople);

        //Then
        assertEquals("Warning! More than 30 people are not allowed", actual);
    }

    @Test
    @DisplayName("Less than 31 Persons should return a OK message")
    public void testGetCapacityStatusOk() {
        //Given
        int numberOfPeople = 30;

        //When
        String actual = Alarm.getCapacityStatus(numberOfPeople);

        //Then
        assertEquals("Everything okay, maximum number of people not exceeded", actual);
    }
}