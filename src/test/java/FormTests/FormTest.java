package FormTests;

import PageObjects.FormPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormTest extends BaseTests{

    String name = "Zenek";
    String lastName = "Ogórek";
    String email = "sa@wp.pl";
    String phone = "500500500";
    String pesel = "55050304369";
    String idNumber = "YJV305233";
    String birthDate = "2021-07-01";

    @Test
    public void formBasicDataTest(){
        String title = "Formularz testowy";
        Assertions.assertEquals(driver.getTitle(), title);
        FormPage formPage = new FormPage(driver);
        formPage.typeName(name).typeLastName(lastName).typeEmail(email).typePhone(phone).typePesel(pesel).typeIdNumber(idNumber).typeBirthDate(birthDate).goToNextSection();
        String contentAgreement = "Vestibulum eu est mauris";
        Assertions.assertTrue(driver.getPageSource().contains(contentAgreement), "Page source does not contain: " +contentAgreement);
    }
}
