package com.seleniumToolkit.selenium.test;

import com.seleniumToolkit.selenium.framework.assertBase.ReportAssert;
import com.seleniumToolkit.selenium.pageObject.Home;
import com.seleniumToolkit.selenium.pageObject.template.AbstractSeleniumToolkitPageObject;
import com.seleniumToolkit.selenium.framework.tag.SeleniumTest;

import io.qameta.allure.Feature;
import com.seleniumToolkit.selenium.framework.driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class InitialTest {

    @Test(groups = {"allTests", "initTests"}, testName = "InitTest-Name")
    @SeleniumTest()
    @Feature("InitialTest other depends on this")
    public void websiteIsUpAndRunning(){
        WebDriverManager.getWebdriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Home home = AbstractSeleniumToolkitPageObject.loadSeleniumToolkitPage();
        ReportAssert.assertEquals(home.getTextOfTitle(), "How Easy To Run Selenium Tests?");

    }

}
