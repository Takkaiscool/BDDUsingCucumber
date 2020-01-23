package pageObject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class HomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement searchField;

    public HomePage(){
        PageFactory.initElements(getDriver(),this);
    }

    public void navigateToGoogle(){
        getDriver().get("https://www.google.com");
    }

    public void enterText(String text){
        searchField.sendKeys(text);
    }
}
