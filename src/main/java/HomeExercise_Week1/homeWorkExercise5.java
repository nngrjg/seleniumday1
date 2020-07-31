package HomeExercise_Week1;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class homeWorkExercise5 {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }

    public void singlewindow(String elementtoclick){
        String currentwindowid = driver.getWindowHandle();
        driver.findElement(By.xpath(elementtoclick)).click();
        Set<String> windowids = driver.getWindowHandles();

        for (String allwindowsid:windowids){
            if (!currentwindowid.equals(allwindowsid)){
                driver.switchTo().window(allwindowsid);
                System.out.println("Window Title:"+driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(currentwindowid);
    }
    public void multiwindows(String elementtoclick){
        String currentwindowid = driver.getWindowHandle();
        driver.findElement(By.xpath(elementtoclick)).click();
        Set<String> windowids = driver.getWindowHandles();

        for (String allwindowsid:windowids){
            driver.switchTo().window(allwindowsid);
            System.out.println("Window Title:"+driver.getTitle());
            String pagetitle=driver.getTitle();
            if (pagetitle.equalsIgnoreCase("Selenium Easy - Home | Facebook")){
                driver.findElement(By.xpath("//input[@id=\"email\"][@class=\"inputtext login_form_input_box\"]")).sendKeys("Nagraj");
                System.out.println("Name has been entered in facebook window");
                }
            driver.close();
        }
        }

    public static void main(String[] args) {
        homeWorkExercise5 hwe5 = new homeWorkExercise5();
        hwe5.browserstart("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
        hwe5.singlewindow("//a[@title=\"Follow @seleniumeasy on Twitter\"]");
        hwe5.multiwindows("//a[text()=\"Follow All\"]");


    }
}
