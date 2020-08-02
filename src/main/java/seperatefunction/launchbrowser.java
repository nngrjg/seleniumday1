package seperatefunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class launchbrowser {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }

    public static void main(String[] args) {
        launchbrowser launchbrowserobj = new launchbrowser();
        launchbrowserobj.browserstart("http://www.seleniumframework.com/Practiceform/");
    }
}

