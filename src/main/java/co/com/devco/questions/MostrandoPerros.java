package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import org.apache.commons.collections.list.CursorableLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static co.com.devco.userinterfaces.PetBookHomePage.*;

public class MostrandoPerros implements Question<Boolean> {

    public static MostrandoPerros son(){
        return new MostrandoPerros();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> finded = Attribute.of(IMAGENES_VISIBLES).named("src").viewedBy(actor).asList();
        List<String> cats= finded.stream().filter(url -> url.toLowerCase().contains("gato")).collect(Collectors.toList());
        return cats.isEmpty();
    }
}
