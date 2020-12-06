package pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;


public class MainPagePOM extends CommonPageAttributes {

    @FindBy(xpath = "//button[contains(.,'Linkek')]")
    WebElement linksButton;

    @FindBy(xpath = "//a[@href='https://www.nba.com/']")
    WebElement nbaLinkButton;

    @FindBy(className = "logo")
    WebElement logo;

    public void hoverLinksButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(linksButton).build().perform();
        wait.until(ExpectedConditions.visibilityOf(nbaLinkButton));
        wait.until(ExpectedConditions.elementToBeClickable(nbaLinkButton));
    }

    public void clickOnNBALink() {
        nbaLinkButton.click();
    }

    public void goToMainPage() {
        driver.navigate().to(System.getenv("HOME_PAGE"));
        wait.until(ExpectedConditions.visibilityOf(logo));
    }

    public void waitForNBAPage() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        wait.until(ExpectedConditions.urlContains("nba"));
    }


    public MainPagePOM(WebDriver driver) {
        super(driver);
    }
}
