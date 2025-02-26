package PrototypeExample;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("dungeon", "simple dange");
        Room clonedRoom = prototypeRoom.cloneEntity();

        NPC prototypeNPC = new NPC("goblin", "a small green mobs.", 50);
        NPC clonedNPC = prototypeNPC.cloneEntity();

        clonedNPC = new NPC("leader goblin", "a smart goblin.", 75);

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Modified Cloned NPC: " + clonedNPC);
    }
}
