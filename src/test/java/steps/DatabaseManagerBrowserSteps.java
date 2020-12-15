package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pagesPOM.adminPages.*;

public class DatabaseManagerBrowserSteps {
    AdminPage adminPage;
    LeaguesTablePage leaguesTablePage;
    MatchesTablePage matchesTablePage;
    PlayersTablePage playersTablePage;
    SeasonsTablePage seasonsTablePage;
    StatisticsTablePage statisticsTablePage;
    TeamsTablePage teamsTablePage;
    UsersTablePage usersTablePage;

    @Before
    public void setup() {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        adminPage = new AdminPage(driver);
        leaguesTablePage = new LeaguesTablePage(driver);
        matchesTablePage = new MatchesTablePage(driver);
        playersTablePage = new PlayersTablePage(driver);
        seasonsTablePage = new SeasonsTablePage(driver);
        statisticsTablePage = new StatisticsTablePage(driver);
        teamsTablePage = new TeamsTablePage(driver);
        usersTablePage = new UsersTablePage(driver);

    }

    @Given("I am on admin Page")
    public void iAmOnAdminPage() {
        adminPage.goToAdminPage();
    }

    @When("I click on the seasons button")
    public void iClickOnTheSeasonsButton() {
        adminPage.clickOnSeasonsButton();

    }

    @When("I click on the leagues button")
    public void iClickOnTheLeaguesButton() {
        adminPage.clickOnLeaguesButton();

    }

    @When("I click on the matches button")
    public void iClickOnTheMatchesButton() {
        adminPage.clickOnMatchesButton();

    }

    @When("I click on the players button")
    public void iClickOnThePlayersButton() {
        adminPage.clickOnPlayersButton();

    }

    @When("I click on the teams button")
    public void iClickOnTheTeamsButton() {
        adminPage.clickOnTeamsButton();

    }

    @When("I click on the users button")
    public void iClickOnTheUsersButton() {
        adminPage.clickOnUsersButton();

    }

    @When("I click on the statistics button")
    public void iClickOnTheStatisticsButton() {
        adminPage.clickOnStatisticsButton();

    }

    @And("Order the table by ascending id")
    public void orderTheTableByAscendingId() {
        adminPage.clickOnOrderByIdButton();
    }

    @Then("The first record should be 2011-2012")
    public void theFirstRecordShouldBe20112012() {
        Assert.assertEquals("2011-2012", seasonsTablePage.getFirstRecordText());
    }

    @Then("The first record should be ismeretlen liga")
    public void theFirstRecordShouldBeIsmeretlenLiga() {
        Assert.assertEquals("ismeretlen Liga", leaguesTablePage.getFirstRecordText());

    }

    @Then("The first record should be a match on 2010-09-04 13:00")
    public void theFirstRecordShouldBeAMatchOn() {
        Assert.assertEquals("2010-09-04 13:00", matchesTablePage.getFirstRecordText());
    }

    @Then("The first record should be Bitvai Attila")
    public void theFirstRecordShouldBeBitvaiAttila() {
        Assert.assertEquals("Bitvai Attila", playersTablePage.getFirstRecordText());

    }

    @Then("The first record should be BLF Palota - NB.II.")
    public void theFirstRecordShouldBeBLFPalotaNBII() {
        Assert.assertEquals("BLF Palota - NB.II.", teamsTablePage.getFirstRecordText());

    }

    @Then("The first record should be AAATesterAdmin")
    public void theFirstRecordShouldBeAAATesterAdmin() {
        Assert.assertEquals("AAATesterAdmin", usersTablePage.getFirstRecordText());

    }

    @Then("The first record should be Solymosi Tamás")
    public void theFirstRecordShouldBeSolymosiTamás() {
        Assert.assertEquals("Solymosi Tamás", statisticsTablePage.getFirstRecordText());
    }
}
