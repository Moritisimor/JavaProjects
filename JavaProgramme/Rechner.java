import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihre erste Zahl an: ");
        String mystring1 = sc.nextLine();

        System.out.print("Bitte geben Sie Ihre zweite Zahl an: ");
        String mystring2 = sc.nextLine();

        System.out.print("Bitte geben Sie Ihren Operator an: ");
        String operator = sc.nextLine();

        Float x = Float.parseFloat(mystring1);
        Float y = Float.parseFloat(mystring2);

        if (operator.equals("+")) {
        System.out.print("Ihr Ergebnis ist: ");
        System.out.println(x + y); }

        else if (operator.equals("-")) {
        System.out.print("Ihr Ergebnis ist: ");
        System.out.println(x - y); }

        else if (operator.equals("*")) {
        System.out.print("Ihr Ergebnis ist: ");
        System.out.println(x * y); }

        else if (operator.equals("/") && y == 0) {
        System.out.println("Kann nicht mit null dividieren."); }

        else if (operator.equals("/")) {
        System.out.print("Ihr Ergebnis ist: ");
        System.out.println(x / y); }

        else {
        System.out.println("Bitte geben Sie einen gültigen Operator an."); }

        sc.close();
    }
}