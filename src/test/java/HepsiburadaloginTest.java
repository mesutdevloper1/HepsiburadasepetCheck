// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HepsiburadaloginTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void hepsiburadalogin() {
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().setSize(new Dimension(1552, 832));
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("txtUserName")).click();
        driver.findElement(By.id("txtUserName")).sendKeys("mstgltn6@gmail.com");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys("mst13520");
        driver.findElement(By.id("btnEmailSelect")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".sf-HerouselBaseTemplate-30G1p .sf-hb-image-view-Kyv7r:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".desktopOldAutosuggestTheme-input")).click();
        driver.findElement(By.cssSelector(".desktopOldAutosuggestTheme-input")).sendKeys("kulaklık");
        driver.findElement(By.cssSelector(".desktopOldAutosuggestTheme-input")).sendKeys(Keys.ENTER);
        js.executeScript("window.scrollTo(0,100)");
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#i0 .moria-ProductCard-fHiOwt")).click();
        vars.put("win9238", waitForWindow(2000));
        driver.switchTo().window(vars.get("win9238").toString());
        {
            WebElement element = driver.findElement(By.id("addToCart"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("addToCart")).click();
        js.executeScript("window.scrollTo(0,300)");
        js.executeScript("window.scrollTo(0,378.3999938964844)");
        js.executeScript("window.scrollTo(0,500)");
        {
            WebElement element = driver.findElement(By.cssSelector(".checkoutui-ProductOnBasketHeader-m4tLG > button:nth-child(2)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.cssSelector(".checkoutui-Modal-2iZXl > svg")).click();
        driver.findElement(By.linkText("Tümü (30)")).click();
        js.executeScript("window.scrollTo(0,1476)");
        driver.findElement(By.cssSelector(".merchant-list-item:nth-child(4) .add-to-basket")).click();
        driver.findElement(By.cssSelector(".checkoutui-ProductOnBasketHeader-m4tLG > button:nth-child(1)")).click();
        assertTrue(driver.findElement(By.cssSelector(".sf-Account-2tUrX")).isSelected());
        assertTrue(driver.findElement(By.cssSelector(".merchantBoxWrapper_10ife:nth-child(3) .merchantName_36DkG a")).isSelected());
        js.executeScript("window.scrollTo(0,809.5999755859375)");
        js.executeScript("window.scrollTo(0,817.5999755859375)");
        js.executeScript("window.scrollTo(0,800)");
        assertTrue(driver.findElement(By.cssSelector("#\\39 f60cd91-49db-4b5f-9d62-01d240ac76ad .product_name_3Lh3t > a")).isSelected());
    }
}
