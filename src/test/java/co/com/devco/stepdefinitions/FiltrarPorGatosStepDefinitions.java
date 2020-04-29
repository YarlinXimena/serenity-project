package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoInesperado;
import co.com.devco.questions.MostrandoGatos;
import co.com.devco.questions.MostrandoPerros;
import co.com.devco.tasks.FiltrarPorGatos;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarPorGatosStepDefinitions {

    @Cuando("^(.*) da click en la opcion gatos$")
    public void FiltraPorGatos(String actor) {
        theActorCalled(actor).attemptsTo(
                FiltrarPorGatos.filtrar()
        );
    }

    @Entonces("^debe ver los gatos en petbook$")
    public void debeVerLosGatosEnPetbook() {
        theActorInTheSpotlight().should(seeThat(
                MostrandoGatos.son()).orComplainWith(
                        ResultadoInesperado.class, ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
