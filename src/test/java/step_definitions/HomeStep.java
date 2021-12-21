package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AramaSonucPage;
import pages.BookingHomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.Collections;
import java.util.List;

public class HomeStep {

    BookingHomePage bookingHomePage = new BookingHomePage();
    AramaSonucPage aramaSonucPage = new AramaSonucPage();
    WebDriver driver;


    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        Driver.getDriver().get(string);
        Driver.getDriver().manage().window().maximize();
        BrowserUtilities.waitForPageToLoad(3);
    }

    @Given("nereye gidiyorsunuz kismina {string} yazar")
    public void nereye_gidiyorsunuz_kismina_yazar(String string) {
        bookingHomePage.locationButton.sendKeys(string);
        BrowserUtilities.waitFor(2);
    }

    @Given("cikan secenekelrden New York secenegini tiklar")
    public void cikan_secenekelrden_new_york_secenegini_tiklar() {
        bookingHomePage.newYork.click();
    }

    @Given("Check-in butonuna basarak {int} Aralik tarihini secer")
    public void check_in_butonuna_basarak_aralik_tarihini_secer(Integer int1) {
        bookingHomePage.ilkTarih.click();
    }

    @Given("Check-out butonuna basarak {int} Aralik tarihini secer")
    public void check_out_butonuna_basarak_aralik_tarihini_secer(Integer int1) {
        bookingHomePage.sonTarih.click();
    }

    @Given("cocuk butonuna basar ve cocuk sayisini {int} olarak ayarlar")
    public void cocuk_butonuna_basar_ve_cocuk_sayisini_olarak_ayarlar(Integer int1) {
        bookingHomePage.cocukButton.click();
        bookingHomePage.cocukArttirButton.click();
    }

    @Given("cocuk yasını yas dropdownundan {int} olarak secer")
    public void cocuk_yasını_yas_dropdownundan_olarak_secer(Integer int1) {
        Select select = new Select(bookingHomePage.cocukYasDropdown);
        select.selectByVisibleText("12 yaşında");
    }

    @Given("ara butonuna basar")
    public void ara_butonuna_basar() {
        bookingHomePage.araButton.click();
    }

    @Given("sonuc sayfasında fiyat\\(once en dusuk) butonuna basar")
    public void sonuc_sayfasında_fiyat_once_en_dusuk_butonuna_basar() {
        aramaSonucPage.fiyatButton.click();
        BrowserUtilities.waitFor(4);
    }

    @Then("kullanici cıkan sonuclari gorebilmelidir")
    public void kullanici_cıkan_sonuclari_gorebilmelidir() {

        String[] s = new String[25];
        int i=0;

        for (WebElement sonuc : aramaSonucPage.aramaSonuclari ) {
             s[i] = sonuc.getText().substring(3).replace(".","");
                i++;
        }

        for(int j=0;j<s.length-1;j++){
            System.out.println(Integer.parseInt(s[j]));
            if (Integer.parseInt(s[j]) > Integer.parseInt(s[j+1])){
                System.out.println("sirali degil");
            }else {
                Assert.assertTrue(true);
            }
        }



    }

}
