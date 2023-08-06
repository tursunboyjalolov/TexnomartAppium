package Models;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class Profile {
    private AppiumDriver<MobileElement> driver;
    private final By profilebtn = MobileBy.AccessibilityId("Profil");

    private final By aksiya = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

    private final By haqida = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.TextView");




    public Profile(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public AppiumDriver<MobileElement> getAppiumDriver() {
        return driver;
    }

    public MobileElement profil() {
        return driver.findElement(profilebtn);
    }

    public MobileElement aksiyaa() {
        return driver.findElement(aksiya);
    }

    public MobileElement haqidaa() {
        return driver.findElement(haqida);
    }

}
