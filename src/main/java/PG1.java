
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

/*Напишите тест, который открывает страницу https://www.ukr.net/ и используя локаторы
By id находит логин и пароль поля и вводит туда любой текст*/

public class PG1 {
    @Test
    public void checkUkrNet(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");

        Boolean element = driver.findElement(By.id("search-input")).isDisplayed();
        System.out.println(element);

    }
    @Test
    public void checkRozetka(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");

        List<WebElement> menuItem = driver.findElements(By.className("menu-categories__item"));
        System.out.println(menuItem.size());

    }

    @Test
    public void checkRozetka2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/");

        List<WebElement> frame = driver.findElements(By.tagName("img"));
        System.out.println(frame.size());

    }

    @Test
    public void checkUkrNet2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");

        WebElement element = driver.findElement(By.name("q"));
        Thread.sleep(3000);
        element.sendKeys("hello");
        System.out.println(element);
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void checkGoogle(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");

        WebElement element = driver.findElement(By.linkText("русский"));
        element.click();
        System.out.println(element);

    }
    @Test
    public void checkGoogle2(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");

        WebElement element = driver.findElement(By.cssSelector("#food span.dairy.aged"));
        System.out.println(element);

    }

    @Test
    public void checkRozetka3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ukr.net/");

        WebElement element = driver.findElement(By.cssSelector("#"));
        System.out.println(element);

    }

    @Test
    public void checkGoogle3(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        WebElement dynamicElement = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("logo-default")));
        System.out.println(dynamicElement);

    }



    @Test
    public void checkProzorro1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.prozorro.gov.ua/tender/search");

        WebElement dynamicElement = driver.findElement(By.id("query"));
        dynamicElement.sendKeys("123");

        WebElement dynamicElement2 = driver.findElement(By.id("search_button"));
        dynamicElement2.submit();

        System.out.println(dynamicElement);
        System.out.println(dynamicElement2);

        WebElement dynamicElement3 = (new WebDriverWait(driver, 4))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#query")));
        System.out.println(dynamicElement3);

    }

//Напишите тест, который проверяет, что на сайте https://dou.ua/ меню
//зарплаты становится красным при наведении мишкой на него
    @Test
    public void checkDOU() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dou.ua/");

        WebElement salary = driver.findElement(By.xpath("//a[text()='Зарплаты']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(salary).build().perform();

        String t = salary.getCssValue("color");
        System.out.println(t);
        Assert.assertEquals(t,"rgba(255, 0, 0, 1)");
        //System.out.println(builder);

    }

    @Test
    public void checkGMail() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

       WebElement email = driver.findElement(By.id("identifierId"));
       email.sendKeys("kutyaev.stass@gmail.com");
       WebElement next = driver.findElement(By.xpath("//span[text()='Далі']"));
        Actions builder = new Actions(driver);
        builder.click(next).build().perform();
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("overlord44445");
        WebElement next2 = driver.findElement(By.xpath("//span[text()='Далі']"));
        builder.click(next2).build().perform();
        Thread.sleep(3000);

        WebElement writeEmail = driver.findElement(By.xpath("//div[text()='Написать']"));
        builder.click(writeEmail).build().perform();
        Thread.sleep(2000);

        WebElement WriteTo = driver.findElement(By.id(":r2"));
        WriteTo.sendKeys("kutyaev.stass@gmail.com");

        WebElement Topic = driver.findElement(By.id(":qk"));
        Topic.sendKeys("Test email");

        WebElement Text = driver.findElement(By.id(":rp"));
        Text.sendKeys("Hello! This is a test email.");
        Thread.sleep(4000);

        WebElement Send = driver.findElement(By.id(":qa"));
        builder.click(Send).build().perform();


        WebElement Inbox = (new WebDriverWait(driver,10))
        .until(ExpectedConditions.presenceOfElementLocated(By.id("TN bzz aHS-bnt")));
        builder.click(Inbox).build().perform();
        
    }

}
