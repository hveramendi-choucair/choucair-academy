package co.com.choucair.certification.automation.stepdefinitions;

import co.com.choucair.certification.automation.questions.Verificar;
import co.com.choucair.certification.automation.tasks.AbrirPagina;
import co.com.choucair.certification.automation.tasks.Termino;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class BusquedaStepDefs {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^a customer wants to search a product at the online store$")
    public void aCustomerWantsToSearchAProductAtTheOnlineStore() {
        OnStage.theActorCalled("Customer").wasAbleTo(AbrirPagina.urlWeb());
    }

    @When("^he search for term Sony on the online store$")
    public void heSearchForTermSonyOnTheOnlineStore() {
        OnStage.theActorInTheSpotlight().attemptsTo(Termino.terminoDeBusqueda());
    }

    @Then("^he find a product called Sony Vaio$")
    public void heFindAProductCalledSonyVaio() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.searchResult(), Matchers.equalTo("Search - Sony")));
    }
}
