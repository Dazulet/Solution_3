package BuildExample;

import PrototypeExample.CloneableGameEntity;
import java.util.ArrayList;
import java.util.List;

public class Dungeon implements CloneableGameEntity {
    private String name;
    private List<Room> rooms;
    private List<Npc> npcs;

    public Dungeon() {
        rooms = new ArrayList<>();
        npcs = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setNpcs(List<Npc> npcs) {
        this.npcs = npcs;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Npc> getNpcs() {
        return npcs;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNpc(Npc npc) {
        npcs.add(npc);
    }

    @Override
    public Dungeon cloneEntity() {
        Dungeon clonedDungeon = new Dungeon();
        clonedDungeon.setName(this.name);

        for (Room room : this.rooms) {
            clonedDungeon.addRoom(room.cloneEntity());
        }
        for (Npc npc : this.npcs) {
            clonedDungeon.addNpc(npc.cloneEntity());
        }
        return clonedDungeon;
    }

    public Room cloneRoom(int index) {
            return rooms.get(index).cloneEntity();

    }

    public Npc cloneNpc(int index) {
            return npcs.get(index).cloneEntity();
    }

    public void displayDungeon() {
        System.out.println("Dungeon : " + name);
        System.out.println("Room : " + rooms);
        System.out.println("NPC : " + npcs);
    }
}
