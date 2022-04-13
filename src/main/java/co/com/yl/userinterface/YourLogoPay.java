package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoPay extends PageObject {

    public static final Target bank_wire = Target.the("Metodo de pago con tarjeta")
            .located(By.xpath("//*[@id='HOOK_PAYMENT']//*[@class='bankwire']"));
    public static final Target button_confirm = Target.the("Boton confirmar pago")
            .located(By.xpath("//*[@id='cart_navigation']//*[contains(text(),'I confirm my order')]"));
}
