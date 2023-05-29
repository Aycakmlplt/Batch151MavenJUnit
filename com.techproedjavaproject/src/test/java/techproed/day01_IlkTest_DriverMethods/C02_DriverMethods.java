package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","src/main/resources");
      //  buraya gerek yok o zaman sizde dependency oldugundan, sizinki bir kac adim sonraki islem.
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        //getTitle() Sayfa başlığını verir
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());
        String amazonWindowHanle = driver.getWindowHandle();
        System.out.println("Amazon Window Handle Değeri : "+amazonWindowHanle);

        driver.get("https://techproeducation.com");
        System.out.println("Techproed Actual Title : "+driver.getTitle());//getTitle() methodu Sayfa başlığını verir

        //getCurrentUrl() Gidilen sayfanın Url'ini verir
        System.out.println("Techproed Actual Url : "+driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir.Bunlarla karsilasmayacagiz cok.Developerlar ilgilenir.
        //System.out.println(driver.getPageSource());Bilerek yoruma aldık her çalıştırdığımızda konsola bütün kaynak kodlarını vereceği için

        //getWindowHandle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle değerini sayfalar arası geçiş için kullanırız
        System.out.println("Techproed Window Handle Değeri : "+driver.getWindowHandle());//205C3ECF2264AD85FFE25CF57FFD35E4



    }
}