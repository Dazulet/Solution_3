package MIX;

import BuildExample.Dungeon;
import BuildExample.IDungeonBuilder;
import BuildExample.SimpleDungeonBuilder;
import PrototypeExample.*;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder()
                .setDungeonName("solo leveling dange");

        Dungeon dungeon = builder.build();
        dungeon.displayDungeon();

        Room originalRoom = new Room("boos room", "there is a strange boos ");
        Room clonedRoom1 = (Room) originalRoom.cloneEntity();
        Room clonedRoom2 = (Room) originalRoom.cloneEntity();

        System.out.println("Cloned Room 1 : " + clonedRoom1);
        System.out.println("Cloned Room 2 : " + clonedRoom2);
    }
}
