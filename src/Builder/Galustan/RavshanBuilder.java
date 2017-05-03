package Builder.Galustan;

import Builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class RavshanBuilder implements HouseBuilder {
    private String foundation;
    private String walls;
    private String roof;
    @Override
    public void fillFoundation() {
        foundation =" base1";
    }

    @Override
    public void createWalls() {
        walls = " red1";
    }

    @Override
    public void createRoof() {
        roof = " line1";

    }

    @Override
    public String getResult(){
        return foundation+" "+walls+" "+roof;
    }
}

