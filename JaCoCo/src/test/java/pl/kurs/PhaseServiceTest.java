package pl.kurs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhaseServiceTest {

    private PhaseService phaseService;

    @Before
    public void init() {
        phaseService = new PhaseService();
    }

    @Test
    public void shouldReturnFirstIsLonger() {
        String first = "kotek";
        String second = "pies";
        assertEquals("First is longer", phaseService.compareTwoWords(first, second));
    }

    @Test
    public void shouldReturnSecondIsLonger() {
        String first = "kotek";
        String second = "piesaaaaa";
        assertEquals("Second is longer", phaseService.compareTwoWords(first, second));
    }

    @Test
    public void shouldReturnBothAreTheSameAndLongerThan5() {
        String first = "piesaaaaa";
        String second = "piesaaaaa";
        assertEquals("Both are the same and longer than 5", phaseService.compareTwoWords(first, second));
    }

    @Test
    public void shouldReturnBothAreTheSame() {
        String first = "piesaaaaa";
        String second = "piesaaaaa";
        phaseService.compareTwoWords(first, second);
        //assertEquals("Both are the same and longer than 5", );
    }
}