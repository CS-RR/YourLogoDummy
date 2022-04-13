package co.com.yl.tasks;

import co.com.yl.userinterface.YourLogoHistory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class See implements Task {
    public static See details() {
        return Tasks.instrumented(See.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoHistory.ver_detalles)
        );
    }
}
