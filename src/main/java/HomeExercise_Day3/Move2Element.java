package HomeExercise_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Move2Element {

    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(url);
    }
    public void dynamicdad(){
        Actions action = new Actions(driver);
        String Expectedtittle="Drag and Drop";
        action.moveToElement(driver.findElement(By.partialLinkText("Interaction"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//a[text()=\"Drag and Drop \"]"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//a[text()=\"Dynamic \"]"))).click().perform();
        if (Expectedtittle.equalsIgnoreCase(driver.getTitle())) {
            System.out.println("Navigated successfully to:" + driver.getTitle());
        }
    }
    public static void main(String[] args) {
        Move2Element explicitwaitobj = new Move2Element();
        explicitwaitobj.browserstart("http://demo.automationtesting.in/Register.html");
        explicitwaitobj.dynamicdad();

    }

}
