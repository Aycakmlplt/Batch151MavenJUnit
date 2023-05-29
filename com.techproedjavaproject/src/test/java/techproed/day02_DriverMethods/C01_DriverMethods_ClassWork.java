package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        //  System.setProperty("webdriver.chrome.driver","src/main/resources");
        //  buraya gerek yok o zaman sizde dependency oldugundan, sizinki bir kac adim sonraki islem.

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim

        driver.get("https://amazon.com");

        //Sayfa başlığının Amazon içerdiğini test edelim

        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";// buyuk kucuk harf onemsiyor.
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");


        //Url'in https://www.amazon.com olduğunu test edelim

        String actualUrl = driver.getCurrentUrl();
        //String expectedUrl = "https://www.amazon.com";// eger slashi koymazsan failed oluyor koydugumuzda passed oldu.
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED"); // 2. de passed
        }else System.out.println("Test FAILED");//Test Failed ilk denemede slash olmadan



        //Sayfayı kapatalım.
        driver.close();//Browser'ı kapatır
        //driver.quit();-> Birden fazla browser varsa hepsini kapatır.







    }
}
