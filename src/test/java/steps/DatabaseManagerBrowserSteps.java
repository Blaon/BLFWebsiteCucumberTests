package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesPOM.adminPages.AdminPage;

public class DatabaseManagerBrowserSteps {
    ChromeDriver driver = new ChromeDriver();
    AdminPage adminPage;

    @Before
    public void setup(){
        adminPage=new AdminPage(driver);
        driver.manage().window().maximize();
    }

    @Given("I am on admin Page")
    public void iAmOnAdminPage() {
        adminPage.goToAdminPage();
    }

    @When("I click on the seasons button")
    public void iClickOnTheSeasonsButton() {adminPage.clickOnSeasonsButton();

    }

    @When("I click on the leagues button")
    public void iClickOnTheLeaguesButton() {adminPage.clickOnLeaguesButton();

    }

    @When("I click on the matches button")
    public void iClickOnTheMatchesButton() {adminPage.clickOnMatchesButton();

    }

    @When("I click on the players button")
    public void iClickOnThePlayersButton() {adminPage.clickOnPlayersButton();

    }

    @When("I click on the teams button")
    public void iClickOnTheTeamsButton() {adminPage.clickOnTeamsButton();

    }

    @When("I click on the users button")
    public void iClickOnTheUsersButton() {adminPage.clickOnUsersButton();

    }

    @When("I click on the statistics button")
    public void iClickOnTheStatisticsButton() {adminPage.clickOnStatisticsButton();

    }

    @And("Order the table by ascending id")
    public void orderTheTableByAscendingId() {adminPage.clickOnAscendingOrderButton();
    }
}
