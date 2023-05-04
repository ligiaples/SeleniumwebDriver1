import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TemaLam1 {
        private WebDriver driver;

        @BeforeClass
        public void setup() {
            System.setProperty("web-driver.chrome.driver", "C:\\Users\\Ligia\\Desktop\\selenium\\chromedriver.exe\\");
            driver = new ChromeDriver();
        }
         /*@Test
         public  void twoinputfield(){
          driver.get("https://www.lambdatest.com/selenium-playground/simple-form-demo");
         WebElement fielda= driver.findElement(By.id("sum1"));
            fielda.sendKeys("3");
         WebElement fieldb= driver.findElement(By.id("sum2"));
         fieldb.sendKeys("-1");
         WebElement total= driver.findElement(By.id("user-message"));

             Assert.assertEquals(true, total.isDisplayed());
             driver.quit();
            }*/
           /* @Test
    public void checkbox(){
            driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
            WebElement ch= driver.findElement(By.id("isAgeSelected"));
            ch.click();
            }*/
           /* @Test
    public void multipleCheckBox(){
                driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
                WebElement b1= driver.findElement(By.id("ex1-check1"));
                b1.click();
                WebElement b4 = driver.findElement(By.id("ex1-check3"));
                b4.click();
            }*/
          /* @Test
    public void Radio(){
                driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
                WebElement s1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[3]/div/div/div[2]/div[1]/div[2]/label[2]/input"));
                s1.click();
                WebElement gch = driver.findElement(By.id("buttoncheck"));
                Assert.assertEquals(true,s1.isSelected());
            }*/
            @Test
    public void multipleR(){
                driver.get("https://www.lambdatest.com/selenium-playground/radiobutton-demo");
                WebElement gen= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/div[1]/label[2]/input"));
                gen.click();
                WebElement v= driver.findElement(By.name("ageGroup"));
                v.click();
                WebElement getv= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section[3]/div/div/div[2]/div[2]/div[2]/div/div[1]/button"));
                getv.click();
                Assert.assertEquals(true,gen.isSelected());
            }
}

