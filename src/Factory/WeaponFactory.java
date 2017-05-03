package Factory;

/**
 * Created by admin on 03.05.2017.
 */
public interface WeaponFactory {
    abstract Revolver createRevolver ();
    abstract Gun createGun ();
    abstract Rifle createRifle ();
    abstract BFG createBFG();
}
