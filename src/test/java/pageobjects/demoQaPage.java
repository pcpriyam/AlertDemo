package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.logging.Logger;

public class demoQaPage {


    private static Logger LOG=Logger.getLogger(String.valueOf(demoQaPage.class));
    private WebDriver driver;

    public demoQaPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    //Locators
    @FindBy(how = How.ID, using = "selectBuild")
    private WebElement selectBuild;

    @FindBy(how = How.ID, using = "number1Field")
    private WebElement firstNumber;

    @FindBy(how = How.ID, using = "number2Field")
    private WebElement secondNumber;

    @FindBy(how = How.ID, using = "selectOperationDropdown")
    private WebElement selectOperation;

    @FindBy(how = How.ID, using = "calculateButton")
    private WebElement calculateButton;

    @FindBy(how = How.ID, using = "numberAnswerField")
    private WebElement answerField;

    @FindBy(how = How.ID, using = "clearButton")
    private WebElement clearButton;


    public void selectBuild(String Build) {
        Select build=new Select(selectBuild);
        build.selectByVisibleText(Build);
        LOG.info("Build is selected successfully");

    }

  public void selectOperation(String Operation){
        Select operation=new Select(selectOperation);
        operation.selectByVisibleText(Operation);
        LOG.info("Operation is selected successfully");

  }

  public int operationAdd(Integer FirstNumber,Integer SecondNumber){
        int Sum=FirstNumber+SecondNumber;
        return Sum;

  }

  public int operationSubtract(Integer FirstNumber,Integer SecondNumber){
        int Sub;
            if(FirstNumber>SecondNumber) {
                Sub = FirstNumber - SecondNumber;
            }

            else {
                Sub = SecondNumber - FirstNumber;
            }
      return Sub;

  }

  public int operationMultiply(Integer FirstNumber,Integer SecondNumber){
        int Value=FirstNumber*SecondNumber;
        return Value;

  }

  public int operationDivide(Integer FirstNumber,Integer SecondNumber){
        int Value=FirstNumber/SecondNumber;
        return Value;

  }

  public String operationConcatenate(Integer FirstNumber,Integer SecondNumber){
            String Value=FirstNumber.toString()+SecondNumber.toString();
            return Value;
  }


    public void Calculate(String Build,Integer FirstNumber,Integer SecondNumber,String Operation) throws InterruptedException {
        selectBuild(Build);
        firstNumber.click();
        firstNumber.clear();
        firstNumber.sendKeys(FirstNumber.toString());
        secondNumber.click();
        secondNumber.clear();
        secondNumber.sendKeys(SecondNumber.toString());
        selectOperation(Operation);
        System.out.println(Operation);
        calculateButton.click();
        Thread.sleep(3000);

        switch (Operation) {
            case "Add":
                //String answer=answerField.getAttribute("value");
                String answer1=answerField.getText();
                //System.out.println(answer);
                //System.out.println(answer1);
                Integer output=operationAdd(FirstNumber,SecondNumber);
                System.out.println(output);
                //Assert.assertEquals(answer,output);

                break;


            case "Subtract":
                break;

            case "Multiply":
                break;

            case "Divide":
                break;

            case "Concatenate":
                break;

        }


    }

}



