package BuildExample;

import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;

    public SimpleDungeonBuilder() {
        dungeon = new Dungeon();
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        dungeon.setName(name);
        return this;
    }

    public IDungeonBuilder addRoom(Room room) {
        dungeon.getRooms().add(room);
        return this;
    }

    public IDungeonBuilder addNPC(Npc npc) {
        dungeon.getNpcs().add(npc);
        return this;
    }

    public Dungeon build() {
        return dungeon;
    }
}
