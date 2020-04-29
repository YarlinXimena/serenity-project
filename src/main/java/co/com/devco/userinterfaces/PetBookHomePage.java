package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PetBookHomePage {
	public static final String PETBOOK_HOME = "localhost:4200";
	public static final Target BUTTON_PERROS = Target.the("Boton de filtro de perros").located(By.id("filterPerros"));
	public static final Target BUTTON_GATOS = Target.the("Boton de filtro de gatos").located(By.id("filterGatos"));
	public static final Target IMAGENES_VISIBLES = Target.the("Lista de imagenes visibles").located(By.xpath("//*[@id='listaImagenes']/li//img"));
}
