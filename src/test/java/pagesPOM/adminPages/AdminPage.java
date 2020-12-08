package pagesPOM.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagesPOM.CommonPageAttributes;


public class AdminPage extends CommonPageAttributes {
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "SeasonsButton")
    public WebElement seasonsButton;

    @FindBy(id = "LeaguesButton")
    public WebElement leaguesButton;

    @FindBy(id = "MatchesButton")
    public WebElement matchesButton;

    @FindBy(id = "PlayersButton")
    public WebElement playersButton;

    @FindBy(id = "TeamsButton")
    public WebElement teamsButton;

    @FindBy(id = "UsersButton")
    public WebElement usersButton;

    @FindBy(id = "StatisticsButton")
    public WebElement statisticsButton;

    @FindBy(id = "AscendingIdOrderButton")
    public WebElement ascendingIdOrderButton;

    public void clickOnSeasonsButton() {
        seasonsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnLeaguesButton() {
        leaguesButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnMatchesButton() {
        matchesButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnPlayersButton() {
        playersButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnTeamsButton() {
        teamsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnUsersButton() {
        usersButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnStatisticsButton() {
        statisticsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnAscendingOrderButton() {
        ascendingIdOrderButton.click();
    }

    public void goToAdminPage() {
        driver.navigate().to(System.getenv("HOME_PAGE") + "/admin");
        wait.until(ExpectedConditions.visibilityOf(seasonsButton));
    }
}
