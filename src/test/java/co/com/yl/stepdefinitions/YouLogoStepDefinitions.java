package co.com.yl.stepdefinitions;

import co.com.yl.model.YourLogoData;
import co.com.yl.questions.Confirm;
import co.com.yl.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class YouLogoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^Nikka esta logueada en la pagina yourlogo y en la pantalla principal$")
    public void nikka_esta_logueada_en_la_pagina_yourlogo_y_en_la_pantalla_principal(List<YourLogoData> yourLogoDataList){
        OnStage.theActorCalled("Nikka").wasAbleTo(OpenUp.thepage(),(Signin.onPage(yourLogoDataList)));
    }

    @When("^Escoge una prenda para comprar y da click en Add to cart y en el boton proceed to checkout$")
    public void escoge_una_prenda_para_comprar_y_da_click_en_Add_to_cart_y_en_el_boton_proceed_to_checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Choose.addCart());
    }

    @When("^escoge una direccion de entrega y da click en proceed to checkout$")
    public void escoge_una_direccion_de_entrega_y_da_click_en_proceed_to_checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Delivery.address());
    }

    @When("^acepta terminos y condiciones y da click en proceed to checkout$")
    public void acepta_terminos_y_condiciones_y_da_click_en_proceed_to_checkout() {
        OnStage.theActorInTheSpotlight().attemptsTo(Iagree.terms());
    }

    @When("^escoge una forma de pago y da click en i confirm my order$")
    public void escoge_una_forma_de_pago_y_da_click_en_i_confirm_my_order() {
        OnStage.theActorInTheSpotlight().attemptsTo(Pay.confirm());
    }

    @When("^se dirige a la seccion mi cuenta y da click en order history and details$")
    public void se_dirige_a_la_seccion_mi_cuenta_y_da_click_en_order_history_and_details()  {
        OnStage.theActorInTheSpotlight().attemptsTo(Account.history());
    }

    @Then("^Verifica que aparezca su nueva compra en el historial$")
    public void verifica_que_aparezca_su_nueva_compra_en_el_historial(List<YourLogoData> yourLogoDataList)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Confirm.order(yourLogoDataList)));
    }
}
