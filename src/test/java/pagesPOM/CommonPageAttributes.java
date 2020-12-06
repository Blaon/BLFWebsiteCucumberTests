package pagesPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonPageAttributes {
    public WebDriver driver;
    public WebDriverWait wait;

    public CommonPageAttributes(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait =new WebDriverWait(driver,10);
    }
}
