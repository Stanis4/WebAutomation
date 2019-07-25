import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.Assert;


public class Apple {

    @Test
    public void checkLogo() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.apple.com/");

        Boolean logo = driver.findElement(By.id("ac-gn-firstfocus")).isDisplayed();
        Assert.assertTrue(logo);

        driver.quit();

    }

    @Test
    public void checkTitle () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.apple.com/");

        Boolean disc = driver.findElement(By.xpath("//a[text()='Discover']")).isDisplayed();
        Assert.assertTrue(disc);

        WebElement discover = driver.findElement(By.xpath("//a[text()='Discover']"));
        discover.click();

        WebElement title = (new WebDriverWait(driver, 2))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
        driver.quit();
    }
}



