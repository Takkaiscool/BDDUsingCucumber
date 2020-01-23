package step_definations;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import utils.BasePage;

public class Google extends BasePage {
    HomePage homePage;
    @Before
    public void openBrowser(){
        openBrowser("chrome");
        homePage = new HomePage();
    }
    @When("I navigate to google")
    public void iNavigateToGoogle(){
        homePage.navigateToGoogle();
    }
    @Then("I enter text as (.*)")
    public void iEnterTextAs(String text){
        homePage.enterText(text);
    }
    @And("I click on search")
    public  void  iClickOnSearch(){
        System.out.println("I clicked on search");
    }

    @After
    public void closeAll(){
        getDriver().quit();
    }
}
