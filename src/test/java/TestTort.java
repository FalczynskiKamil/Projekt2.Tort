import jdk.jfr.Experimental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tort.Urodzinowy;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTort {
    @Test
    void ilosc_najdluzsej_swieczki() {
        //dlugosci swieczek na torcie
        int[] swieczki = {11, 5, 8, 3, 2, 8,5};
        //ilosc najdluzszych sieczek
        Integer oczekiwanyWynik = 1;
        Urodzinowy urodzinowy = new Urodzinowy();
        int ilosc = urodzinowy.policzSwieczki(swieczki);
        assertEquals(oczekiwanyWynik, ilosc );
    }
}
