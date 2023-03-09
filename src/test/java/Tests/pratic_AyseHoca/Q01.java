package Tests.pratic_AyseHoca;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Q01 {
      /*
    > TestNG default olarak @Test methodlarini alfabetik siraya gore run eder,
    yukaridan asagiya dogru degil.
    > priority annotation testlere oncelik vermek icin kullanilir,
     kucuk olan numara daha once calisir.
    > priority : TestNG testlerinde , testler konsola alfabetik sira ile yazdirilir.
    > priority default degeri sifirdir.
    > enabled = false methodu : Testi gormezden gelmek icin @Test 'in yanina yazilir.
     */

      @Test
      public void wisequarter(){
          Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
      }
    @Test (dependsOnMethods = "wisequarter")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }
    @Test (dependsOnMethods = "youtube")
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
}
