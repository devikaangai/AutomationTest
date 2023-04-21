package PageTestPackage;

import BaseClassPackage.BaseClass;
import PagePackage.HomePage;
import PagePackage.LandingPage;
import PagePackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {
    HomePage hp;
    LoginPage lp;
    LandingPage land;
    public LandingPageTest(){
        super();
    }
    @BeforeMethod
    public void setup(){
        Initialization();
        hp=new HomePage(driver);
        lp=new LoginPage(driver);
        land=new LandingPage(driver);
        hp.clicklogin();
        lp.loginmethod(prop.getProperty("username"), prop.getProperty("password") );
        land=lp.clickSubmit();
    }
    @AfterMethod
    public void Teardown(){
        driver.close();
    }
    @Test
    public void TestWBL(){
        boolean wb = land.checkwbl();
        Assert.assertTrue(wb);
    }
    @Test
    public void TestMailID(){
        boolean mail= land.checkmailid();
        Assert.assertTrue(mail);
    }

}