import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema1 {
    public String baseUrl= "http://www.google.com/";
    public WebDriver driver = new ChromeDriver();

    @Test
    public void image() {
        driver.get(baseUrl);
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();
        WebElement element = driver.findElement(By.name("q"));
        driver.manage().window().maximize();
        element.sendKeys("Cluj Napoca");
        element.submit();
        WebElement im = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[3]/a"));
        im.click();
        driver.quit();
    }

    }
