package step_definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
    @When("I navigate to google")
    public void iNavigateToGoogle(){
        System.out.println("Yes i am in google");
    }
    @Then("I enter text as (.*)")
    public void iEnterTextAs(String text){
        System.out.println("Entered text is "+text);
    }
    @And("I click on search")
    public  void  iClickOnSearch(){
        System.out.println("I clicked on search");
    }
}
