package Tests.day11_POM_assertions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06__SoftAssert {
    @Test
    public void webappTesti(){
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zerourl"));
        // 2. Sign in butonuna basin
     ZeroPage zeroPage=new ZeroPage();
     zeroPage.signInButonu.click();
        // 3. Login kutusuna “username” yazin
        zeroPage.usernameKutusu.sendKeys("username");
        // 4. Password kutusuna “password” yazin
        zeroPage.passwordKutusu.sendKeys("password");
        // 5. Sign in tusuna basin
        zeroPage.signInSubmitButonu.click();
        //navigateBack yapın
        Driver.getDriver().navigate().back();
        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroPage.onlineBanking.click();
        // 7. “Purchase Foreign Currency” tusuna basin
        zeroPage.purchaseFCButonu.click();
        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroPage.currencyDropdown);
        select.selectByVisibleText("Eurozone");
        // 9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();

        String expencedSecim="Eurozone(euro)";
        String actualsecim=select.getFirstSelectedOption().getText();
        softAssert.assertEquals(actualsecim,expencedSecim ,"dropdownda eurozone secili degil");

        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        // "Select One", "Australia (dollar)", "Canada (dollar)",
        // "Switzerland (franc)","China (yuan)","Denmark (krone)",
        // "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)",
        // "Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)",
        // "Sweden (krona)","Singapore (dollar)","Thailand (baht)"


        softAssert.assertAll();
        Driver.closeDriver();
    }
}
