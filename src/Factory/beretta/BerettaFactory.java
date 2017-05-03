package Factory.beretta;

import Factory.*;

/**
 * Created by admin on 03.05.2017.
 */
public class BerettaFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return new BerettaRevolver();
    }

    @Override
    public Gun createGun() {
        return new BerettaGun();
    }

    @Override
    public Rifle createRifle() {
        return new BerettaRifle();
    }

    @Override
    public BFG createBFG() {
        return null;
    }
}
