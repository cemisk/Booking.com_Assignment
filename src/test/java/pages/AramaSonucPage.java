package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AramaSonucPage extends BasePage{

    @FindBy(linkText = "Fiyat (önce en düşük)")
    public WebElement fiyatButton;

    @FindBy(xpath = "//*[@class='fde444d7ef _e885fdc12']")
    public List<WebElement> aramaSonuclari;


}
