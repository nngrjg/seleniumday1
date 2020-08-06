package HomeExercise_Day4;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenshotWithMethod {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }

    public void draganddrop() {
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]")),
                driver.findElement(By.xpath("//ol[@class=\"field13 ui-droppable ui-sortable\" and @id=\"amt7\"]"))).perform();
        action.dragAndDrop(driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]")),
                driver.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\" and @id=\"bank\"]"))).perform();

        if (driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]")).getText().equalsIgnoreCase
                (driver.findElement(By.xpath("//ol[@class=\"field13 ui-droppable ui-sortable\" and @id=\"amt7\"]")).getText()))

        {
            if (driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]")).getText().equalsIgnoreCase
                    (driver.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\" and @id=\"bank\"]")).getText()))

            {
                System.out.println("Amount and Option matched with the value entered");
            }
        }
    }
    public void screenshot(String filepath, String filename){
        String filepathwithname = filepath+filename+".png";
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(filepathwithname);
        try {
            FileUtils.copyFile(source,destination);
        } catch (IOException e) {
            System.out.println("Error in taking screenshot in: "+filename);
        }

    }

    public static void main(String[] args) {
        ScreenshotWithMethod DAD = new ScreenshotWithMethod();
        DAD.browserstart("http://demo.guru99.com/test/drag_drop.html");
        DAD.screenshot("E:\\Study material\\Selenium\\Exercises\\screenshot\\","Before dragdrop");
        DAD.draganddrop();
        DAD.screenshot("E:\\Study material\\Selenium\\Exercises\\screenshot\\","After dragdrop");
    }
}
