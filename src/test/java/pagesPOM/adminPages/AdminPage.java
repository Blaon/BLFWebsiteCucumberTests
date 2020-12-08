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

    @FindBy(id = "OrderButton")
    public WebElement OrderByIdButton;

    @FindBy(xpath = "//tbody/tr[1]/td[1]/div")
    WebElement firstRecordId;

    public void clickOnSeasonsButton() {
        seasonsButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnLeaguesButton() {
        leaguesButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnMatchesButton() {
        matchesButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnPlayersButton() {
        playersButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnTeamsButton() {
        teamsButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnUsersButton() {
        usersButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnStatisticsButton() {
        statisticsButton.click();
        wait.until(ExpectedConditions.visibilityOf(OrderByIdButton));
    }

    public void clickOnOrderByIdButton() {
        if (Integer.parseInt(firstRecordId.getText())>5){
            OrderByIdButton.click();
        }
    }

    public void goToAdminPage() {
        driver.navigate().to(System.getenv("HOME_PAGE") + "/admin");
        wait.until(ExpectedConditions.visibilityOf(seasonsButton));
    }
}
