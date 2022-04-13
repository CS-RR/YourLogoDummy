package co.com.yl.tasks;

import co.com.yl.model.YourLogoData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.yl.userinterface.YourLogoSignIn.*;

public class Signin implements Task {


    private final List<YourLogoData> yourLogoDataList;

    public Signin(List<YourLogoData> yourLogoDataList) {
        this.yourLogoDataList = yourLogoDataList;
    }

    public static Signin onPage(List<YourLogoData> yourLogoDataList) {
        return Tasks.instrumented(Signin.class,yourLogoDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
actor.wasAbleTo(
        Click.on(button_signin),
        Enter.theValue(yourLogoDataList.get(0).getUser()).into(email_box),
        Enter.theValue(yourLogoDataList.get(0).getPassword()).into(password_box),
        Click.on(submit_button),
        Click.on(women_section)
);
    }
}
