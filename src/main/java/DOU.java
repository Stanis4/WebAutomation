/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

public class DOU {

    @Test
     public void checkSalary() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.dou.ua/");

        WebElement salary = driver.findElement(By.xpath("//a[text()='Зарплаты']"));
        salary.click();

        //check city

        WebElement city = driver.findElement(By.name("city"));
        city.click();

        Select s1 = new Select(driver.findElement(By.name("city")));
        s1.selectByVisibleText("Харьков");

        //check title

        WebElement title = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("title")));
        title.click();

        Select s2 = new Select(driver.findElement(By.name("title")));
        s2.selectByVisibleText("QA engineer");

        //check speciality

        WebElement spec = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.visibilityOfElementLocated(By.name("spec")));
        title.click();

        Select s3 = new Select(driver.findElement(By.name("spec")));
        s3.selectByVisibleText("Automation QA");

        //check the correspondence
        Boolean min = driver.findElement(By.xpath("//span[text()='1300']")).isDisplayed();
        Assert.assertTrue(min);

        Boolean mid = driver.findElement(By.xpath("//span[text()='1680']")).isDisplayed();
        Assert.assertTrue(mid);

        Boolean max = driver.findElement(By.xpath("//span[text()='1995']")).isDisplayed();
        Assert.assertTrue(max);

    }
}




//click dropdown // s.selectByVisibleText("text") // import org.openqa.seleniumsupport.ui.Select;

*/
