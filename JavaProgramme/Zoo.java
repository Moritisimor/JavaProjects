import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Welches Tier möchten Sie sehen? ");
        String tier = sc.nextLine();

        if (tier.equalsIgnoreCase("Katze")) {
        System.out.print("Das Tier macht: ");
        Katze.Geraeusch();
        System.out.print("Das Tier hat die Farbe: ");
        Katze.Farbe();
        System.out.print("Das Tier hat so viele Beine: ");
        Katze.AnzahlBeine(); }

        else if (tier.equalsIgnoreCase("Hund")) {
        System.out.print("Das Tier macht: ");
        Hund.Geraeusch();
        System.out.print("Das Tier hat die Farbe: ");
        Hund.Farbe();
        System.out.print("Das Tier hat so viele Beine: ");
        Hund.AnzahlBeine(); }

        else if (tier.equalsIgnoreCase("Vogel")) {
        System.out.print("Das Tier macht: ");
        Vogel.Geraeusch();
        System.out.print("Das Tier hat die Farbe: ");
        Vogel.Farbe();
        System.out.print("Das Tier hat so viele Beine: ");
        Vogel.AnzahlBeine(); }

        else {
        System.out.print(tier + " sagst du? Das haben wir hier nicht."); }

        sc.close(); } 
}

class Katze {
	public static void Geraeusch() {
		System.out.println("Miau!"); }

	public static void Farbe() {
		System.out.println("Schwarz"); }

	public static void AnzahlBeine() {
		System.out.println(4); }
}

class Hund {
    public static void Geraeusch() {
        System.out.println("Wuff!"); }

    public static void Farbe() {
        System.out.println("Gold"); }

    public static void AnzahlBeine() {
        System.out.println(4); }
}

class Vogel {
    public static void Geraeusch() {
        System.out.println("Chiep Chiep!"); }

    public static void Farbe() {
        System.out.println("Bunt"); }

    public static void AnzahlBeine() {
        System.out.println(2); }
}