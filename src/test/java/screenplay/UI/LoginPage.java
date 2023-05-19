package screenplay.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public  static final Target INPUT_USERNAME =
            Target.the("input username").located(By.id("user-name"));

    public  static final Target INPUT_PASSWORD =
            Target.the("input password").located(By.id("password"));

    public  static final Target BUTTON_LOGIN =
            Target.the("button login").located(By.id("login-button"));
}
