package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.SettingUpStep4Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SettingUpStep4 implements Task{

    private String strPassword;
    private String strConfirmPassword;

    public SettingUpStep4(String strPassword, String strConfirmPassword) {
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static SettingUpStep4 the(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(SettingUpStep4.class, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strPassword).into(SettingUpStep4Page.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(SettingUpStep4Page.INPUT_CONFIRMPASSWORD),
                Click.on(SettingUpStep4Page.SELECT_STAY_INFORMED),
                Click.on(SettingUpStep4Page.SELECT_ACCEPT_TERMS),
                Click.on(SettingUpStep4Page.SELECT_PRIVACY_POLICY),
                Click.on(SettingUpStep4Page.COMPLETE_SETUP)
        );

    }
}
