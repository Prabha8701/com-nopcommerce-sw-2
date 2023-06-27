package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RegisterTest extends BaseTest {
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @After
    public void closeDown() {
        closeBrowser();
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        // Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text() ='Register']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Select gender radio button
        driver.findElement(By.xpath("//input[@type ='radio' and @value ='M']")).click();

        //Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prime");

        // enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");

        // enter date of birth

        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("2");

        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("November");

        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1970");

        //enter email id
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Prime124@gmail.com");

        //enter password and confirm password
        driver.findElement(By.xpath("//input[@data-val-regex-pattern='^.{6,}$']")).sendKeys("Prime123");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Prime123");

        //click on register button
        driver.findElement(By.xpath("//button[text()='Register']")).click();

        //Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals(expectedText,actualText);


    }
}
