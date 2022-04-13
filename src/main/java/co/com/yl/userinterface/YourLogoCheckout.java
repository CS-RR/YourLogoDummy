package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class YourLogoCheckout extends PageObject {


    public static final Target choose_item = Target.the("Escogemos una prenda")
            .located(By.xpath("(//*[@id='center_column']//*[@title='Faded Short Sleeve T-shirts'])[1]"));
    public static final Target add_cart = Target.the("boton agregar al carrito")
            .located(By.xpath("//*[@id='add_to_cart']"));
    public static final Target button_proceed = Target.the("boton proceed to checkout")
            .located(By.xpath("//*[@id='layer_cart']//*[@title='Proceed to checkout']"));
   public static final Target button_proceed2 = Target.the("Boton proceed to checkout despues de mostrar el item selecionado")
           .located(By.xpath("//*[@id='center_column']//*[@title='Proceed to checkout']"));

}
