package co.com.yl.stepdefinitions;

import co.com.yl.model.YourLogoData;
import co.com.yl.questions.Review;
import co.com.yl.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class YourLogo2StepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Nikka esta logeada en YourLogo y realizó una compra anteriormente$")
    public void nikka_esta_logeada_en_YourLogo_y_realizó_una_compra_anteriormente(List<YourLogoData> yourLogoDataList) {
        OnStage.theActorCalled("Nikka").wasAbleTo(OpenUp.thepage(), (Signin.onPage(yourLogoDataList)));
    }

    @When("^Ella va a la sección my account y da clic en Order History and Details$")
    public void ella_va_a_la_sección_my_account_y_da_clic_en_Order_History_and_Details() {
        OnStage.theActorInTheSpotlight().attemptsTo(Account.history());
    }

    @When("^Da click en Details de alguna compra$")
    public void da_click_en_Details_de_alguna_compra() {
        OnStage.theActorInTheSpotlight().attemptsTo(See.details());
    }

    @When("^Dentro de los detalles escoge la opcion Download you invoice as a Pdf file$")
    public void dentro_de_los_detalles_escoge_la_opcion_Download_you_invoice_as_a_Pdf_file() {
        OnStage.theActorInTheSpotlight().attemptsTo(Download.pdf());
    }

    @When("^En la tabla de historial de compras escoger la columna invoice y dar click en PDF$")
    public void en_la_tabla_de_historial_de_compras_escoger_la_columna_invoice_y_dar_click_en_PDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(Downloadlink.PDF());
    }

    @Then("^verifica que dirección, prenda y fecha se muestren$")
    public void verifica_que_dirección_prenda_y_fecha_se_muestren(List<YourLogoData> yourLogoDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Review.data(yourLogoDataList)));
    }

}