package projekt.kalkulator;

public class Kalkulator {
    //dodanie metody
public Integer dodaj(String dane){
    if(dane == null || dane.isEmpty()){
        return 0;
    }
    String separatory = ",|\n|;";
    String demiDane = dane;
    String nowySeparatory = "";
    Integer tysiac = 1000;

    if(dane.startsWith("//")){
        demiDane = dane.substring(dane.indexOf("\n")+1);
        nowySeparatory = dane.substring(2, dane.indexOf("\n"));


        separatory = separatory + "|" + nowySeparatory;
    }

    //dodanie string ktory pozwala zeby liczby byly rozdzielane przez znaki
    String[] delimiter = demiDane.split(separatory);



    //stworzenie int który przechowuje wynik
    Integer wynikDodawania = 0;
    for (int i = 0; i <delimiter.length ; i++){
        String liczba = delimiter[i];
    //zmienienie znakow string na int
    wynikDodawania += Integer.parseInt(liczba);

    }
    // zwrocenie wyniku
    return wynikDodawania%1000;}

    }