package Prototype;

/**
 * Created by admin on 03.05.2017.
 */
public abstract class ArmyDepartment implements Cloneable {
    private String id;
    protected String type;
    public int soldiers = 0;
    public int ammo = 0;
    public int vehicles = 0;

    abstract void marsh();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
