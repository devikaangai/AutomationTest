package PagePackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
    @FindBy(id="wblhead")
    WebElement wbl;

    @FindBy(xpath = "//a[@href=\"mailto:info@whitebox-learning.com\"]")
    WebElement mailid;
    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public boolean checkwbl(){
        return wbl.isDisplayed();

    }
    public boolean checkmailid(){
        return mailid.isDisplayed();
    }
}
