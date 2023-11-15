package tort;

public class Urodzinowy {
    public static int policzSwieczki(int[] swieczki) {
        //dlugosc najdluzszej swieczki
         int longest = swieczki[0];
         //ilosc najdluzszych swieczek
        int ilosc = 0;
        //String wypadek = "zawysokie swieczki lub za duzo swieczek(max 10)";

        for (int dlugosc= 0; dlugosc<swieczki.length;dlugosc++) {
            //wyszukiwanie najdluzszej liczby
            if (swieczki[dlugosc]>longest) {
                //aktualizuje najdluzsza liczbe
                longest=swieczki[dlugosc];
                ilosc=1;
                //liczy najdlusze liczby
            } else if (swieczki[dlugosc]==longest) {
                //zwieksza licznik najdluzszych liczb
                ilosc++;
            }
        }
        if(longest>1 && longest<10 && ilosc>1 && ilosc<10){
        return ilosc;}
        else{return 0;}
    }
}

