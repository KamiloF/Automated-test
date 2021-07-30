package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;

    public FormPage (WebDriver driver){
        this.driver = driver;
    }

    private By inputName = By.cssSelector("input#id_first_name");
    private By inputLastName = By.cssSelector("#id_last_name");
    private By inputEmail = By.cssSelector("#id_email");
    private By inputPhone = By.cssSelector("#id_phone");
    private By inputPesel = By.cssSelector("#id_pesel");
    private By inputIdNumber = By.cssSelector("#id_id_numer");
    private By inputBirthdate = By.cssSelector("#id_date");
    private By nextPageFormButton = By.cssSelector("#form_button_next");

    public FormPage typeName(String name) {
        driver.findElement(inputName).sendKeys(name);
        return new FormPage(driver);
    }

    public FormPage typeLastName(String lastName) {
        driver.findElement(inputLastName).sendKeys(lastName);
        return new FormPage(driver);
    }

    public FormPage typeEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
        return new FormPage(driver);
    }

    public FormPage typePhone(String phone) {
        driver.findElement(inputPhone).sendKeys(phone);
        return new FormPage(driver);
    }

    public FormPage typePesel(String pesel) {
        driver.findElement(inputPesel).sendKeys(pesel);
        return new FormPage(driver);
    }

    public FormPage typeIdNumber(String idNumber) {
        driver.findElement(inputIdNumber).sendKeys(idNumber);
        return new FormPage(driver);
    }

    public FormPage typeBirthDate(String birthDate) {
        driver.findElement(inputBirthdate).sendKeys(birthDate);
        return new FormPage(driver);
    }

    public void goToNextSection() {
        driver.findElement(inputIdNumber).click();
        driver.findElement(nextPageFormButton).click();
        new FormPage(driver);
    }
}
