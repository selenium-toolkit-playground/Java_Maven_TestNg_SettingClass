package com.seleniumToolkit.selenium.setting;

import com.seleniumToolkit.selenium.framework.dataLoader.settings.*;
import com.seleniumToolkit.selenium.framework.grid.Vendor;
import com.seleniumToolkit.selenium.framework.grid.vendorOption.sauceLabs.SauceLabsOptions;
import com.seleniumToolkit.selenium.framework.listeners.webdriver.SpeedMode;
import com.seleniumToolkit.selenium.framework.modul.reporting.jiraXrayReporter.JiraReporterConfig;
import com.seleniumToolkit.selenium.framework.modul.reporting.slack.SlackReporterConfig;
import org.apache.logging.log4j.Level;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolkitSettings implements ToolkitSettingInterface {

    /**
     * Description: If the switch is on grid, the tests will run on the defined grid.
     *              If the switch is on local, the tests will run local on your machine.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public ExecutiveEnvironment getExecutiveEnvironment() {
        return ExecutiveEnvironment.LOCAL;
        //return ExecutiveEnvironment.GRID;
    }

    /**
     * Description: Url of the Grid without the ending “/wd/hub” where the tests should be executed in grid mode.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getRemoteGridUrl() {
        return "";
    }

    /**
     * Description: Define the GridVendor if you have a SeleniumGrid of a Vendor.
     *              The Functions of this Vendor will automaticly be added to your testrun.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public Vendor getGridVendor() {
        return Vendor.DUMMY_VENDOR;
        //return Vendor.SBOX_ELEMENT34;
        //return Vendor.SAUCELABS;
    }

    /**
     * Description: You can define how many tests may run in parallel.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public int getAllowedParallelThreads() {
        return 1;
    }

    /**
     * Description: Define a logging level for System-Output and Log-Files.
     *              For Support, please set “DEBUG” to send us a detailed log.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public Level getLoggerLevel() {
        return Level.INFO;
        //return Level.DEBUG;
    }

    /**
     * Description: If switch to "true", the Selenium-Toolkit will autodownload the Driver.exe files for you.
     *              If this cause problem, please switch to false and define the Driver.exe Location with the Methods like #getWebDriverInternetExplorerDriverLocation();
     * Since Version: 1.3.25
     * Expired Version: -
     */
    @Override
    public boolean getWebdriverAutoDownloadDriverExeEnabled() {
        return false;
    }

    /**
     * Description: Define the path to the InternetExplorerDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverInternetExplorerDriverLocation() {
        return "";
    }

    /**
     * Description: Define the path to the EdgeDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverEdgeDriverLocation() {
        return "";
    }

    /**
     * Description: Define the path to the FirefoxDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverFirefoxDriverLocation() {
        return "";
    }

    /**
     * Description: Define the path to the ChromeDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverChromeDriverLocation() {
        return "";
    }

    /**
     * Description: Define the path to the OperaDriver to execute local tests on this Browser
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverOperaDriverLocation() {
        return "";
    }

    /**
     * Description: You can define browser, versions and PlatformNames.
     *              If you only define the browser, the grid will take the default version.
     *              If you define multiple Browsers, it will clone the Tests and each test will then be run automatically with each of the browsers. *PRO-Feature*"
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public List<Browser> getBrowsers(){
        return Arrays.asList(
                new Browser("chrome")
        );
    }

    /**
     * Description: You can define a download directory in which all downloads are automatically saved in the case of a local Chrome or Firefox.
     *              All necessary settings in Chrome and Firefox are set automatically.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getBrowserDownloadDirectory(){
        return "target/download/";
    }

    /**
     * Description: If this property is setted, the toolkit will use Neoload as Proxy to capture the protocol.
     *              Neoload must be running and a porject should be open.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public boolean getNeoloadEnabled() {
        return false;
    }

    /**
     * Description: Settings which will be used in {@link com.seleniumToolkit.selenium.framework.database.DatabaseScriptExecutor} to create a DB connection to execute your scripts.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public DbJdbcConfig getDbJdbxConfig(){
        return null;
        /*
        boolean hibernateShowSql = false;
        return new DbJdbcConfig(
                "jdbcDriver",
                "jdbcUrl",
                "jdbcUser",
                "jdbcPassword",
                "jtaDataSource",
                hibernateShowSql
        );
        */
    }

    /**
     * Description: Define your license-key to activate the Pro-Features.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getLicense(){
        return "";
    }

    /**
     * Description: Define the LicenseServer endpoint where the license is to be collected.
     * Since Version: 1.3.25
     * Expired Version: -
     */
    @Override
    public String getLicenseServer(){
        return null;
    }

    /**
     * Description: General Capabilities for Webdriver
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public Capabilities getGenerallCapabilities(){
        return new DesiredCapabilities();
    }

    /**
     * Description: You can set captureModeNoDiff. If this is setted, the Screenshot-Diff-Mode will not create a Diff-Screenshot, it will recapture new reverence-images.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public boolean getCaptureModeNoDiff(){
        return false;
    }

    /**
     * Description: You can set dontCloseLocalBrowser. If this is setted, local browsers will not be closed after test end.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public boolean getDontCloseLocalBrowser(){
        return false;
    }

    /**
     * Description: URL to the local Appium server on which the mobile tests are executed if the execution is set to Local.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getLoaclAppiumServerUrl(){
        return "";
    }

    /**
     * Description: You can define mobileDevice, version and platform.
     * If you define multiple MobileDevices, it will clone the Tests and each test will then be run automatically with each of the device. *PRO-Feature*"
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public List<MobileDevice> getMobileDevices(){
        return new ArrayList<>();
    }

    /**
     * Description: General Capabilities for Mobile-Webdriver
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public Capabilities getGenerallMobileCapabilities(){
        return new DesiredCapabilities();
    }

    /**
     * Description: You are able to define different speedMode to slow down your Tests for a Demo or something like this. The Toolkit will automaticly wait after highlighting your action on the screen before it will do the next action.
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public SpeedMode getSpeedMode(){
        return SpeedMode.NORMAL;
        //return SpeedMode.SLOW;
        //return SpeedMode.VERY_SLOW;
    }

    /**
     * Description: You can define a WebDriver-Interceptor which will be called befor a WebDriver will be created. Please set package and Classname as Value of this property like "com.selenium-toolkit.Interceptor". This class should implements "WebDriverInterceptor".
     * Since Version: 1.3.22
     * Expired Version: -
     */
    @Override
    public String getWebDriverInterceptor(){
        return "com.seleniumToolkit.selenium.setting.CustomWebDriverInterceptor";
    }

    /**
     * Description: Add SauceLabsOptions if your GridVendor is SauceLabs
     * Since Version: 1.3.23
     * Expired Version: -
     */
    @Override
    public SauceLabsOptions getSauceLabsOption(){
        return null;
        /*
        SauceLabsOptions sauceLabsOptions = new SauceLabsOptions();
        sauceLabsOptions.setTags("Tag");
        return sauceLabsOptions;
        */
    }

    /**
     * Description: If this property is setted, the toolkit will start a Proxy for each Browser and Capture the Network Traffic
     * Since Version: 1.3.23
     * Expired Version: -
     */
    @Override
    public boolean getNetworkTrafficCapturing(){
        return false;
    }

    /**
     * Description: You can define the JiraReporterConfig to enable the JiraReportingModule
     * Since Version: 1.3.23
     * Expired Version: -
     */
    @Override
    public String getTestProjectName(){
        return "Demo Project";
    }

    /**
     * Description: You can define the JiraReporterConfig to enable the JiraReportingModule
     * Since Version: 1.3.23
     * Expired Version: -
     */
    @Override
    public JiraReporterConfig getJiraReporterConfig(){
        return null;
        /*
        JiraReporterConfig jiraReporterConfig = new JiraReporterConfig();
        jiraReporterConfig.setEnabled(true);

        //Server Auth
        jiraReporterConfig.setJiraUserName("");
        jiraReporterConfig.setJiraUserToken("");

        //Cloud Auth
        jiraReporterConfig.setXRayCloudClientId("");
        jiraReporterConfig.setXRayCloudClientSecret("");

        jiraReporterConfig.setProjectKey("Project Key where the Toolkit should raport");
        // If no TestPlanKey is defined, the toolkit will create a new Testplan and record all Tests into the new Testplan.
        // If the TestPlanKey is defined, the toolkit will create Testexecutions in the Testplan and prove recorded Tests with the new TestRuns.
        jiraReporterConfig.setTestPlanToReport("TestPlanKey where the Toolkit should raport");
        jiraReporterConfig.setAddPackageInformationToTestName(true);
        jiraReporterConfig.setAddTestParameterInformationToTestName(true);
        return jiraReporterConfig;
        */
    }

    /**
     * Description: You can define the SlackReporterConfig to enable the JiraReportingModule
     *              On the Website is a detailed Instruction how to create the Slack connection and the Bot-User.
     * Since Version: 1.3.23
     * Expired Version: -
     */
    @Override
    public SlackReporterConfig getSlackReporterConfig(){
        return null;
        /*
        SlackReporterConfig slackReporterConfig = new SlackReporterConfig();
        slackReporterConfig.setEnabled(true);
        slackReporterConfig.setChannelName("");
        slackReporterConfig.setBotUserToken("");
        return slackReporterConfig;
        */
    }
}
