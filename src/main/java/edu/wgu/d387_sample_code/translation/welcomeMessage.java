package edu.wgu.d387_sample_code.translation;
import java.util.Locale;
import java.util.ResourceBundle;
public class welcomeMessage implements Runnable {
    Locale locale;


    public welcomeMessage(Locale locale) {
        this.locale = locale;
    }

    public String getWelcomeMessage() {
        ResourceBundle languageBundle = ResourceBundle.getBundle("translation", locale);
        return languageBundle.getString("welcome");
    }
    @Override
    public void run() {

    }

}
