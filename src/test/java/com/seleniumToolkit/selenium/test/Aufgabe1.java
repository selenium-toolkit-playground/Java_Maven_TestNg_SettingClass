package com.seleniumToolkit.selenium.test;

import com.seleniumToolkit.selenium.framework.assertBase.ReportAssert;
import com.seleniumToolkit.selenium.framework.screenshot.core.Capture;
import com.seleniumToolkit.selenium.framework.screenshot.core.ScreenShootMaker;
import com.seleniumToolkit.selenium.pageObject.Aufgabe1PageObject;
import com.seleniumToolkit.selenium.framework.tag.SeleniumTest;

import io.qameta.allure.Feature;
import com.seleniumToolkit.selenium.framework.driver.WebDriverManager;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Aufgabe1 {

    @Test(groups = {"allTests"}, testName = "Aufgabe1-Test")
    @SeleniumTest()
    @Feature("Aufgaben-Tests")
    public void solveTask(){
        WebDriverManager.getWebdriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Aufgabe1PageObject aufgabe1PageObject = new Aufgabe1PageObject();
        aufgabe1PageObject.loadPage();
        Integer number1 = aufgabe1PageObject.getFirstNumber();
        Integer number2 = aufgabe1PageObject.getSecondNumber();
        aufgabe1PageObject.enterTotalInput(String.valueOf(number1+number2));
        aufgabe1PageObject.clickSubmitButton();
        ReportAssert.assertEquals(aufgabe1PageObject.getTextOfResultDiv(), "Correct", "The answer of the addition should be correct.");
    }


    @Test(groups = {"allTests"}, testName = "Aufgabe1-Test-Screenshot")
    @SeleniumTest()
    @Feature("Aufgaben-Tests")
    public void screenshot(){
        String screenshotTarget = "target/screenshots/Aufgabe1-Vergleich/";
        solveTask();
        Aufgabe1PageObject aufgabe1PageObject = new Aufgabe1PageObject();
        ScreenShootMaker.element.shoot(aufgabe1PageObject.taskDiv).withName("TaskDiv").save(screenshotTarget);
        ScreenShootMaker.page.shoot(Capture.FULL_SCROLL).withName("View").save(screenshotTarget);
    }


    @Test(groups = {"allTests"}, testName = "Aufgabe1-Test-Screenshot-Vergleich")
    @SeleniumTest()
    @Feature("Aufgaben-Tests")
    public void screenshotVergleich(){
        String screenshotTarget = "target/screenshots/Aufgabe1-Vergleich/";
        solveTask();
        Aufgabe1PageObject aufgabe1PageObject = new Aufgabe1PageObject();
        ReportAssert.assertTrue(
                ScreenShootMaker.page.shoot(Capture.FULL_SCROLL).withName("View Vergleich")
                .equalsWithDiff("screenshots/reference/Aufgabe1-Vergleich.png", screenshotTarget.concat("Diff"), 0L)
        , "Der Screenshot sollte mit der Referenz übereinstimmen");
    }



}
