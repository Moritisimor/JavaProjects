package JavaGameSystem;

import java.util.Scanner;
import JavaGameSystem.Player.Player;

public class Main {
    public static void main(String[] args) {
        // Instance Initializing Region

        Player Markus = new Player("Markus", "none", 150, 50, 100, 50);

        System.out.println("Welcome to the main method of Java Game System!");
        System.out.println("What do you want to know about?");
        String[] availableClasses = {"Player", "NPCs", "Items"};
        for (String availableClass : availableClasses) {
            System.out.println("-" + availableClass);
        }

        Scanner Input = new Scanner(System.in);
        System.out.print("Input: ");
        String query = Input.nextLine();
        if (query.equalsIgnoreCase("Player")) {
            System.out.println("Name: " + Markus.getPlayerName());
            System.out.println("Equipped Weapon: " + Markus.getEquippedWeapon());
            System.out.println("Health: " + Markus.getHealth());
            System.out.println("Wisdom: " + Markus.getWisdom());
            System.out.println("Strength: " + Markus.getStrength());
            System.out.println("Speed: " + Markus.getSpeed());
        }

        Input.close();
    }
}