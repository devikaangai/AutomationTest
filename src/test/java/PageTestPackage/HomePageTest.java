package PageTestPackage;

import BaseClassPackage.BaseClass;
import PagePackage.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage hp;
    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        Initialization();
        hp=new HomePage(driver);

        }
        @AfterMethod
    public void teardown(){
        driver.close();

    }
    @Test
    public void TestLogo(){
        boolean logo= hp.checkwbllogo();
        Assert.assertTrue(logo);
    }
    @Test
    public void TestFreeStudent(){
        boolean student=hp.checkfreestudent();
        Assert.assertTrue(student);
    }
    @Test
    public void clickLogin(){
        hp.clicklogin();

    }
}
