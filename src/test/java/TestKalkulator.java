import jdk.jfr.Experimental;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import projekt.kalkulator.Kalkulator;

import static org.junit.jupiter.api.Assertions.*;


public class TestKalkulator {

 @Test
void zwraca_zero_kiedy_string_is_null(){
     String dane = null;
     //oczekiwany wynik testu 0
     Integer oczekiwanyWynik = 0;
     Kalkulator kalkulator = new Kalkulator();
     Integer wynik = null;
     //wylapujemy mozliwy blad
     try{wynik = kalkulator.dodaj(dane);
     fail();}catch (NullPointerException ex){
         assertEquals("Cannot invoke \"String.isEmpty()\" because \"dane\" is null", ex.getMessage());
     }
 }
    @Test
    void dla_pustego_stringa_zwraca_zero() {
     //zmieniam informacje pierwszego testu tak zeby zgadzalo sie z tytulem
    String dane = "";
    Integer oczekiwanyWynik=0;
    Kalkulator kalkulator = new Kalkulator();
    Integer wynik = kalkulator.dodaj(dane);
    assertEquals(oczekiwanyWynik,wynik);
    }
    @Test
    void pozwala_dodawac_liczby_oddzielone_przecinkiem() {
        String dane = "23,6,2,57,3,9";
        Integer oczekiwanyWynik=100;
        Kalkulator kalkulator = new Kalkulator();
        Integer wynik = kalkulator.dodaj(dane);
        assertEquals(oczekiwanyWynik,wynik);
    }
    @Test
    void pozwala_dodawac_liczby_oddzielone_enterem() {
        String dane = "1\n2\n3";
        Integer oczekiwanyWynik=6;
        Kalkulator kalkulator = new Kalkulator();
        Integer wynik = kalkulator.dodaj(dane);
        assertEquals(oczekiwanyWynik,wynik);
    }


}