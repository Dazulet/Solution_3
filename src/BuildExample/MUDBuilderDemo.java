package BuildExample;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        IDungeonBuilder builder = new SimpleDungeonBuilder()
                .setDungeonName("simple dungeon")
                .addRoom(new Room("Library ", "Here thera are a lot of books"))
                .addNPC(new Npc("Goblin", "its a small green mobs", 30));

        Dungeon dungeon = builder.build();
        dungeon.displayDungeon();
    }
}
