package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUpload() {

        driver.get(WebUrls.UPLOAD_URL);
        driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\X\\IdeaProjects\\HerokuApp\\src\\test\\resources\\mult.jpg");
        driver.findElement(By.cssSelector("#file-submit")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("#uploaded-files")).getText(), "mult.jpg", "Image name not equal");
    }
}
