package HomeExercise_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Homework1_DragAndDrop {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
            ;
        {
            if (driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]")).getText().equalsIgnoreCase
                    (driver.findElement(By.xpath("//ol[@class=\"field14 ui-droppable ui-sortable\" and @id=\"bank\"]")).getText()))
                ;
            {
                System.out.println("Amount and Option matched with the value entered");

            }
        }
    }

    public static void main(String[] args) {
        Homework1_DragAndDrop DAD = new Homework1_DragAndDrop();
        DAD.browserstart("http://demo.guru99.com/test/drag_drop.html");
        DAD.draganddrop();
    }
}
