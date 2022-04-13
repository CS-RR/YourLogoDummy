package co.com.yl.questions;

import co.com.yl.model.YourLogoData;
import co.com.yl.userinterface.YourLogoHistory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Review implements Question<Boolean> {

    private List<YourLogoData> yourLogoDataList;

    public Review(List<YourLogoData> yourLogoDataList) {
        this.yourLogoDataList = yourLogoDataList;
    }

    public static Review data(List<YourLogoData> yourLogoDataList) {
        return new Review(yourLogoDataList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String direccion = Text.of(YourLogoHistory.ver_direccion).viewedBy(actor).asString();
        String prenda = Text.of(YourLogoHistory.ver_prenda).viewedBy(actor).asString();
        String fecha = Text.of(YourLogoHistory.ver_fecha).viewedBy(actor).asString();
        result = direccion.contains(yourLogoDataList.get(0).getDireccion()) ||
                prenda.contains(yourLogoDataList.get(0).getPrenda()) ||
                fecha.contains(yourLogoDataList.get(0).getFecha());
        System.out.println("Los datos en detalles que presenta son de:"+ "\n" +
                direccion + "\n" + prenda + "\n" + fecha);
        return result;
    }
}
