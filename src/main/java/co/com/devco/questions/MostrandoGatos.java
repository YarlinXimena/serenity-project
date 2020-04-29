package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

import java.util.List;
import java.util.stream.Collectors;

import static co.com.devco.userinterfaces.PetBookHomePage.IMAGENES_VISIBLES;

public class MostrandoGatos implements Question<Boolean> {

    public static MostrandoGatos son(){
        return new MostrandoGatos();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> finded = Attribute.of(IMAGENES_VISIBLES).named("src").viewedBy(actor).asList();
        List<String> dogs= finded.stream().filter(url -> url.toLowerCase().contains("perro")).collect(Collectors.toList());
        return dogs.isEmpty();
    }
}
