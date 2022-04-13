package co.com.yl.tasks;

import co.com.yl.userinterface.YourLogoAcccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Account implements Task {
    public static Account history() {
        return Tasks.instrumented(Account.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoAcccount.account_button),
                Click.on(YourLogoAcccount.order_history)
        );
    }
}
