package co.com.yl.tasks;


import co.com.yl.userinterface.YourLogoCheckout;
import co.com.yl.util.MetodosYL;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Choose implements Task {

    private  MetodosYL metodosYL;

    public static Choose addCart() {
        return Tasks.instrumented(Choose.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoCheckout.choose_item)
        );

        metodosYL.swframe("//iframe[@class='fancybox-iframe']");
        actor.attemptsTo(
                Click.on(YourLogoCheckout.add_cart)
        );
        metodosYL.defaultIframe();
        actor.attemptsTo(
                Click.on(YourLogoCheckout.button_proceed),
                Click.on(YourLogoCheckout.button_proceed2)
        );
    }
}
