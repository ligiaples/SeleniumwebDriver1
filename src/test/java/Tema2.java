import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tema2{
        public String baseUrl= "http://www.google.com/";
        public WebDriver driver = new ChromeDriver();

        @Test
        public void primulrezultat() {
            driver.get(baseUrl);
            WebElement cookies = driver.findElement(By.id("L2AGLb"));
            cookies.click();
            WebElement element = driver.findElement(By.name("q"));
            driver.manage().window().maximize();
            element.sendKeys("Caine");
            element.submit();
            WebElement pr = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3"));
            pr.click();
            driver.quit();
        }
}
