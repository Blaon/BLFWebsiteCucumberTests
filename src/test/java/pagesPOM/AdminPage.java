package pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AdminPage extends CommonPageAttributes{
    public AdminPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "SeasonsButton")
    WebElement seasonsButton;

    @FindBy(id = "LeaguesButton")
    WebElement leaguesButton;

    @FindBy(id = "MatchesButton")
    WebElement matchesButton;

    @FindBy(id = "PlayersButton")
    WebElement playersButton;

    @FindBy(id = "TeamsButton")
    WebElement teamsButton;

    @FindBy(id = "UsersButton")
    WebElement usersButton;

    @FindBy(id = "StatisticsButton")
    WebElement statisticsButton;

    @FindBy(id = "AscendingIdOrderButton")
    WebElement ascendingIdOrderButton;

    public void clickOnSeasonsButton(){
        seasonsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnLeaguesButton(){
        leaguesButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnMatchesButton(){
        matchesButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnPlayersButton(){
        playersButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnTeamsButton(){
        teamsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnUsersButton(){
        usersButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void clickOnStatisticsButton(){
        statisticsButton.click();
        wait.until(ExpectedConditions.visibilityOf(ascendingIdOrderButton));
    }

    public void goToAdminPage(){
        driver.navigate().to(System.getenv("HOME_PAGE")+"/admin");
        wait.until(ExpectedConditions.visibilityOf(seasonsButton));
    }
}
