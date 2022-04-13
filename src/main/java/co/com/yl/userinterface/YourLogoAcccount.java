package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoAcccount extends PageObject {

    public static final Target account_button = Target.the("Boton para ir a configuraciones de cuenta")
            .located(By.className("account"));
    public static final Target order_history = Target.the("Seccion historial de ordenes")
            .located(By.xpath("//*[@class='myaccount-link-list']//*[contains(text(),'Order history and details')]"));
 }
