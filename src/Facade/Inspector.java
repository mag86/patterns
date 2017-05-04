package Facade;

/**
 * Created by admin on 04.05.2017.
 */
public class Inspector implements Worker {
    @Override
    public void doJob() {
        System.out.println("Doing detalization of payments");
    }
}
