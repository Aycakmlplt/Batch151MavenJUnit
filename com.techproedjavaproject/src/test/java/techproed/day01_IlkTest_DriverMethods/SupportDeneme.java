package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SupportDeneme {

    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
}
