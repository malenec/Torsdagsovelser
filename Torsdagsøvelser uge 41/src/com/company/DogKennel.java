/*
FORMÅL: At kunne redesigne ved at skifte standard datatyper ud med egne klasser
OPGAVEN: Der er fem delopgaver.
1) I main skal man lave et hundeobjekt med navn og ejer
2) Skriv en klasse, Dog med en boolean attribut - isHungry - som skal initialiseres til true.
Lav en metode - feedDog - som tager hensyn til om hunden er sulten.
Husk at sætte isHungry til false, når den er blevet fodret.
3) Modificér hunde-klassen så den kan få hvalpe. Dvs indfør en attribut a la:
private ArrayList<String> offSpring;
Konstruktøren skal initialisere offSpring.
4) Tilføj nu en getter og en setter. Setter-metoden skal sørge for at fylde
offSpring til Dog klassen.
5) Modificer  Dog klassen så ejeren ikke længere er type String men typen Owner
(som altså er en klasse der skal laves fra bunden). Dvs flg skal skiftes:
private String ejer;
så det bliver til:
private Owner ejer;
Når det er ændret vil man også skulle ændre i getter og setter samt i main.
Flg skal kunne virke fra main:
System.out.println("hunden " + getDogName() + " er ejet af " + myDog.getOwner());
6) Gør det samme for offSpring. Dvs
private ArrayList<String> offSpring; bliver til
private ArrayList <Dog> offSpring;
7) lav en metode der kan printe navnene på en hund's hvalpe.
*/

package com.company;

import java.util.ArrayList;

public class DogKennel {

    public static void main(String[] args) {

        //TODO: lav en ny hund
        Dog myDog = new Dog("Woodie", true);

        //TODO: sæt en ejer
        myDog.setOwner(new Owner("Henning"));
        System.out.println("Hunden " + myDog.getDogName() + " er ejet af " + myDog.getOwner());

        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.setOffSpring("Woodie's Snoopie");
        myDog.setOffSpring("Woodie's Fido");

        // TODO: print alle hvalpe
        ArrayList <Dog> myOff = myDog.getOffSpring();
        for (Dog myD: myOff) {
            System.out.println(myD);
        }
        // TODO: print specifik hvalp
        System.out.println(myDog.getSpecificOffSpring(1));

        // TODO: print ejeren
        System.out.println("Min hund er ejet af " + myDog.getOwner());

        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);

    }
}
