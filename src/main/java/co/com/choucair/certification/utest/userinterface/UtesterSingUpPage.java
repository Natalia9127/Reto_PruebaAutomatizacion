package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtesterSingUpPage {

    public static final Target SELECT_SIGNUP = Target.the("Click on Join Today")
            .located(By.linkText("Join Today"));
}
