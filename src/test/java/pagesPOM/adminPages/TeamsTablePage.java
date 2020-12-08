package pagesPOM.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesPOM.CommonPageAttributes;

public class TeamsTablePage extends CommonPageAttributes {
    public TeamsTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[3]/div")
    WebElement firstRecordName;

    public String getFirstRecordText() {
        return firstRecordName.getText();
    }
}
