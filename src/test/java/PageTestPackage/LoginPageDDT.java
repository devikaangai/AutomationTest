package PageTestPackage;

import BaseClassPackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageDDT extends BaseClass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;
    public LoginPageDDT(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        land=new LandingPage(driver);
        hp.clicklogin();
    }
    @AfterMethod
    public void TearDown(){
        driver.close();
    }
    @Test(dataProvider = "logindata")
    public void loginddt(String user, String pwd){
        lp.loginmethod(user,pwd);
        land=new LandingPage(driver);

    }
    @DataProvider(name="logindata")
    String [][] getdata(){
        String path="";
    }


}
