package screenplay.questions;

import net.serenitybdd.screenplay.Question;
import screenplay.UI.InventarioPage;

public class ComparacionInventario {

    public static Question<Boolean> tituloProducto(){
        return actor -> InventarioPage.LABEL_TITLE.resolveFor(actor).getText().contains("Products");
    }


}
