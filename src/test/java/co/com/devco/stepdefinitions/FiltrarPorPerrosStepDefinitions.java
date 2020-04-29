package co.com.devco.stepdefinitions;

import co.com.devco.exceptions.ResultadoInesperado;
import co.com.devco.questions.MostrandoPerros;
import co.com.devco.tasks.FiltrarPorPerros;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static co.com.devco.exceptions.ResultadoInesperado.ENCONTRADO_OTRO_RESULTADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FiltrarPorPerrosStepDefinitions {



    @Cuando("^(.*) da click en la opcion perros$")
    public void FiltraPorPerros(String actor) {
        theActorCalled(actor).attemptsTo(
                FiltrarPorPerros.filtrar()
        );
    }

    @Entonces("^debe ver los perros en petbook$")
    public void debeVerLosPerrosEnPetbook() {
        theActorInTheSpotlight().should(seeThat(
                MostrandoPerros.son()).orComplainWith(
                        ResultadoInesperado.class, ENCONTRADO_OTRO_RESULTADO
                )
        );
    }
}
