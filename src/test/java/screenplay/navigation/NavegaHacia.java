package screenplay.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegaHacia {
    public static Performable laPaginaDeLogin(){
        return Task.where(
                "pablo abre el navegador en la pagina de swaglabs",
                Open.browserOn().the(laPaginaDeLogin.class)
        );
    }
}
