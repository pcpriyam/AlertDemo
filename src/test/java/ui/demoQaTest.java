package ui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.demoQaPage;

import java.util.concurrent.TimeUnit;


public class demoQaTest {


    WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\POSTMAN\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void DEmoQA () throws InterruptedException {

        driver.navigate().to("https://testsheepnz.github.io/BasicCalculator.html");
        demoQaPage demo=new demoQaPage(driver);

        demo.Calculate("Prototype",100,140,"Add");

    }
    @After
    public void endReport() {
        driver.quit();

    }


}
