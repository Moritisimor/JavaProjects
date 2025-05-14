package JavaGameSystem;

import java.util.List;
import java.util.Scanner;
import JavaGameSystem.Player.Player;

public class Main {
    public static void main(String[] args) {
        // Instance Initializing Region

        Player Player1 = new Player();

        List<String> availableClassesList = List.of("Warrior", "Mage", "Archer", "Assassin");
        List<String> availableStarterWeaponsList = List.of("Wooden Sword", "Wooden Staff", "Wooden Bow", "Wooden Shuriken");
        System.out.println("Welcome to the main method of Java Game System!");
        System.out.println("Here, you will get to set your character up.");

        Scanner Input = new Scanner(System.in);
        System.out.print("Give your character a name: ");
        String name = Input.nextLine();
        Player1.setPlayerName(name);

        System.out.println("Select your Character's class from the following options:");
        for (String i : availableClassesList) {
            System.out.println("-" + i);
        }
        while (true) {
            System.out.println("Select a class: ");
            String playerClass = Input.nextLine();
            if (availableClassesList.contains(playerClass)) {
                Player1.setPlayerClass(playerClass);
                break;
            } else {
                System.out.println("Please choose a valid class.");
            }
        }

        System.out.println("Select your Character's starting weapon from the following options:");
        for (String i : availableStarterWeaponsList) {
            System.out.println("-" + i);
        }
        while (true) {
            System.out.println("Select a starting weapon: ");
            String startingWeapon = Input.nextLine();
            if (availableStarterWeaponsList.contains(startingWeapon)) {
                Player1.setEquippedWeapon(startingWeapon);
                break;
            } else {
                System.out.println("Please choose a valid starting weapon.");
            }
        }

        System.out.println("Your Characters Data:");
        System.out.println("Name: " + Player1.getPlayerName());
        System.out.println("Class: " + Player1.getPlayerClass());
        System.out.println("Equipped Weapon: " + Player1.getEquippedWeapon());
        System.out.println("Health: " + Player1.getPlayerHealth());
        Input.close();
    }
}