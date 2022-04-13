package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoIAgree extends PageObject {

    public static final Target iagree_checkbox = Target.the("Hacer check para aceptar terminos y condiciones")
            .located(By.xpath("//*[@id='uniform-cgv']//*[@id='cgv']"));

    public static final Target button_process = Target.the("Boton para continuar a forma de pago")
            .located(By.xpath("//*[@id='form']//*[@name='processCarrier']"));
}
