package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class SortableDataTablesTest extends BaseTest{


    @Test
    public void LastNameAndNameTest() {
        driver.get(WebUrls.SORTABLE_DATA_TABLES_URL);
        String lastName = driver.findElement(By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td)[1]")).getText();
        String name = driver.findElement(By.xpath("(//table[@id='table1']//td[text()='fbach@yahoo.com']/preceding-sibling::td)[2]")).getText();
        Assert.assertEquals(lastName, "Bach", "Last name not equal");
        Assert.assertEquals(name, "Frank", "Name not equal");
    }

    @Test
    public void DueAndWebSiteTest() {

        driver.get(WebUrls.SORTABLE_DATA_TABLES_URL);
        String dues = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[@class='dues']")).getText();
        String webSite = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']/following-sibling::td[@class='web-site']")).getText();
        Assert.assertEquals(dues, "$51.00", "Dues not equal");
        Assert.assertEquals(webSite, "http://www.frank.com", "Web site not equal");
    }
}
