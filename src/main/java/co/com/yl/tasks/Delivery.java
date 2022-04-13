package co.com.yl.tasks;


import co.com.yl.userinterface.YourLogoAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Delivery implements Task {

    public static Delivery address() {
        return Tasks.instrumented(Delivery.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoAddress.process_address)
        );
    }
}
