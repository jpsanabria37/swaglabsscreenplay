package stepsdefinitions;

import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.navigation.NavegaHacia;

import screenplay.questions.ComparacionInventario;
import screenplay.tasks.ingresarCredencialesFormularioLogin;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class LoginStepsDefinitions {


    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Pablo");
    }

    @Given("Pablo se encuentra en el formulario de acceso")
    public void pablo_se_encuentra_en_el_formulario_de_acceso() {
        OnStage.theActorInTheSpotlight().wasAbleTo(NavegaHacia.laPaginaDeLogin());
    }

    @When("Pablo ingresa las credenciales correctas")
    public void pablo_ingresa_las_credenciales_correctas() {
        String username = "standard_user";
        String password = "secret_sauce";

        OnStage.theActorInTheSpotlight().attemptsTo(ingresarCredencialesFormularioLogin.Credenciales(username,password));
    }

    @Then("Pablo debera ver la lista de productos")
    public void pablo_debera_ver_la_lista_de_productos() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("pablo ve el titulo en la pagina del inventario", ComparacionInventario.tituloProducto(), equalTo(Boolean.TRUE))
        );
    }


}
