import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Account {

    String userId;
    String newPassword;
    String repeatPassword;
    String fName;
    String lName;
    String email;
    String phone;
    String address1;
    String city;
    String state;
    String zip;
    String country;
    String language;
    String category;
    boolean myList;
    boolean myBanner;

    public Account(String userId, String newPassword, String repeatPassword, String fName, String lName, String email, String phone, String address1, String city, String state, String zip, String country, String language, String category, boolean myList, boolean myBanner) {
        this.userId = userId;
        this.newPassword = newPassword;
        this.repeatPassword = repeatPassword;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
        this.address1 = address1;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.language = language;
        this.category = category;
        this.myList = myList;
        this.myBanner = myBanner;
    }
}
