package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//----------------------------------------------------------------------------
    //Zadanie 1
    // dodaje skaner
    /*Scanner scanner = new Scanner(System.in);

    //zadaje pytanie na konsoli
    System.out.print("Podaj imię: ");
    //wczytuje dane z konsoli i przypisuje do zmienniej
    String imie=scanner.nextLine();

    //zadaje drugie pytanie
    System.out.print("Podaj nazwisko: ");
    //wczytuje nowe dane i nowa zmienną
    String nazwisko=scanner.nextLine();

    //zadaje trzecie pytanie
    System.out.print("Podaj płeć (kobieta/mężczyzna): ");
    //wczytje trzecią zmienna i dane
    String plec=scanner.nextLine();

    // uzywam metody wyswietlania
    wyswietl(imie,nazwisko,plec);

    scanner.close();

    */
//----------------------------------------------------------------------------
    //Zadanie 2
    /*
    // Dodaje skaner
    Scanner scanner = new Scanner(System.in);
    // Wczytuje dane
    System.out.print("Podaj miesiąc: ");
    String miesiac= scanner.nextLine();
    System.out.print("Podaj rok: ");
    String rok = scanner.nextLine();
    //Uzywam metody
    ktoryKwart(miesiac,rok);

    scanner.close();
    */
//----------------------------------------------------------------------------
    //Zadanie 3
    /*
    //Dodaje skaner
    Scanner scanner = new Scanner(System.in);
    //Wczytuje dane
    System.out.print("Podaj rok: ");
    String rok = scanner.nextLine();
    //Uzywam metody
    int badanyRok = Integer.parseInt(rok);
    if (czyPrzystepny(badanyRok) == true)
    System.out.print("Rok jest przystępny");
    else if (czyPrzystepny(badanyRok) == false)
    System.out.print("Rok nie jest przystepny");

    scanner.close();
    */
//----------------------------------------------------------------------------
    //ZADANIE 4
    /*Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbę zakupionego towaru: ");
    String sztukTowaru = scanner.nextLine();
    //Uzywam metody Promocja
    promocja(sztukTowaru);

    scanner.close();
    */
//----------------------------------------------------------------------------
        //ZADANIE 5
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj tytuł pierwszego utworu: ");
        String tytulPierwszegoUtworu=scanner.nextLine();

        System.out.print("Podaj czas trwania pierwszego utworu (minuty): ");
        String pierwszyUtworMinuty=scanner.nextLine();

        System.out.print("Podaj czas trwania pierwszego utworu (sekundy): ");
        String pierwszyUtworSekundy=scanner.nextLine();

        System.out.print("Podaj tytuł drugiego utworu: ");
        String tytulDrugiegoUtworu=scanner.nextLine();

        System.out.print("Podaj czas trwania drugiego utworu (minuty): ");
        String drugiUtworMinuty=scanner.nextLine();

        System.out.print("Podaj czas trwania drugiego utworu (sekundy): ");
        String drugiUtworSekundy=scanner.nextLine();

        utwory(tytulPierwszegoUtworu,pierwszyUtworMinuty,pierwszyUtworSekundy,tytulDrugiegoUtworu,drugiUtworMinuty,drugiUtworSekundy);
        scanner.close();
    }
