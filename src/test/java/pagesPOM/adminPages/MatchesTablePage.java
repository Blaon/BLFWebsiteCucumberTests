package pagesPOM.adminPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesPOM.CommonPageAttributes;

public class MatchesTablePage extends CommonPageAttributes {
    public MatchesTablePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//tbody/tr[1]/td[2]/div")
    WebElement firstRecordName;

    public String getFirstRecordText() {
        return firstRecordName.getText();
    }
}
