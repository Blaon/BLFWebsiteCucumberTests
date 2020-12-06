package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesPOM.AdminPage;

public class DatabaseManagerBrowserSteps {
    ChromeDriver driver = new ChromeDriver();

    @Before
    public void setup(){
        AdminPage adminPage=new AdminPage(driver);
        driver.manage().window().maximize();
    }

    @Given("I am on admin Page")
    public void iAmOnAdminPage() {

    }

    @When("I click on the seasons button")
    public void iClickOnTheSeasonsButton() {

    }

    @When("I click on the leagues button")
    public void iClickOnTheLeaguesButton() {

    }

    @When("I click on the matches button")
    public void iClickOnTheMatchesButton() {

    }

    @When("I click on the players button")
    public void iClickOnThePlayersButton() {

    }

    @When("I click on the teams button")
    public void iClickOnTheTeamsButton() {

    }

    @When("I click on the users button")
    public void iClickOnTheUsersButton() {

    }

    @When("I click on the statistics button")
    public void iClickOnTheStatisticsButton() {

    }

    @And("Order the table by ascending id")
    public void orderTheTableByAscendingId() {
    }
}
