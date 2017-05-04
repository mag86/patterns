package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class HR implements Observable {
    List<Observer> observers =  new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer:observers
                ) {
            observer.message("we have new job");

        }

    }
}