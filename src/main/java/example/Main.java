package example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class Main {


    public static @NotNull AppiumDriver initializeAndroidDriver() throws MalformedURLException, InterruptedException {
        DesiredCapabilities wDioDemo = new DesiredCapabilities();
        wDioDemo.setCapability("platformName", "Android");
        wDioDemo.setCapability("platformVersion", "8.1");
        wDioDemo.setCapability("automationName", "UIAutomator2");
        wDioDemo.setCapability("deviceName", "emulator-5554");
        wDioDemo.setCapability("appPackage", "com.wdiodemoapp");
        wDioDemo.setCapability("appActivity", ".MainActivity");
        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), wDioDemo);

        Dimension sizeScreen = driver.manage().window().getSize();
        System.out.println("Size Screen" + sizeScreen);

        Point midPoint = new Point((int) (sizeScreen.width * 0.5), (int) (sizeScreen.height * 0.5));

        System.out.println("Half Width: " + midPoint.x);
        System.out.println("Half Height: " + midPoint.y);


        return driver;
    }


}





