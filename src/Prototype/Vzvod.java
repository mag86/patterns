package Prototype;

import Prototype.interfaces.HasSoldiers;

/**
 * Created by admin on 03.05.2017.
 */
public class Vzvod extends ArmyDepartment implements HasSoldiers {
    public Vzvod() {
        type = "Vzvod";
    }

    @Override
    public int getSoldiers() {
        return soldiers;
    }

    @Override
    public void setSoldiers(int soldiers) {
        this.soldiers = soldiers;
    }

    @Override
    void marsh() {
        System.out.println("Vzvod is Marshing!!!");
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public Object clone() {
        return super.clone();
    }
}
