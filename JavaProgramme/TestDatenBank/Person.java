package TestDatenBank;

public class Person {
    String Vorname;
    String Nachname;
    String Adresse;
    String Postleitzahl;
    String Telefonnummer;


    public Person(String Vorname, String Nachname, String Adresse, String Postleitzahl, String Telefonnummer) {
        this.Vorname = Vorname;
        this.Nachname = Nachname;
        this.Adresse = Adresse;
        this.Postleitzahl = Postleitzahl;
        this.Telefonnummer = Telefonnummer;
        }

    public void Datenanzeige() {
        System.out.println("Name: " + Vorname + " " + Nachname);
        System.out.println("Adresse: " + Adresse);
        System.out.println("Postleitzahl: " + Postleitzahl);
        System.out.println("Telefonnummer: " + Telefonnummer);
        }
}