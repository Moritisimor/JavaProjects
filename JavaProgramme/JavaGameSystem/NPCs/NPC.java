package JavaGameSystem.NPCs;

public class NPC {
    String name;
    Integer health;
    Integer damage;
    Boolean hostile;
    Boolean interactive;
    Boolean unique;

    public void move() {
        System.out.println(name + " moves.");
    }

    public void attackbehaviour() {
        if (hostile) {
            System.out.println(name + " attacks!");
        }
        else {
            System.out.println(name + " runs away!");
        }
    }

    public NPC(String name, Integer health, Integer damage, Boolean hostile, Boolean interactive, Boolean unique) {
        this.name = name;
        this.health = health;
        this.damage = damage; 
        this.hostile = hostile;
        this.interactive = interactive;
        this.unique = unique;
    }

    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        if (hostile) {
            System.out.println("Hostile");
        }
        else {
            System.out.println("Docile");
        }

        if (interactive) {
            System.out.println("Interactive");
        }
        else {
            System.out.println("Not Interactive");
        }
        
        if (unique) {
            System.out.println("Unique");
        }
        else {
            System.out.println("Not Unique");
        }
    }
}