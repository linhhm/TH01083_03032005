import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium {
    EdgeDriver edgeDriver;
    @BeforeEach
    public void setup(){
        WebDriverManager.edgedriver().setup();
        edgeDriver = new EdgeDriver();
    }
    @Test
    public void testThemGioHang(){
        edgeDriver.get("https://www.savor.vn/#banh-83");
        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(10));
        WebElement vitri = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Hà Nội')]")));
        vitri.click();
        WebElement themvaogip = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/main[@role='main']/div/div//*[name()='svg']")));
        themvaogip.click();
    }
    @Test
    public void testDatHoaToc(){
        edgeDriver.get("https://www.savor.vn/#banh-83");
        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(10));
        WebElement vitri = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Hà Nội')]")));
        vitri.click();
//        WebElement themvaogip = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/main[@role='main']/div/div//*[name()='svg']")));
//        themvaogip.click();
        WebElement vaoGip = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/main[@role='main']/div[@data-section='Collection Base']/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")));
        vaoGip.click();
        WebElement hoTen = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=':r1n0:-form-item']")));
        vaoGip.sendKeys("Mai Linh");
        WebElement sdt = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=':r1n1:-form-item']")));
        sdt.sendKeys("12345678891");
        WebElement giong = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=':rns:-form-item']")));
        giong.click();
        WebElement taiCH = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=':rnv:-form-item']")));
        taiCH.click();
        WebElement nhanHang = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='circle' and contains(@cx,'12')]")));
        nhanHang.click();
        WebElement dat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        dat.click();
    }
}
