package pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class alertPage {

    private static Logger LOG=Logger.getLogger(String.valueOf(demoQaPage.class));
    private WebDriver driver;

    public alertPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.ID, using = "alertexamples")
    private WebElement alertBox;

    @FindBy(how = How.ID, using = "confirmexample")
    private WebElement confirmExample;

    @FindBy(how = How.ID, using = "promptexample")
    private WebElement promptExample;

    @FindBy(how = How.ID, using = "promptreturn")
    private WebElement promptChangedText;


    public void ManageAlert(String name) throws InterruptedException {
            System.out.println(name);
            alertBox.click();
            Alert alert=driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Thread.sleep(3000);
            confirmExample.click();
            System.out.println(alert.getText());
            alert.dismiss();
             Thread.sleep(3000);
            promptExample.click();
            System.out.println(alert.getText());
            alert.sendKeys("Changing text in alert");
            System.out.println(alert.getText());
            alert.accept();
            Thread.sleep(3000);
            promptChangedText.getText();
        }

    }

