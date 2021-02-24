package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.SettingUpStep3Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SettingUpStep3 implements Task {


    public static SettingUpStep3 the() {
        return Tasks.instrumented(SettingUpStep3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SettingUpStep3Page.CLICK_SELECT_BRAND),
                Click.on(SettingUpStep3Page.SELECT_BRAND),
                Click.on(SettingUpStep3Page.CLICK_SELECT_MODEL),
                Click.on(SettingUpStep3Page.SELECT_MODEL),
                Click.on(SettingUpStep3Page.CLICK_SELECT_OS),
                Click.on(SettingUpStep3Page.SELECT_OS),
                Click.on(SettingUpStep3Page.BUTTON_NEXT_LASTSTEP)

        );
    }
}
