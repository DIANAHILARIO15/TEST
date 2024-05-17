package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbBusquedaStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AirbnbBusquedaStepdefs {


    @Steps
    AirbnbBusquedaStep airbnbBusquedaStep;

    @Given("cierro popUp")
    public void meMuestraElPopUpLoginLoCierro() {
        airbnbBusquedaStep.cerrarLogin();
    }

    @When("clic en el boton busqueda")
    public void doyClicEnBusqueda() {
        airbnbBusquedaStep.clicBusqueda();
    }

    @And("ingreso el destino {string}")
    public void ingresoElDestino(String destino) {
        airbnbBusquedaStep.ingresoElDestino(destino);
    }

    @And("clic en la primera opcion")
    public void clicEnLaPrimeraOpcion() {
        airbnbBusquedaStep.clicEnLaPrimeraOpcion();
    }

    @And("clic en el boton siguiente")
    public void clicEnElBotonSiguiente() {
        airbnbBusquedaStep.clicEnElBotonSiguiente();
    }

    @And("clic en el boton buscar")
    public void clicEnElBotonBusca() {
        airbnbBusquedaStep.clicEnElBotonBusca();
    }

    @Then("valido que me muestre el mensaje {string}")
    public void validoQueMeMuestreElTexto(String texto) {
        airbnbBusquedaStep.validotexto(texto);
    }

}
