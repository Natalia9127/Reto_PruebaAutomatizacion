package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.SettingUpStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strWelcome;

    public Answer(String strWelcome) {
        this.strWelcome = strWelcome;
    }

    public static Answer toThe(String strWelcome) {
        return new Answer(strWelcome);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String welcomeUser = Text.of(SettingUpStep4Page.WELCOME_USER).viewedBy(actor).asString();
        if (strWelcome.equals(welcomeUser)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
