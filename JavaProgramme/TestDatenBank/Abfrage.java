package TestDatenBank;
import java.util.Scanner;

public class Abfrage {
    public static void main(String[] args) {
        System.out.println("Folgende Daten sind momentan verfügbar:");
        System.out.println("Vorname");
        System.out.println("Nachname");
        System.out.println("Name");
        System.out.println("Adresse");
        System.out.println("Postleitzahl");
        System.out.println("Telefonnummer");

        System.out.print("Geben Sie an, was Sie über diese Person wissen möchten: ");

        Scanner sc = new Scanner(System.in);

        String abfrage = sc.nextLine();

        if (abfrage.equalsIgnoreCase("Vorname")) {
            System.out.print("Der Vorname dieser Person lautet: ");
            Person.vorname(); }

        else if (abfrage.equalsIgnoreCase("Nachname")) {
            System.out.print("Der Nachname dieser Person lautet: ");
            Person.nachname(); }

        else if (abfrage.equalsIgnoreCase("Name")) {
            Person.vorname(); 
            System.out.print(" ");
            Person.nachname(); }
        
        else if (abfrage.equalsIgnoreCase("Adresse")) {
            System.out.print("Die Adresse dieser Person lautet: ");
            Person.adresse(); }
        
        else if (abfrage.equalsIgnoreCase("Postleitzahl")) {
            System.out.print("Die Postleitzahl dieser Person lautet: ");
            Person.postleitzahl(); }

        else if (abfrage.equalsIgnoreCase("Telefonnummer")) {
            System.out.print("Die Telefonnumer dieser Person lautet: ");
            Person.telefonnummer(); }

        else {
            System.out.print("Diese Daten sind über die Person nicht bekannt."); }

        sc.close();
        }
}