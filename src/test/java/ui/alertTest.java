package ui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.alertPage;

import java.util.concurrent.TimeUnit;

public class alertTest {

    WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\POSTMAN\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alertTest() throws InterruptedException {
        driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        alertPage alert=new alertPage(driver);
        alert.ManageAlert("name");


    }

    @After
    public void endReport() {
        driver.quit();

    }
}
