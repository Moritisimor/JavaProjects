package JavaGameSystem.Player;

public class Player {
    private String playerName;
    private String equippedWeapon;
    private String playerClass;
    private Integer playerHealth = 100;;

    //Getter Setter Region

    public String getPlayerName() {
        return playerName;
    }
    public String getEquippedWeapon() {
        return equippedWeapon;
    }
    public String getPlayerClass() {
        return playerClass;
    }
    public Integer getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerName(String name) {
        this.playerName = name;
    }
    public void setEquippedWeapon(String equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    // Constructor
    public Player() {
    }

    public Player(String Name, String EquippedWeapon, String PlayerClass) {
        this.playerName = Name;
        this.equippedWeapon = EquippedWeapon;
        this.playerName = PlayerClass;
    }
}