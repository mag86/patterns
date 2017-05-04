package Decorator;

/**
 * Created by admin on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        MainTarif mainTarif = new MainTarif();
        SMSTariff smsTariff = new SMSTariff(mainTarif);
        RoamingTariff roamingTariff = new RoamingTariff(smsTariff);
        InternetTariff internetTariff = new InternetTariff(roamingTariff);

        internetTariff.processTariff();

    }
}
