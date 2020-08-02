package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class day2windowhandle {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void handle(){

        String currentwindowid = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[text()=\"New Browser Window\"]")).click();
        Set<String> windowids = driver.getWindowHandles();

        for (String windowsid:windowids){
            if (!currentwindowid.equals(windowsid)){
                driver.switchTo().window(windowsid);
                driver.close();
            }
        }
    }

    public static void main(String[] args) {
        day2windowhandle handelobj = new day2windowhandle();
        handelobj.browserstart("http://www.seleniumframework.com/Practiceform/");
        handelobj.handle();
    }
}
