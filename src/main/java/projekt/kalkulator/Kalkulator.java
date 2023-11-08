package projekt.kalkulator;

public class Kalkulator {
    //dodanie metody
public Integer dodaj(String dane){
    //jeśli metoda jest pusta to zwraca 0
    if(dane.isEmpty()){
        return 0;
    }
    //dodanie string ktory pozwala zeby liczby byly rozdzielane przez znaki
    String[] ignorowacZnaki = dane.split(",|\n");
    //stworzenie int który przechowuje wynik
    Integer wynikDodawania = 0;
    for (int i = 0; i <ignorowacZnaki.length ; i++){
        String liczba = ignorowacZnaki[i];
    //zmienienie znakow string na int
    wynikDodawania += Integer.parseInt(liczba);

    }
    // zwrocenie wyniku
    return wynikDodawania;
}
    }