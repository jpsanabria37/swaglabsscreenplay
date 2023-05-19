package screenplay.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventarioPage {
    public  static final Target LABEL_TITLE =
            Target.the("label title").located(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
}
