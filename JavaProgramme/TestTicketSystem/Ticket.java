package TestTicketSystem;

public class Ticket {
    String nutzer;
    String anliegen;
    Integer ticketnummer;
    Boolean offen;

    public Ticket(String Nutzer, String Anliegen, Integer Ticketnummer, Boolean Offen) {
        this.nutzer = Nutzer;
        this.anliegen = Anliegen;
        this.offen = Offen;
        this.ticketnummer = Ticketnummer;
    }
    
    public void Anzeigen() {
        System.out.println("Nutzer: " + nutzer);
        System.out.println("Anliegen: " + anliegen);
        System.out.println("Ticketnummer: " + ticketnummer);
        if (offen) {
            System.out.println("Status: Offen");
        }
        else {
            System.out.println("Status: Abgeschlossen");
        }
    }
}