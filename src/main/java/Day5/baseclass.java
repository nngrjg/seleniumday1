package Day5;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class baseclass {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }

    public void screenshot(String filepath, String filename) {
        String projectpath ="C:\\Users\\ASUS\\IdeaProjects\\seleniumday1\\src\\main";
        String filepathwithname = projectpath+filepath+filename+".png";
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(filepathwithname);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            System.out.println("Error in taking screenshot in: " + filename);
        }
    }

    public void endprogram(){
        driver.close();
        driver.quit();
    }

   }

