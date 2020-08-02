package HomeExercise_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkbox {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void selectcheckbox(){
        List<WebElement> checkboxall = driver.findElements(By.xpath("//input[@class=\"cb1-element\"]"));
        for (WebElement checkthebox: checkboxall)
        {
            checkthebox.click();
        }
        Boolean Wait = new WebDriverWait(driver,30).until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//input[@value=\"Uncheck All\"]"),"Check All"));
        System.out.println("The output after checking all checkbox:"+driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).getAttribute("value"));
        driver.findElement(By.xpath("(//input[@class=\"cb1-element\"])[1]")).click();
        Boolean Wait1 = new WebDriverWait(driver,30).until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//input[@value=\"Uncheck All\"]"),"Uncheck All"));
        System.out.println("The output after unchecking anyone checkbox:"+driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).getAttribute("value"));
    }
    public static void main(String[] args) {
        Checkbox Checkboxobj = new Checkbox();
        Checkboxobj.browserstart("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        Checkboxobj.selectcheckbox();
    }
}
