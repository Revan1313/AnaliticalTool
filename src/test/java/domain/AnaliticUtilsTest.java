package domain;

import org.junit.Before;
import org.junit.Test;


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.BDDMockito.given;

public class AnaliticUtilsTest {
    final static String FILE_PATH = "src/main/resources/test.txt";
    @Mock
    public AnaliticUtils analiticUtils;

    public AnaliticUtilsTest() {
        MockitoAnnotations.openMocks(this);
        this.analiticUtils = new AnaliticUtils() ;
    }

    private List<String> lines;

    @Before
    public void init() {
         lines = analiticUtils.readFile(FILE_PATH);
    }

    @Test
    public void readFileTestOne() {

        assertEquals(lines.get(0), "7");
    }

    @Test
    public void readFileTestTwo() {
        assertEquals(lines.get(1), "C 1.1 8.15.1 P 15.10.2012 83");
    }

    @Test
    public void readFileTestThree() {
        assertEquals(lines.get(4), "D 1.1 8 P 01.01.2012-01.12.2012");
    }

    @Test
    public void readFileTestFour() {
        assertEquals(lines.get(7), "D 3 10 P 01.12.2012");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void readFileTestFive() {
        given(lines.get(9)).willThrow(IndexOutOfBoundsException.class);
    }
}