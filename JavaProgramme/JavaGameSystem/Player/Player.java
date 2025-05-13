package JavaGameSystem.Player;

public class Player {
    private String playerName;
    private String equippedWeapon;
    private Integer playerHealth;
    private Integer wisdom;
    private Integer strength;
    private Integer speed;

    //Getters start here.

    public String getPlayerName() {
        return playerName;
    }

    public String getEquippedWeapon() {
        return equippedWeapon;
    }

    public Integer getHealth() {
        return playerHealth;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public Integer getStrength() {
        return strength;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void getAllData() {
        getPlayerName();
        getEquippedWeapon();
        getHealth();
        getWisdom();
        getStrength();
        getSpeed();
    }

    //Getters end here.

    //Setters start here.

    public void setPlayerName(String name) {
        this.playerName = name;
    }

    public void setEquippedWeapon(String equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void setPlayerHealth(Integer health) {
        if (health > 100) {
            System.out.println("Starting Value may not be larger than 100.");
        } 
        else if (health > 0) {
            this.playerHealth = health;
            System.out.println("Health succesfully set to " + health + ".");
        }
        else if (health <= 0) {
            System.out.println("Starting Value may not be 0 or below.");
        }
    }

    public void setWisdom(Integer wisdom) {
        if (wisdom > 100) {
            System.out.println("Starting Wisdom may not be larger than 100");
        }
        else if (wisdom > 0) {
            this.wisdom = wisdom;
            System.out.println("Wisdom Succesfully set to " + wisdom + ".");
        }
        else if (wisdom <= 0) {
            System.out.println("Wisdom may not be 0 or below.");
        }
    }

    public void setStrength(Integer strength) {
        if (strength > 100) {
            System.out.println("Strength may not be larger than 100");
        }
        else if (strength > 0) {
            this.strength = strength;
            System.out.println("Strength succesfully set to " + strength + ".");
        }
        else if (strength <= 0) {
            System.out.println("Strength may not be 0 or below.");
        }
    }

        public void setSpeed(Integer speed) {
        if (speed > 100) {
            System.out.println("Speed may not be larger than 100");
        }
        else if (speed > 0) {
            this.speed = speed;
            System.out.println("Speed succesfully set to " + speed + ".");
        }
        else if (speed <= 0) {
            System.out.println("Speed may not be 0 or below.");
        }
    }

    //Setters end here.

    public Player(String name, String equippedweapon, Integer health, Integer wisdom, Integer strength, Integer speed) {
        this.playerName = name;
        this.equippedWeapon = equippedweapon;
        this.playerHealth = health;
        this.wisdom = wisdom;
        this.strength = strength;
        this.speed = speed;
    }
}