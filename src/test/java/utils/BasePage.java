package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    private static WebDriver driver;
    public void openBrowser(String browser){
        switch (browser.toLowerCase()){
            case "chrome": driver = new ChromeDriver();
            break;
            case "firefox": driver = new FirefoxDriver();
            break;
            case "edge": driver=new EdgeDriver();
            break;
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

}
