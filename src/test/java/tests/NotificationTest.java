package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class NotificationTest extends BaseTest{

    @Test
    public void notificationTest() {

        driver.get(WebUrls.NOTIFICATION_MESSAGE_URL);
        driver.findElement(By.linkText("Click here")).click();
        String message = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        System.out.println(message);
        Assert.assertEquals(message, "\n" +
                "            Action successful\n" +
                "            ", "Successful message not appeared");

    }

}
