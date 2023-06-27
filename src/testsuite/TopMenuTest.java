package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @After
    public void closeDown() {
         closeBrowser();
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        // click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

        //Verify the text ‘Computers’
        String expectedText= "Computers";
        String actualText= driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        // click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();

        //Verify the text ‘Electronics’
        String expectedText= "Electronics";
        String actualText= driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //// click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();

        //Verify the text ‘Apparel’
        String expectedText= "Apparel";
        String actualText= driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        // click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();

        //Verify the text ‘Digital downloads’
        String expectedText= "Digital downloads";
        String actualText= driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        // click on the ‘Books’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();

        //Verify the text ‘Books’
        String expectedText= "Books";
        String actualText= driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();

        //Verify the text ‘Jewelry’
        String expectedText= "Jewelry";
        String actualText= driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        // click on the ‘Giftcards’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();

        //Verify the text ‘Giftcards’
        String expectedText= "Gift Cards";
        String actualText= driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals(expectedText,actualText);

    }
}
