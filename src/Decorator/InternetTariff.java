package Decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class InternetTariff extends TariffDecorator {
    public InternetTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("You have 3.5 Mb/s");
        super.processTariff();
    }
}
