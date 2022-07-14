import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {


    @Test
    @DisplayName("Sum should return the correct value")
    void sum() {
        //given\
        int a = 1;
        int b = 1;
        //then
        assertEquals(2 , AddTwoIntegers.sum(a,b));
    }
}