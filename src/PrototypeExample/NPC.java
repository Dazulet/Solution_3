package PrototypeExample;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int HP;

    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.HP = health;
    }

    @Override
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.HP);
    }

    @Override
    public String toString() {
        return "NPC : name =  " + name + " description = "  + description + "HP=" + HP;
    }
}
