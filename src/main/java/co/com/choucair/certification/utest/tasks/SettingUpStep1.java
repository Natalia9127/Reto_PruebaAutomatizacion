package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.SettingUpStep1Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SettingUpStep1 implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;

    public SettingUpStep1(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static SettingUpStep1 the(String strFirstName, String strLastName, String strEmail) {
        return Tasks.instrumented(SettingUpStep1.class, strFirstName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strFirstName).into(SettingUpStep1Page.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(SettingUpStep1Page.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SettingUpStep1Page.INPUT_EMAIL),
                Click.on(SettingUpStep1Page.SELECT_BIRTHMONTH),
                Click.on(SettingUpStep1Page.SELECT_BIRTHDAY),
                Click.on(SettingUpStep1Page.SELECT_BIRTHYEAR),
                Click.on(SettingUpStep1Page.BUTTON_NEXT_lOCATION)
        );
    }
}
