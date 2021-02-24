package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.SettingUpStep2Page;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SettingUpStep2 implements Task {
    public static SettingUpStep2 the() {
        return Tasks.instrumented(SettingUpStep2.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SettingUpStep2Page.BUTTON_NEXT_DEVICES));
    }
}
