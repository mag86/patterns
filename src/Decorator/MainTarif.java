package Decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class MainTarif implements CountTariffInterface {
    @Override
    public void processTariff() {
        System.out.println("This is MTS tariff");
    }
}
