package TestTicketSystem;
import java.util.Scanner;

public class Abfrage {
    public static void main(String... args) {
        System.out.println("Willkommen zum Ticketabfragetool.");
        System.out.println("Folgende Daten sind über das jeweilige Ticket zur Verfügung:");
        System.out.println("-" + "Nutzer");
        System.out.println("-" + "Anliegen");
        System.out.println("-" + "Ticketnummer");
        System.out.println("-" + "Status");

        System.out.println("Folgende Tickets stehen zur Verfügung:");
        System.out.println("Max01");
        System.out.println("Hans01");
        System.out.println("Erika01");

        System.out.print("Eingabe: ");
        Scanner input = new Scanner(System.in);

        String abfrage = input.nextLine();

        if (abfrage.equalsIgnoreCase("Max01")) {
            TicketRegister.Max01.Anzeigen();
        }

        else if (abfrage.equalsIgnoreCase("Hans01")) {
            TicketRegister.Hans01.Anzeigen();
        }

        else if (abfrage.equalsIgnoreCase("Erika01")) {
            TicketRegister.Erika01.Anzeigen();
        }

        else {
            System.out.println("Kein Eintrag verfügbar.");
        }

        input.close();
    }
}
