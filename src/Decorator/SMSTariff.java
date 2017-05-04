package Decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class SMSTariff extends TariffDecorator {
    public SMSTariff(CountTariffInterface tariff) {
        super(tariff);
    }

    @Override
    public void processTariff() {
        System.out.println("Ypu have 100 SMS");
        super.processTariff();
    }
}
