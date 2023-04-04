import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
//import static org.testng.Assert.*;

public class SauceDemoTest {
    public WebDriver driver;

    @Test
    public void pageLoads(){
    driver.get("https://www.saucedemo.com/");
    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.id("item_0_title_link")).click();
    driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
    driver.findElement(By.id("shopping_cart_container")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.id("first-name")).sendKeys("Brigita");
    driver.findElement(By.id("last-name")).sendKeys("Salina");
    driver.findElement(By.id("postal-code")).sendKeys("44444");
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("finish")).click();
    driver.findElement(By.id("back-to-products")).click();
   // assertEquals(driver.findElement(By.className("complete-header")).getText(),"Thank you for your order!");
    }

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }
}
