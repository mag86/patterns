package Factory.mauser;

import Factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class MauserFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new MauserRevolver();
    }

    @Override
    public Gun createGun() {
        return new MauserGun();
    }

    @Override
    public Rifle createRifle() {
        return new MauserRifle();
    }

    @Override
    public BFG createBFG() {
        return new MauserBFG();
    }
}
