package com.seleniumToolkit.selenium.pageObject;

import com.seleniumToolkit.selenium.pageObject.template.AbstractSeleniumToolkitPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//PO generated by SeleniumToolkit-Extension
public class ChromeExtension extends AbstractSeleniumToolkitPageObject{

    public final String URL = "/chromeextension/";

    //Field declarations
    @FindBy(xpath="//*[@id='fusion-tab-descriptionvideo']")
    public WebElement tabDescriptionVideo;

    @FindBy(xpath="//*[@id='fusion-tab-tutorialvideo']")
    public WebElement tabTutorialvideo;

    @FindBy(xpath="//a[.//*[contains(text(),'GET STARTED')]]")
    public WebElement getStartedButton;


    //HelperMethods
    public void clickTabDescriptionVideo(){
        click( tabDescriptionVideo);
    }

    public void clickTabTutorialvideo(){
        click( tabTutorialvideo);
    }

    public GetStarted clickGetStartedButton(){
        click( getStartedButton);
        return new GetStarted();
    }



}