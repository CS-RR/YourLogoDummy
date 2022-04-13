package co.com.yl.tasks;

import co.com.yl.userinterface.YourLogoPay;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Pay implements Task {

    public static Pay confirm() {
        return Tasks.instrumented(Pay.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(YourLogoPay.bank_wire),
        Click.on(YourLogoPay.button_confirm)
);
    }
}
