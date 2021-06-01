package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.Logger;

public class formaPage {

    private static Logger LOG=Logger.getLogger(String.valueOf(demoQaPage.class));
    private WebDriver driver;

    public formaPage(WebDriver driver){
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);

    }

    @FindBy(how = How.NAME, using = "username")
    private WebElement inputUsername;

    @FindBy(how = How.NAME, using = "password")
    private WebElement inputPassword;

    @FindBy(how = How.NAME, using = "comments")
    private WebElement inputComments;

    @FindBy(how = How.NAME, using = "filename")
    private WebElement fileBrowse;

    public void selectCheckBox(){
        List<WebElement> list=driver.findElements(By.name("checkboxes[]"));

        for(int i = 1; i<list.size(); i++)
        {
            if(list.get(i).isSelected()){
                System.out.println("Checkbox "+i+" is selected ");

        }
        }
    }

    public void selectRadioButton() {
        List<WebElement> radioList = driver.findElements(By.name("radioval"));
        for (int i = 1; i < radioList.size(); i++)
        {
            if (radioList.get(i).isSelected())
            {
                System.out.println("Radiobutton " + i + " is selected ");


            }
        }
    }


    public void fillFormsPage(String UserName, String Password, String Comments, String filepath) {
        inputUsername.click();
        inputUsername.sendKeys(UserName);
        inputPassword.click();
        inputPassword.sendKeys(Password);
        inputComments.click();
        inputComments.sendKeys(Comments);
        selectCheckBox();
        selectRadioButton();
        //fileBrowse.sendKeys(filepath);

    }


}
