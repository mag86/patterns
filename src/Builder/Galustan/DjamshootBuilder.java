package Builder.Galustan;

import Builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class DjamshootBuilder implements HouseBuilder {
    private String foundation;
    private String walls;
    private String roof;
    @Override
    public void fillFoundation() {
        foundation =" base";
    }

    @Override
    public void createWalls() {
        walls = " red";
    }

    @Override
    public void createRoof() {
        roof = " line";

    }

    @Override
    public String getResult(){
        return foundation+" "+walls+" "+roof;
    }
}
