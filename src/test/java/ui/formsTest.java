package ui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.formaPage;

import java.util.concurrent.TimeUnit;

public class formsTest {

    WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\POSTMAN\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void forms() {
        driver.navigate().to("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        formaPage forms=new formaPage(driver);
        forms.fillFormsPage("user1","password@123","Comments ABC","C:\\Users\\user\\Desktop\\POSTMAN\\selenium_coding.txt");
    }


    @After
    public void endReport() {
        driver.quit();

    }




}
