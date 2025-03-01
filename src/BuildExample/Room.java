package BuildExample;

import PrototypeExample.CloneableGameEntity;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(this.name, this.description);
    }

    @Override
    public String toString() {
        return "\n(name = " + name + ", description = " + description+")";
    }
}
