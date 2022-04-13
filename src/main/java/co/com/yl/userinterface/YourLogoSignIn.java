package co.com.yl.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourLogoSignIn extends PageObject {

    public static final Target button_signin = Target.the("Boton para ingresar credenciales")
            .located(By.xpath("//*[@id='header']//*[contains(text(),'Sign in')]"));
    public static final Target email_box = Target.the("Campo para ingresar correo")
            .located(By.xpath("//*[@id='email']"));
    public static final Target password_box = Target.the("Campo para ingresar password")
            .located(By.xpath("//*[@id='passwd']"));
    public static final Target submit_button = Target.the("Boton sign in para ingresar con la credenciales puestas")
            .located(By.xpath("//*[@id='SubmitLogin']"));
    public static final Target women_section = Target.the("link para ir a la seccion women")
            .located(By.xpath("//*[@id='block_top_menu']//*[contains(text(),'Women')]"));

}
