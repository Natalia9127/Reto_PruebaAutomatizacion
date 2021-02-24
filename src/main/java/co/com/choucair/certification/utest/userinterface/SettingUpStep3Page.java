package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SettingUpStep3Page {
    public static final Target CLICK_SELECT_BRAND = Target.the("Your Mobile Device: click select brand")
            .located(By.xpath("//div[@placeholder='Select Brand']"));
    public static final Target SELECT_BRAND = Target.the("select brand")
            .located(By.xpath("//div[@id='ui-select-choices-row-6-23']"));
    public static final Target CLICK_SELECT_MODEL = Target.the("click select model")
            .located(By.xpath("//div[@placeholder='Select a Model']"));
    public static final Target SELECT_MODEL = Target.the("select model")
            .located(By.xpath("//div[@id='ui-select-choices-row-7-158']"));
    public static final Target CLICK_SELECT_OS = Target.the("click select ")
            .located(By.xpath("//div[@name='handsetOSId']//div[@placeholder='Select OS']"));
    public static final Target SELECT_OS = Target.the("select Operating System")
            .located(By.xpath("//div[@id='ui-select-choices-row-8-1']"));
    public static final Target BUTTON_NEXT_LASTSTEP = Target.the("next last step")
            .located(By.xpath("//*[contains(text(),'Next: Last Step')]"));
}
