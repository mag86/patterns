package Builder;

import Builder.Galustan.DjamshootBuilder;
import Builder.Svetlakov.Boss;

/**
 * Created by admin on 03.05.2017.
 */
public class ClassMain {
    public static void main(String[] args) {
        DjamshootBuilder builderDj = new DjamshootBuilder();
        Boss boss = new Boss(builderDj);
        boss.build();
    }
}
