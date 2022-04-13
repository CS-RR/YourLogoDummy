package co.com.yl.tasks;

import co.com.yl.userinterface.YourLogoHistory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Download implements Task {

    public static Download pdf() {
        return Tasks.instrumented(Download.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoHistory.download_pdf)
        );
    }

}
