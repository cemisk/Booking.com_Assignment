package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BookingHomePage extends BasePage{

    @FindBy(xpath = "//input[@name='ss']")
    public WebElement locationButton;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement checkinButton;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//span[contains(text(),'2 yetişkin')]")
    public WebElement yetiskinButton;

    @FindBy(xpath = "//span[contains(text(),'0 çocuk')]")
    public WebElement cocukButton;

    @FindBy(xpath = "//span[contains(text(),'1 oda')]")
    public WebElement odaButton;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[4]/div[2]/button[1]")
    public WebElement araButton;

    @FindBy(xpath = "//span[.='New York']")
    public WebElement newYork;

    @FindBy(xpath = "//tbody/tr[4]/td[3]")
    public WebElement ilkTarih;

    @FindBy(xpath = "//tbody/tr[4]/td[6]")
    public WebElement sonTarih;

    @FindBy(xpath = "//button[@aria-label='Çocuk sayısını artırın']")
    public WebElement cocukArttirButton;

    @FindBy(xpath = "//select[@name='age']")
    public WebElement cocukYasDropdown;

}
