package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class TyposTest extends BaseTest {

    @Test
    public void typoTest() {

        driver.get(WebUrls.TYPOS_URL);
        Assert.assertEquals(driver.findElement(By.xpath("//p[contains(.,'Sometimes')]")).getText(), "Sometimes you'll see a typo, other times you won't.", "Typo detected");

    }
}
