package com.seleniumToolkit.selenium.setting;

import com.seleniumToolkit.selenium.framework.dataLoader.settings.*;
import com.seleniumToolkit.selenium.framework.grid.Vendor;
import com.seleniumToolkit.selenium.framework.listeners.webdriver.SpeedMode;
import org.apache.logging.log4j.Level;
import org.openqa.selenium.Capabilities;

import java.util.Arrays;
import java.util.List;

public class ToolkitSettings implements ToolkitSettingInterface {

    @Override
    public ExecutiveEnvironment getExecutiveEnvironment() {
        return ExecutiveEnvironment.LOCAL;
    }

    @Override
    public String getRemoteGridUrl() {
        return "";
    }

    @Override
    public Vendor getGridVendor() {
        return Vendor.DUMMY_VENDOR;
    }

    @Override
    public int getAllowedParallelThreads() {
        return 1;
    }

    @Override
    public String getWebDriverInternetExplorerDriverLocation() {
        return "";
    }

    @Override
    public String getWebDriverFirefoxDriverLocation() {
        return "";
    }

    @Override
    public String getWebDriverChromeDriverLocation() {
        return "";
    }

    @Override
    public List<Browser> getBrowsers() {
        return Arrays.asList(
                new Browser("chrome")
        );
    }

    @Override
    public List<MobileDevice> getMobileDevices() {
        return null;
    }

    @Override
    public String getWebDriverInterceptor() {
        return "com.seleniumToolkit.selenium.setting.CustomWebDriverInterceptor";
    }

    @Override
    public String getLicense() {
        return "";
    }

    @Override
    public Level getLoggerLevel() {
        return Level.INFO;
    }

    @Override
    public boolean getNetworkTrafficCapturing() {
        return false;
    }

    @Override
    public boolean getCaptureModeNoDiff() {
        return false;
    }

    @Override
    public boolean getNeoloadEnabled() {
        return true;
    }
}
