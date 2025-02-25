package BuildExample;

import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<Npc> npcs;

    public Dungeon(String name, List<Room> rooms, List<Npc> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void displayDungeon() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms.size());
        System.out.println("NPCs: " + npcs.size());
    }
}
