package TestDatenBank;
import java.util.Scanner;

public class Abfrage {
    public static void main(String[] args) {
        //Personenspeicheranfang
        Person maxmustermann1 = new Person("Max", "Mustermann", "Musterstraße 123", "Postleitzahl", "123456789");
        Person hanswurst1 = new Person("Hans", "Wurst", "Wurststraße", "54321", "987654321");
        //Personenspeicherende

        System.out.println("Folgende Daten sind momentan verfügbar:");
        System.out.println("Vorname");
        System.out.println("Nachname");
        System.out.println("Adresse");
        System.out.println("Postleitzahl");
        System.out.println("Telefonnummer");

        System.out.println(" ");
        System.out.println("Und folgende Personen: ");
        System.out.println("maxmustermann1");

        System.out.print("Geben Sie an, über welche Person Sie Daten abfragen möchten: ");

        Scanner sc = new Scanner(System.in);

        String abfrage = sc.nextLine();

        if (abfrage.equals("maxmustermann1")) {
            maxmustermann1.Datenanzeige();
        }

        else if (abfrage.equals("hanswurst1")) {
            hanswurst1.Datenanzeige();
        }

        sc.close();
        }
}