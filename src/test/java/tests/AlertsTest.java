package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class AlertsTest extends BaseTest{
    @Test
    public void jsAlertClickTest() {

        driver.get(WebUrls.ALERT_URL);
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You successfully clicked an alert", "Alert not accepted");
    }
    @Test
    public void jsConfirmClickTest() {

        driver.get(WebUrls.ALERT_URL);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();

        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You clicked: Cancel", "Alert not dismiss");
    }

    @Test
    public void jsPromptClickTest() {

        driver.get(WebUrls.ALERT_URL);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        String message = "prompt text test";
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();


        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: " + message, "Text not equals");
    }
}
