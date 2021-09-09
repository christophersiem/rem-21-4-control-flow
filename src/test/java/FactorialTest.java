import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,1",
            "2,2",
            "3,6",
            "4,24",
    })
    void testCalculate(int given, int expected){
        int actual = Factorial.calculate(given);

        assertEquals(expected, actual);
    }
}
