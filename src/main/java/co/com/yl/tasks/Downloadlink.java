package co.com.yl.tasks;


import co.com.yl.userinterface.YourLogoHistory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Downloadlink implements Task {

    public static Downloadlink PDF() {
        return Tasks.instrumented(Downloadlink.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YourLogoHistory.download_2_pdf)
        );
    }
}
