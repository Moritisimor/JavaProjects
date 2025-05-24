package JavaGameSystem.Items;

public class Weapons extends Item {
    String type;
    String enchantment;
    Integer damage;
    Boolean ranged;

    public Weapons(String name, String rarity, String type, String enchantment, Integer damage, Integer durability, Boolean ranged) {
        this.itemname = name;
        this.rarity = rarity;
        this.type = type;
        this.enchantment = enchantment;
        this.damage = damage;
        this.durability = durability;
        this.ranged = ranged;
    }
}