package co.com.choucair.certification.automation.questions;

import co.com.choucair.certification.automation.userinterfaces.Store;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {

    public static Verificar searchResult() {
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(Store.SEARCH_RESULT).viewedBy(actor).asString();
    }
}