//----------------------------------------------------------------------------
// ---------------------------------------------------------------------------
    //METODA ZADANIE 1
    public static void wyswietl(String name,String surName,String sex){

    // deklaruje stringa
    String napis= "";
    if  (sex.equals("mężczyzna"))
        napis+=("Student: " + name + " " + surName);
    else if (sex.equals("kobieta"))
        napis+=("Studentka: " + name + " " + surName);
    System.out.print(napis);
    }
    // METODA ZADANIE 2 metoda to wypisania na konsoli
    public static void wypisz(String miesiac, String rok, String kwartal) {

        String napis = "";
        napis = (miesiac + "." + rok + " to " + kwartal + " " + rok + " roku" );
        System.out.print(napis);
    }

    //METODA ZADANIE 2 metoda do wyliczania kwartału
    public static String ktoryKwart(String miesiac, String rok){
        //zamieniam stringa na inta
        String kwartal ="";
        int mies = Integer.parseInt(miesiac);
        // dziele int nie zapisuje po przecinkuczyli mam pełną cyfrę
        mies /=4;
        if(mies==0)
            kwartal= "I";
        else if(mies==1)
            kwartal="II";
        else if(mies==2)
            kwartal="III";
        else if (mies==3)
            kwartal="IV";
        wypisz(miesiac,rok,kwartal);
        return kwartal;
    }

    //METODA ZADANIE 3
    public static boolean czyPrzystepny(int rok){
    boolean przystepny = false;
    //"&&" oznacza i "||" oznacza lub
    if((rok%4 == 0 && rok%100!=0)||rok%400==0)
    przystepny = true;
    //mozna tez to ując w return (rok%4 == () && rok%100!=0)||rok%400==0)
    return przystepny;
    }
    //METODA ZADANIE 4
    public static void promocja(String sztuki){
        int liczbaTowaru=Integer.parseInt(sztuki);
        float cena=10;
        float suma=0;
        //Ustalenie czy jest promocja
        boolean promocja = true;
        if (promocja == false) {
            cena += cena * 0.1;
            suma = cena*liczbaTowaru;
            System.out.print("Suma do zapłaty: " + suma);
        }
        else if (promocja == true)
            System.out.print("Suma do zapłaty: "+ileSztuk(liczbaTowaru,cena));
    }
    public static float ileSztuk(int liczbaTowaru, float cena){
        float suma=0;
        if (liczbaTowaru > 10)
            cena=cena/2;
        return suma=cena*liczbaTowaru;

    }
    //METODA ZADANIE 5
    public static void utwory(String tytulPierwszegoUtworu,String pierwszyUtworMinuty,String pierwszyUtworSekundy,String tytulDrugiegoUtworu,String drugiUtworMinuty,String drugiUtworSekundy) {
        int pierwszyMinuty = Integer.parseInt(pierwszyUtworMinuty);
        int pierwszySekundy = Integer.parseInt(pierwszyUtworSekundy);
        int drugiMinuty = Integer.parseInt(drugiUtworMinuty);
        int drugiSekundy = Integer.parseInt(drugiUtworSekundy);
        int sumaMinuty = pierwszyMinuty + drugiMinuty;
        int sumaSekundy = pierwszySekundy + drugiSekundy;
        String czasTrwania = (sumaMinuty + ":" +sumaSekundy);
        String pierwszy = "";
        String drugi = "";
        if (pierwszyMinuty > drugiMinuty) {
            pierwszy = (tytulPierwszegoUtworu + " " + pierwszyMinuty + ":" + pierwszySekundy);
            drugi = (tytulDrugiegoUtworu + " " + drugiMinuty + ":" + drugiSekundy);
            wypiszUtwory(pierwszy, drugi, czasTrwania);
        } else if(pierwszyMinuty < drugiMinuty ) {
            pierwszy = (tytulDrugiegoUtworu + " " + drugiMinuty + ":" + drugiSekundy);
            drugi = (tytulPierwszegoUtworu + " " + pierwszyMinuty + ":" + pierwszySekundy);
            wypiszUtwory(pierwszy, drugi, czasTrwania);
        } else if(pierwszyMinuty == drugiMinuty && pierwszySekundy > drugiSekundy ) {
            pierwszy = (tytulPierwszegoUtworu + " " + pierwszyMinuty + ":" + pierwszySekundy);
            drugi = (tytulDrugiegoUtworu + " " + drugiMinuty + ":" + drugiSekundy);
            wypiszUtwory(pierwszy, drugi, czasTrwania);
        } else if(pierwszyMinuty == drugiMinuty && pierwszySekundy < drugiSekundy ) {
            pierwszy = (tytulDrugiegoUtworu + " " + drugiMinuty + ":" + drugiSekundy);
            drugi = (tytulPierwszegoUtworu + " " + pierwszyMinuty + ":" + pierwszySekundy);
            wypiszUtwory(pierwszy, drugi, czasTrwania);
        } else if(pierwszyMinuty == drugiMinuty && pierwszySekundy == drugiSekundy ) {
            pierwszy = (tytulDrugiegoUtworu + " " + drugiMinuty + ":" + drugiSekundy);
            drugi = (tytulPierwszegoUtworu + " " + pierwszyMinuty + ":" + pierwszySekundy);
            wypiszUtwory(pierwszy, drugi, czasTrwania);
        }

    }
     public static void wypiszUtwory(String pierwszy, String drugi, String czasTrwania){
            System.out.println("------------------------------------");
            System.out.println("UTWORY");
            System.out.println("1. " + pierwszy);
            System.out.println("2. " + drugi);
            System.out.println("ŁĄCZNY CZAS TRAWANIA: " + czasTrwania);
            System.out.println("------------------------------------");
        }


}
