package data_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeData {
    public static WebDriver webDriver;
    public HomeData(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        HomeData.webDriver = webDriver;
    }
    public String productSatu(){
        return  "Sauce Labs Backpack";
    }

}