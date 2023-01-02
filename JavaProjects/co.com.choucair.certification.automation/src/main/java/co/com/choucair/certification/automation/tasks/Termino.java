package co.com.choucair.certification.automation.tasks;

import co.com.choucair.certification.automation.userinterfaces.Store;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Termino implements Task {

    public static Termino terminoDeBusqueda() {
        return Tasks.instrumented(Termino.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Sony").into(Store.SEARCH_TERM),
                Click.on(Store.SEARCH_BTN));
    }
}
