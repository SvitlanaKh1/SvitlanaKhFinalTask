package basetest;

import example.Main;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import jdk.jfr.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Collections;

public class TestsNG {
    private static AppiumDriver driver;

    @BeforeSuite
    @Description("Open Application")
    public void getAndroidDriver() throws MalformedURLException, InterruptedException {
        driver = Main.initializeAndroidDriver();

    }

    @Test
    @Description("Click Drag")
    public void clickDrag() throws InterruptedException {
        Thread.sleep(1000);
        WebElement dragButton = driver.findElement(AppiumBy.xpath
                ("//android.widget.TextView[@text=\"\uDB80\uDDDB\"]"));
        dragButton.click();

    }

    @Test(priority = 1)
    @Description("Test move element1")
    public void testMoveElement1() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton1 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-c1\"]/android.widget.ImageView"));
        WebElement dropButton1 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-c1\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton1.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton1.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 2)
    @Description("Test move element2")
    public void testMoveElement2() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton2 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-c3\"]/android.widget.ImageView"));
        WebElement dropButton2 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-c3\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton2.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton2.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 3)
    @Description("Test move element3")
    public void testMoveElement3() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton3 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-c2\"]/android.widget.ImageView"));
        WebElement dropButton3 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-c2\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton3.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton3.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 4)
    @Description("Test move element4")
    public void testMoveElement4() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton4 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-r1\"]/android.widget.ImageView"));
        WebElement dropButton4 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-r1\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton4.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton4.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 5)
    @Description("Test move element5")
    public void testMoveElement5() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton5 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-l1\"]/android.widget.ImageView"));
        WebElement dropButton5 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-l1\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton5.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton5.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 6)
    @Description("Test move element6")
    public void testMoveElement6() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton6 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-r2\"]/android.widget.ImageView"));
        WebElement dropButton6 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-r2\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton6.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton6.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 7)
    @Description("Test move element7")
    public void testMoveElement7() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton7 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-l2\"]/android.widget.ImageView"));
        WebElement dropButton7 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-l2\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton7.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton7.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 8)
    @Description("Test move element8")
    public void testMoveElement8() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton8 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-r3\"]/android.widget.ImageView"));
        WebElement dropButton8 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-r3\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton8.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton8.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 9)
    @Description("Test move element9")
    public void testMoveElement9() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dragButton9 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drag-l3\"]/android.widget.ImageView"));
        WebElement dropButton9 = driver.findElement(AppiumBy.xpath
                ("//android.view.ViewGroup[@content-desc=\"drop-l3\"]/android.view.ViewGroup"));

        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), dragButton9.getLocation()))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(5000)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(5000), PointerInput.Origin.viewport(), dropButton9.getLocation()))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(sequence));

    }

    @Test(priority = 10)
    @Description("Finish robot")
    public void finishRobot() throws InterruptedException {
        Thread.sleep(3000);
        WebElement finishRobot = driver.findElement(AppiumBy.xpath
                ("//android.widget.TextView[@text=\"Retry\"]"));
        String Retry = finishRobot.getText();
        System.out.println(Retry);

    }


}










