package Prototype;

import Prototype.interfaces.HasAmmo;
import Prototype.interfaces.HasSoldiers;
import Prototype.interfaces.HasVehicles;

/**
 * Created by admin on 03.05.2017.
 */
public class Batalion extends ArmyDepartment implements HasSoldiers, HasAmmo, HasVehicles {
    public Batalion() {
        type = "Batalion";
    }

    @Override
    public int getVehicles() {
        return vehicles;
    }

    @Override
    public void setVehiles(int vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public int getAmmo() {
        return ammo;
    }

    @Override
    public void sertAmmo(int ammo) {
        this.ammo = ammo;
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
        System.out.println("Batalion is Marshing!!!");
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
