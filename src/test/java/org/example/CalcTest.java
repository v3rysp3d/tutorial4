package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalcTest {
    Calc c = new Calc();

    @Test
    public void testAddition() {
        assertEquals(4, c.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2)); // This should fail initially
    }
}
