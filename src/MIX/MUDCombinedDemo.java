package MIX;

import BuildExample.*;
import BuildExample.Room;
import PrototypeExample.*;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dd = builder
                .setDungeonName("Simple Dungeon")
                .addRoom(new Room("Library", "Here there are a lot of books"))
                .addRoom(new Room("Boss Room", "A dangerous enemy lurks here"))
                .addNPC(new Npc("Goblin", "It's a small green mob", 30))
                .addNPC(new Npc("Orc", "A strong big goblin", 100))
                .build();

        Dungeon clonedDungeon = dd.cloneEntity();

        Room clonedRoom = dd.cloneRoom(0);

        Npc clonedNpc = dd.cloneNpc(1);
clonedNpc.setName("Leader goblin");
clonedNpc.setDescription("a smart goblin");
        System.out.println("its origanal dangerous enemies");
        dd.displayDungeon();
        System.out.println();

        System.out.println("copy dangeon ");
        clonedDungeon.displayDungeon();
        System.out.println();

        System.out.println("copy room ");
        System.out.println(clonedRoom);
        System.out.println();

        System.out.println("copy npc ");
        System.out.println(clonedNpc);
    }
}
