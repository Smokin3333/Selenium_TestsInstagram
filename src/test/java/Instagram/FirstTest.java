package Instagram;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest {
    @Test
    public void firstTest () {
        System.setProperty("webdriver.chrome.driver", "/C:/Users/danil/Documents/DriversFromSelenium/ChromeDriver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/?hl=ru");
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Зарегистрироваться")));

        WebElement element = driver.findElement(By.xpath(".//*[text()='Зарегистрироваться']"));
        element.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Моб. телефон или эл. адрес']")));

        driver.findElement(By.xpath(".//input[@name='emailOrPhone']")).sendKeys("89826325319");
        driver.findElement(By.xpath(".//input[@name='fullName']")).sendKeys("Eduardiosra Mancustors");
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys("eduardiosmancusto2511");
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("Eduard1870Oltt");
        driver.findElement(By.xpath(".//*[text()='Регистрация']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@name='confirmationCode']")));
        driver.findElement(By.xpath(".//input[@name='confirmationCode']")).sendKeys("111111");
        driver.findElement(By.xpath(".//*[text()='Подтвердить']")).click();
    }
}