package data_center;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransactionData {
    public static WebDriver webDriver;
    public TransactionData(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        TransactionData.webDriver = webDriver;
    }

    public String firstNameData(){
        return "Kukuh";
    }

    public String lastNameData(){
        return "Pradipto";
    }

    public String portalCodeData(){
        return "04021998";
    }

    public String blankData(){
        return "";
    }

    public String invalidData(){
        return "org.openqa.selenium.JavascriptExecutor;";
    }

    public String seratusData(){
        return "Tentang apa? Saya bisa menulis tentang berbagai topik, seperti teknologi, seni, sains, sejarah, dan banyak lagi. Silakan beri saya arahan lebih lanjut atau pilih topik yang Anda minati, dan saya akan mulai menulis";
    }

    public String oneLetterData(){
        return "T";
    }
}