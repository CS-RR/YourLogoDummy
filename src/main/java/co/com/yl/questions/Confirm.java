package co.com.yl.questions;

import co.com.yl.model.YourLogoData;
import co.com.yl.userinterface.YourLogoHistory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Confirm implements Question<Boolean> {

    private List<YourLogoData> yourLogoDataList;

    public Confirm(List<YourLogoData> yourLogoDataList) {
        this.yourLogoDataList = yourLogoDataList;
    }

    public static Confirm order(List<YourLogoData> yourLogoDataList) {
        return new Confirm(yourLogoDataList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String date = Text.of(YourLogoHistory.ver_orden).viewedBy(actor).asString();
        result = date.equals(yourLogoDataList.get(0).getFecha());
        System.out.println("Fecha actual: " + date );
        return result;
    }
}
