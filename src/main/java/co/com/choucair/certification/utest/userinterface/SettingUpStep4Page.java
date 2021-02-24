package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SettingUpStep4Page {
    public static final Target INPUT_PASSWORD = Target.the("where do we write password")
            .located(By.xpath("//input[@type='password']"));
    public  static  final Target INPUT_CONFIRMPASSWORD = Target.the("")
            .located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target SELECT_STAY_INFORMED = Target.the("where do we write confirm password")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target SELECT_ACCEPT_TERMS = Target.the("select accept term")
            .located((By.xpath("//span[@class='checkmark signup-consent__checkbox error']")));
    public static final Target SELECT_PRIVACY_POLICY = Target.the("select accept privacy and seccurity Policy")
            .located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target COMPLETE_SETUP = Target.the("complete setup")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target WELCOME_USER = Target.the("extract welcome user")
            .located(By.xpath("//h1[contains(text(),'Welcome')]"));
}
