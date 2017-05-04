package Decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class TariffDecorator implements CountTariffInterface {

    private CountTariffInterface tariff;

    @Override
    public void processTariff() {
         tariff.processTariff();
    }

    public TariffDecorator(CountTariffInterface tariff) {
        this.tariff = tariff;
    }
}
