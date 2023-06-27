package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @After
    public void closeDown() {
         closeBrowser();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        // click on the ‘Login’ link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        // Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']")).getText();
        // verify the text
        Assert.assertEquals("Not directed to Login page", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Prime123@gmail.com");

        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Prime123");

        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        String expectedText = "Log out";
        String actualText = driver.findElement(By.xpath("//a[@class='ico-logout']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyTheErrorMessage() {
        //click on the ‘Login’ link
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //Enter invalid username
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Prime@gmail.com");

        //Enter invalid password
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Prime12");

        //Click on Login button
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();

        // Verify the error message ‘Login was unsuccessful.Please correct the errors and try again. No customer account found’
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualText = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

}
