package PrototypeExample;

public class NPC implements CloneableGameEntity {
    private String name;
    private String description;
    private int HP;
public  NPC(){
}
    public NPC(String name, String description, int health) {
        this.name = name;
        this.description = description;
        this.HP = health;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {}
    public void setHP(int HP) {}

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
    public NPC cloneEntity() {
        return new NPC(this.name, this.description, this.HP);
    }

    @Override
    public String toString() {
        return "NPC : name =  " + name + " description = "  + description + "HP=" + HP;
    }
}
