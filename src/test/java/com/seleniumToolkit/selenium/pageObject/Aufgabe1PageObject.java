package com.seleniumToolkit.selenium.pageObject;


import com.seleniumToolkit.selenium.framework.driver.WebDriverManager;
import com.seleniumToolkit.selenium.pageObject.template.AbstractPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Aufgabe1PageObject extends AbstractPageObject {

    public final String URL = "https://selenium-consulting.ch/event/MaibornWolff/Dragonia/Aufgabe%20Allgemein%201.php";

    @FindBy(id = "zahl1")
    public WebElement firstNumber;

    @FindBy(id = "zahl2")
    public WebElement secondNumber;

    @FindBy(name = "summe")
    public WebElement totalInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(id = "result")
    public WebElement resultDiv;

    @FindBy(className = "inBlock")
    public WebElement taskDiv;

    public Aufgabe1PageObject loadPage(){
        WebDriverManager.getWebdriver().get(this.URL);
        return this;
    }

    public String getValueOfTotalInput(){
        return getValueOfInput(this.totalInput);
    }

    public Aufgabe1PageObject enterTotalInput(CharSequence input){
        enter(this.totalInput, input);
        return this;
    }

    public Integer getFirstNumber(){
        return Integer.parseInt(getText(this.firstNumber));
    }

    public Integer getSecondNumber(){
        return Integer.parseInt(getText(this.secondNumber));
    }

    public Aufgabe1PageObject clickSubmitButton(){
        click(this.submitButton);
        return this;
    }

    public boolean isSubmitButtonEnabled(){
        return this.submitButton.isEnabled();
    }

    public String getTextOfResultDiv(){
        return getText(this.resultDiv);
    }



}