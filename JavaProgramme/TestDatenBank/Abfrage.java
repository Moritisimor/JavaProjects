package TestDatenBank;
import java.util.Scanner;

public class Abfrage {
    public static void main(String[] args) {
        System.out.println("Folgende Daten sind momentan verfügbar:");
        System.out.println("-" + "Vorname");
        System.out.println("-" + "Nachname");
        System.out.println("-" + "Adresse ");
        System.out.println("-" + "Postleitzahl");
        System.out.println("-" + "Telefonnummer");

        System.out.println("Und folgende Personen: ");
        System.out.println("-" + "maxmustermann1");
        System.out.println("-" + "hanswurst1");
        System.out.println("-" + "erikablume1");

        System.out.print("Geben Sie an, über welche Person Sie Daten abfragen möchten: ");

        Scanner sc = new Scanner(System.in);

        String abfrage = sc.nextLine();

        if (abfrage.equals("maxmustermann1")) {
            PersonenRegister.maxmustermann1.Datenanzeige();
        }

        else if (abfrage.equals("hanswurst1")) {
            PersonenRegister.hanswurst1.Datenanzeige();
        }
        
        else if (abfrage.equals("erikablume1")) {
            PersonenRegister.erikablume1.Datenanzeige();
        }

        else {
            System.out.println("Diese Person ist in der Datenbank nicht vorhanden.");
        }

        sc.close();
        }
}
