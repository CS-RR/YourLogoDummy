package co.com.yl.tasks;

import co.com.yl.userinterface.YourLogoIAgree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Iagree implements Task {
    public static Iagree terms() {
        return Tasks.instrumented(Iagree.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.attemptsTo(
        Click.on(YourLogoIAgree.iagree_checkbox),
        Click.on(YourLogoIAgree.button_process)
);
    }
}
