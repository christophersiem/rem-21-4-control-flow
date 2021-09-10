import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FillStudentArrayTest {

    @Test
    void testGenerateStudentNames() {

        // GIVEN
        String[] expected = {"Student 1", "Student 2" , "Student 3"};

        // WHEN
        String[] actual = FillStudentArray.generateStudentNames(expected.length);

        // THEN
        assertArrayEquals(expected, actual);
    }

}
