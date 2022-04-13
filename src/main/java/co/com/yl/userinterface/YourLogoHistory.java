package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoHistory extends PageObject {

    public static final Target ver_orden = Target.the("Verifica la fecha de la orden")
            .located(By.xpath("//*[@id='order-list']/tbody/tr[1]//*[contains(text(),'04/11/2022')]"));

    /*
    Ver detalles de una compra en particular
     */
    public static final Target ver_detalles = Target.the("Ver a detalle una compra")
            .located(By.xpath("(//*[@id='order-list']//*[contains(text(),'Details')])[1]"));

    /*
    Ver que detalles me muestra la opcion detalles
     */
    public static final Target ver_direccion = Target.the("Ver direccion del pedido en los detalles de la compra")
            .located(By.xpath("//*[@id='block-order-detail']//*[contains(text(),'Delivery address')]"));
    public static final Target ver_prenda = Target.the("Ver prenda escogida en los detalles de la compra")
            .located(By.xpath("//*[@name='id_product']//*[contains(text(),'Faded Short Sleeve T-shirts')]"));
    public static final Target ver_fecha = Target.the("Ver fecha del pedido en los detalles de la compra")
            .located(By.xpath("(//*[@id='block-order-detail']//*[contains(text(),'04/11/2022')])[4]"));

    /*
    Descargar en formato PDf los detalles de la compra opcion 2 links
     */
    public static final Target download_pdf = Target.the("Decarga en pdf los detalles de la compra")
            .located(By.xpath("//*[@id='block-order-detail']//*[@target='_blank']"));
    public static final Target download_2_pdf = Target.the("Descagar en pdf los detalles de la compra por otro link")
            .located(By.xpath("(//*[@id='order-list']//*[@class='link-button'])[1]"));

}