package screenplay.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.UI.LoginPage;


public class ingresarCredencialesFormularioLogin implements Task {

    private final String username;
    private final  String password;

    public ingresarCredencialesFormularioLogin(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static ingresarCredencialesFormularioLogin Credenciales(String username, String password){
        return new ingresarCredencialesFormularioLogin(username, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(password).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }
}
