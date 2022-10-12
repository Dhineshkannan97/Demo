import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test
    void addTest() {
        assertEquals(3, Calc.add("1,2"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, Calc.add(""));
    }

    @Test
    void testSingleString() {
        assertEquals(3, Calc.add("3"));
    }
    @Test
    void testUnknownAmount(){ Assertions.assertEquals(6,Calc.add("1,2,3"));}
    @Test
    void testNewLine(){ assertEquals(3,Calc.add("1\n2"));}
}
