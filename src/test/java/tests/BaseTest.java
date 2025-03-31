package tests;

import constants.Constants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.MainPage;

public class BaseTest {
    protected WebDriver driver;
    protected MainPage mainPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get(Constants.BASE_URL);
        mainPage = new MainPage(driver);
    }

    @After
    public void tearDown() {
            driver.quit();
        }
    }