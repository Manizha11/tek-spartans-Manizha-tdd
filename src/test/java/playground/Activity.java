package playground;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity {
    /*
    Write a test that navigate to Facebook.com
    and print Title
     */
    private WebDriver driver;

    @BeforeMethod
    public void FaceBookTest() {
        driver = new EdgeDriver();
        driver.get("https://facebook.com");
    }

    @Test
    public void testFaceBookTitle() {
        String applicationTitle = driver.getTitle();
        Assert.assertEquals(applicationTitle,"Facebook - log in or sign up");

    }

    @AfterMethod
    public void cleanUpTest() {
        driver.quit();
    }

}



