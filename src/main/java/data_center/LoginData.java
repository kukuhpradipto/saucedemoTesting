package data_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginData {
    public static WebDriver webDriver;
    public LoginData(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        LoginData.webDriver = webDriver;
    }
    public String usernameData(){
        return  "standard_user";
    }

    public String passwordData(){
        return  "secret_sauce";
    }

    public String invalidUsernameData(){
        return "dsdsdfeede";
    }

    public String invalidPasswordData(){
        return "1223fdfdf";
    }

    public String passwordBlankData(){
        return "";
    }

    public String usernameBlankData(){
        return "";
    }

    public String usernameLockedData(){
        return "locked_out_user";
    }

    public String problemUserData(){
        return "problem_user";
    }

}