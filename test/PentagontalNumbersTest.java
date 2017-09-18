import org.junit.Test;

import static org.junit.Assert.*;

public class PentagontalNumbersTest {
    @Test
    public void getPentagonalNumber() throws Exception {
        int n =5;
        // checking to see if logic matches formula n(3n-1)/2
        assertEquals(35, PentagontalNumbers.getPentagonalNumber(n));
    }

    @Test
    public void print() throws Exception {
        // remainder is a print function no logic test needed;

    }

}