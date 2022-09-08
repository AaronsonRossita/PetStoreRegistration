import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.PrimitiveIterator;

public class RegistrationForm {
    private final String USERIDFIELD = "username";
    private final String NEWPASSWORDFIELD = "password";
    private final String REPEATPASSWORDFIELD = "repeatedPassword";
    private final String FIRSTNAMEFIELD = "account.firstName";
    private final String LASTNAMEFIELD = "account.lastName";
    private final String EMAILFIELD = "account.email";
    private final String PHONEFIELD = "account.phone";
    private final String ADDRESS1FIELD = "account.address1";
    private final String CITYFIELD = "account.city";
    private final String STATEFIELD = "account.state";
    private final String ZIPFIELD = "account.zip";
    private final String COUNTRYFIELD = "account.country";

    private final String LANGUAGEDROPDOWN = "account.languagePreference";
    private final String CATEGORYDROPDOWN = "account.favouriteCategoryId";
    private final String MYLISTCHECKBOX = "account.listOption";
    private final String MYBANNERCHECKBOX = "account.bannerOption";
    private final String REGISTERBTN = "newAccount";

    WebElement userIdField;
    WebElement newPasswordField;
    WebElement repeatPasswordField;
    WebElement fNameField;
    WebElement lNameField;
    WebElement emailField;
    WebElement phoneField;
    WebElement address1Field;
    WebElement cityField;
    WebElement stateField;
    WebElement zipField;
    WebElement countryField;
    Select languageDropDown;
    Select categoryDropDown;
    WebElement myListCheckBox;
    WebElement myBannerCheckBox;
    WebElement registerBtn;

    public RegistrationForm(WebDriver driver) {
        this.userIdField = driver.findElement(By.name(USERIDFIELD));
        this.newPasswordField = driver.findElement(By.name(NEWPASSWORDFIELD));
        this.repeatPasswordField = driver.findElement(By.name(REPEATPASSWORDFIELD));
        this.fNameField = driver.findElement(By.name(FIRSTNAMEFIELD));
        this.lNameField = driver.findElement(By.name(LASTNAMEFIELD));
        this.emailField = driver.findElement(By.name(EMAILFIELD));
        this.phoneField = driver.findElement(By.name(PHONEFIELD));
        this.address1Field = driver.findElement(By.name(ADDRESS1FIELD));
        this.cityField = driver.findElement(By.name(CITYFIELD));
        this.stateField = driver.findElement(By.name(STATEFIELD));
        this.zipField = driver.findElement(By.name(ZIPFIELD));
        this.countryField = driver.findElement(By.name(COUNTRYFIELD));
        this.languageDropDown = new Select(driver.findElement(By.name(LANGUAGEDROPDOWN)));
        this.categoryDropDown = new Select(driver.findElement(By.name(CATEGORYDROPDOWN)));
        this.myListCheckBox = driver.findElement(By.name(MYLISTCHECKBOX));
        this.myBannerCheckBox = driver.findElement(By.name(MYBANNERCHECKBOX));
        this.registerBtn = driver.findElement(By.name(REGISTERBTN));
    }

    public void registration(Account account){
        userIdField.sendKeys(account.userId);
        newPasswordField.sendKeys(account.newPassword);
        repeatPasswordField.sendKeys(account.repeatPassword);
        fNameField.sendKeys(account.fName);
        lNameField.sendKeys(account.lName);
        emailField.sendKeys(account.email);
        phoneField.sendKeys(account.phone);
        address1Field.sendKeys(account.address1);
        cityField.sendKeys(account.city);
        stateField.sendKeys(account.state);
        zipField.sendKeys(account.zip);
        countryField.sendKeys(account.country);
        languageDropDown.selectByValue(account.language);
        categoryDropDown.selectByValue(account.category);
        if (account.myList){
            myListCheckBox.click();
        }
        if (account.myBanner){
            myBannerCheckBox.click();
        }
        registerBtn.click();
    }

}
