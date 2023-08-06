package org.example;

import Models.Catalog;
import Models.MainPage;
import Models.Profile;
import com.sun.jdi.ThreadGroupReference;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static AppiumDriver<MobileElement> driver;
    public static void main(String[] args) {
        appiumTest1();
    }
    public static void appiumTest1(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("udid", "99d18b64");
        caps.setCapability("appPackage", "com.texnomart.app");
        caps.setCapability("appActivity", "com.texnomart.app.screen.MainActivity");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", "false");
//        caps.setCapability("GboardKeyboard", "true");
//        caps.setCapability("resetKeyboard", "true");

        try {

            URL url = new URL("http://127.0.0.0:4723/wd/hub/");
            driver = new AppiumDriver<MobileElement>(url,caps);


            Thread.sleep(8000);


            MainPage banner2 = new MainPage(driver);
            banner2.banner22().click();

            MainPage bannerRasm = new MainPage(driver);
            bannerRasm.bannerRasm3().click();

            Thread.sleep(1000);

            scrollDown();
            Thread.sleep(1500);
            driver.navigate().back();

            Dimension windowSize = driver.manage().window().getSize();
            int screenHeight = windowSize.getHeight();
            int screenWidth = windowSize.getWidth();

            int xStarPoint = 50 * screenWidth / 100;
            int xEndPoint = xStarPoint;

            int yStarPoint = 70 * screenHeight / 100;
            int yEndPoint = 20 * screenHeight / 100;

            PointOption startPoint = new PointOption().withCoordinates(xStarPoint, yStarPoint);
            PointOption endPoint = new PointOption().withCoordinates(xEndPoint, yEndPoint);
            TouchAction touchAction = new TouchAction(driver);

            //scroll down
            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(1000);

            //scroll to top
            touchAction
                    .press(endPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(startPoint)
                    .release()
                    .perform();

            touchAction
                    .press(endPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(startPoint)
                    .release()
                    .perform();

            touchAction
                    .press(endPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(startPoint)
                    .release()
                    .perform();


            MainPage scrolltop = new MainPage(driver);
            scrolltop.scrollTop().click();

            Thread.sleep(2000);

            MainPage brends = new MainPage(driver);
            brends.brandbar().click();

            Thread.sleep(2000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(2000);

            driver.navigate().back();


            MainPage searchpole = new MainPage(driver);
            searchpole.searchpole().click();

            MainPage search2 = new MainPage(driver);
            search2.search2().sendKeys("теле");

            Thread.sleep(2500);

            MainPage searchElement = new MainPage(driver);
            searchElement.searchElementTV().click();

            Thread.sleep(2000);

            MainPage mainPagebrn = new MainPage(driver);
            mainPagebrn.mainbtn().click();

            Thread.sleep(2000);

            Catalog catalog = new Catalog(driver);
            catalog.katalog().click();

            Thread.sleep(2000);

            catalog.brinchiElement().click();

            Thread.sleep(2000);

            catalog.ikkinchiElement().click();

            Thread.sleep(2000);

            catalog.filterr().click();

            Thread.sleep(3000);

            catalog.modell().click();

            Thread.sleep(2000);

            catalog.madelItem().click();

            Thread.sleep(2000);

            catalog.confirmb().click();

            Thread.sleep(2000);

            catalog.rami().click();

            Thread.sleep(2000);

            catalog.oltili().click();

            Thread.sleep(1000);

            catalog.sakkizli().click();

            Thread.sleep(1000);

            catalog.confirmb().click();

            Thread.sleep(2000);

            catalog.confirmb().click();

            Thread.sleep(3000);

            mainPagebrn.mainbtn().click();

            Thread.sleep(2000);

            Profile profile = new Profile(driver);
            profile.profil().click();

            Thread.sleep(1500);

            profile.aksiyaa().click();

            Thread.sleep(1500);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();


            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            driver.navigate().back();

            profile.haqidaa().click();

            Thread.sleep(1000);

            driver.navigate().back();

            Thread.sleep(1500);

            mainPagebrn.mainbtn().click();

            Thread.sleep(2500);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            mainPagebrn.yengiTovar().click();

            Thread.sleep(2000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(2000);

            mainPagebrn.toSavedd().click();

            Thread.sleep(5000);

            mainPagebrn.Savedd().click();

            Thread.sleep(5000);

            mainPagebrn.orderr().click();

            Thread.sleep(5000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

            Thread.sleep(3000);

            touchAction
                    .press(startPoint)
                    .waitAction(new WaitOptions().withDuration(Duration.ofSeconds(2)))
                    .moveTo(endPoint)
                    .release()
                    .perform();

















        } catch (MalformedURLException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void scrollDown(){
        Dimension size = driver.manage().window().getSize();

        int startX = size.getWidth() /2;
        int endx = size.getWidth() /2;

        int starty = (int) (size.getHeight()*0.50);
        int endy = (int) (size.getHeight()*0.10);

        new TouchAction(driver).press(PointOption.point(startX, starty)).waitAction().
                moveTo(PointOption.point(endx,endy)).release().perform();
    }
}