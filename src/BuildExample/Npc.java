package BuildExample;

import PrototypeExample.CloneableGameEntity;

public class Npc implements CloneableGameEntity {
    private String name;
    private String description;
    private int HP;

    public Npc(String name, String description, int HP) {
        this.name = name;
        this.description = description;
        this.HP = HP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHP() {
        return HP;
    }

    @Override
    public Npc cloneEntity() {
        return new Npc(this.name, this.description, this.HP);
    }

    @Override
    public String toString() {
        return "\nname = " + name + "\ndescription = " + description + "\nHP = " + HP + "\n";
    }
}
