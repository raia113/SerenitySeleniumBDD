package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.selectors.Selectors;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public void doLogin(){
        $(Selectors.xpathOrCssSelector("#user-name")).sendKeys("standard_user");
        $(Selectors.xpathOrCssSelector("#password")).sendKeys("secret_sauce");
        $(Selectors.xpathOrCssSelector("#login-button")).click();
    }

    public String accountPageVisible(){
        String pageTile =$(Selectors.xpathOrCssSelector("//span[@class='title']")).getText();
        System.out.println("****PAGE TITLE IS" + pageTile);
        return pageTile;

    }
}
