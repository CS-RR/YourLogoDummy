package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoAddress extends PageObject {

    public static final Target process_address = Target.the("Boton para seguir despues de agregar la direccion")
            .located(By.xpath("//*[@id='center_column']//*[@name='processAddress']"));
}
