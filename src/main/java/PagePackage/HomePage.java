package PagePackage;

import BaseClassPackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;

public class HomePage extends BaseClass {
    @FindBy(xpath = "//img[@id=\"logo\"]")
    WebElement wblogo;
    @FindBy(xpath = "//button[@id=\"headerfblogin\"]")
    WebElement freestudent;
    @FindBy(xpath = "//a[@id=\"loginButton\"]")
    WebElement loginbtn;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public boolean checkwbllogo(){
        return wblogo.isDisplayed();

    }
    public boolean checkfreestudent(){
        return freestudent.isDisplayed();
    }
    public LoginPage clicklogin() {
        loginbtn.click();
        return new LoginPage(driver);


    }
    }
