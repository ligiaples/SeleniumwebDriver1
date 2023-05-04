import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema3 {
    public String baseUrl= "http://www.google.com/";
    public WebDriver driver = new ChromeDriver();

    @Test
    public void stergecautare() {
        driver.get(baseUrl);
        WebElement cookies = driver.findElement(By.id("L2AGLb"));
        cookies.click();
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Masina");
        element.submit();
        WebElement x= driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[3]/div[1]/div"));
        x.click();
        driver.quit();
    }
}
