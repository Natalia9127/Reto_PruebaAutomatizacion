package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SettingUpStep2Page {
    public static final Target BUTTON_NEXT_DEVICES = Target.the("next devices")
            .located(By.xpath("//*[contains(text(),'Next: Devices')]"));
}
