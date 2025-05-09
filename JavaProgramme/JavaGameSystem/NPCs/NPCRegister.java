package JavaGameSystem.NPCs;

public class NPCRegister {
    NPC sheep = new NPC("Sheep", 50, 0, false, false, false);
    NPC cow = new NPC("Cow", 100, 0, false, false, false);
    NPC villager = new NPC("Villager", 75, 0, false, false, false);
    NPC troll = new NPC("Troll", 150, 30, true, false, false);
    NPC orc = new NPC("Orc", 200, 50, true, false, false);
    NPC heartbourne = new NPC("General Heartbourne", 500, 100, false, true, true);
    NPC dragonbreath = new NPC("King Dragonbreath", 1000, 100, true, false, true);
    NPC wanderingtrader = new NPC("Wandering Trader", 1000000, 0, false, true, true);
}