package Models;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.MissingFormatArgumentException;

public class MainPage {

    private AppiumDriver<MobileElement> driver;

    private final By mainpagebtn = MobileBy.AccessibilityId("Bosh sahifa");

    private final By searchpolee = MobileBy.id("com.texnomart.app:id/tvSearch");

    private final By banner2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/androidx.appcompat.widget.LinearLayoutCompat/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]");

    private final By bannerRasm = By.id("com.texnomart.app:id/rasm1");

    private final By scrollToTop = MobileBy.AccessibilityId("scrollBottom");

    private final By brands = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.GridView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/androidx.cardview.widget.CardView/android.widget.ImageView");

    private final By seaarch2 = MobileBy.id("com.texnomart.app:id/search_src_text");

    private final By searchElement =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.TextView");

    private final By yengiTavar = MobileBy.id("com.texnomart.app:id/tv_product_name");

    private final By toSaved = MobileBy.id("com.texnomart.app:id/btnItemInCart");

    private final By Saved = MobileBy.AccessibilityId("Savatcha");

    private final By order = MobileBy.id("com.texnomart.app:id/confirm_order");







    public MainPage(AppiumDriver<MobileElement> driver){
        this.driver = driver;
    }

    public AppiumDriver<MobileElement> getAppiumDriver() {
        return driver;
    }

    public MobileElement mainbtn() {
        return driver.findElement(mainpagebtn);
    }

    public MobileElement searchpole() {
        return driver.findElement(searchpolee);
    }

    public MobileElement banner22() {
        return driver.findElement(banner2);
    }

    public MobileElement bannerRasm3() {
        return driver.findElement(bannerRasm);
    }

    public MobileElement scrollTop(){
        return driver.findElement(scrollToTop);
    }
    public MobileElement brandbar(){
        return driver.findElement(brands);
    }

    public MobileElement search2(){
        return driver.findElement(seaarch2);
    }

    public MobileElement searchElementTV(){
        return driver.findElement(searchElement);
    }

    public MobileElement yengiTovar() {return  driver.findElement(yengiTavar);}

    public MobileElement toSavedd() {return  driver.findElement(toSaved);}

    public MobileElement Savedd() {return  driver.findElement(Saved);}

    public MobileElement orderr() {return  driver.findElement(order);}




}
