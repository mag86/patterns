package Builder.Svetlakov;

import Builder.HouseBuilder;

/**
 * Created by admin on 03.05.2017.
 */
public class Boss {
    private HouseBuilder builder;

    public Boss(HouseBuilder builder){
        this.builder = builder;
    }

    public void build(){
        builder.fillFoundation();
        builder.createRoof();
        builder.createWalls();
        System.out.println(builder.getResult());

    }
}
