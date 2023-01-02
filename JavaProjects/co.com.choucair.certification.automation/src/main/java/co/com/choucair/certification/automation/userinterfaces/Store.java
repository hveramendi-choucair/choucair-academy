package co.com.choucair.certification.automation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class Store extends PageObject {

    public static final Target SEARCH_TERM = Target.the("Where customer writes the search term")
            .located(By.name("search"));
    public static final Target SEARCH_BTN = Target.the("To confirm search")
            .located(By.xpath("//*[@id=\"search\"]/span/button"));
    public static final Target SEARCH_RESULT = Target.the("verify the search result")
            .located(By.xpath("//*[@id=\"content\"]/h1"));
}