package BuildExample;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dd = builder
                .setDungeonName("Simple Dungeon")
                .addRoom(new Room("Library", "Here there are a lot of books"))
                .addNPC(new Npc("Goblin", "It's a small green mob", 30))
                .build();

        dd.displayDungeon();
    }
}
