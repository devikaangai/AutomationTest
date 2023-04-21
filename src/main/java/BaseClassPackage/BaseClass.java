package BaseClassPackage;

import UtilityPackage.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public BaseClass(){
        try {
            prop= new Properties();
            FileInputStream fis= new FileInputStream("C:\\Users\\devik\\IdeaProjects\\AutomationFramework\\src\\main\\java\\ConfigPackage\\config.properties");
            prop.load(fis);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        }

        public void Initialization(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
            driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(Utils.IMPLICIT_WAIT,TimeUnit.SECONDS);
        }
    }

