package Bridges;

/**
 * Created by admin on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        BasicSocialWeb faceBookSocialWeb =
                new FacebookSocialWeb();
        ExtendedSocialWeb extendedSocialWeb =
                new ExtendedSocialWebAdapter(faceBookSocialWeb);

        System.out.println(
                extendedSocialWeb
                        .getHistory(1, "04.05.2017")
        );

        System.out.println(
                extendedSocialWeb
                        .getLikes(1,
                                true,
                                2)
        );


    }
}
