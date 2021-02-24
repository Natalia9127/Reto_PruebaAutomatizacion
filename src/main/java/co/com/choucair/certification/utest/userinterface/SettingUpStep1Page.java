package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SettingUpStep1Page {

    public static final Target INPUT_FIRSTNAME = Target.the("where do we write first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write email")
            .located(By.id("email"));
    public static final Target SELECT_BIRTHMONTH = Target.the("select month")
            .located(By.xpath("//select[@id='birthMonth']//option[contains(text(),'April')]"));
    public static final Target SELECT_BIRTHDAY = Target.the("select day")
            .located(By.xpath("//select[@id='birthDay']//option[contains(text(),'27')]"));
    public static final Target SELECT_BIRTHYEAR = Target.the("select year")
            .located(By.xpath("//select[@id='birthYear']//option[contains(text(),'1991')]"));
    public  static final Target BUTTON_NEXT_lOCATION = Target.the("next location")
            .located(By.xpath("//*[contains(text(),'Next: Location')]"));
}
