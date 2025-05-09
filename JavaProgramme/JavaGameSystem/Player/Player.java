package JavaGameSystem.Player;

public class Player {
    String playername;
    String equippedweapon;
    Integer health;
    Integer wisdom;
    Integer strength;
    Integer speed;
    Integer intelligence;

    public Player(String playername, String equippedweapon, Integer health, Integer wisdom, Integer strength, Integer speed, Integer intelligence) {
        this.playername = playername;
        this.equippedweapon = equippedweapon;
        this.health = health;
        this.wisdom = wisdom;
        this.strength = strength;
        this.speed = speed;
        this.intelligence = intelligence;
    }

    public void ShowPlayerData() {
        System.out.println("Name: " + playername);
        System.out.println("Health: " + health);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Strength: " + strength);
        System.out.println("Speed: " + speed);
        System.out.println("Intelligence: " + intelligence);
    }
}