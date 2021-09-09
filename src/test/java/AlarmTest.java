import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlarmTest {

    @ParameterizedTest
    @CsvSource({
            "red, 30, Warning! Maximum number of people exceeded",
            "red, 0, 'Everything okay, maximum number of people not exceeded'",
            "yellow, 29, 'Everything okay, maximum number of people not exceeded'",
            "yellow, 31, Warning! Maximum number of people exceeded",
            "green, 59, 'Everything okay, maximum number of people not exceeded'",
            "green, 61, Warning! Maximum number of people exceeded",

    })
    public void checkAllowedNumberOfPersons(String threatLevel, int numberOfPeople, String expected){
        //When
        String actual = Alarm.getCapacityStatus(numberOfPeople, threatLevel);
        //Then
        assertEquals(expected, actual);
    }
}