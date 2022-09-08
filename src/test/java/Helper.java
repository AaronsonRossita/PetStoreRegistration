import org.openqa.selenium.chrome.ChromeDriver;

public class Helper{

    public static final String PETSTOREURL = "https://petstore.octoperf.com/";
    public static final String ENTERTHESTORE = "//*[@id=\"Content\"]/p[1]/a";
    public static final String SIGNINLINK = "//*[@id=\"MenuContent\"]/a[2]";
    public static final String REGISTERLINK = "//*[@id=\"Catalog\"]/a";

    public static Account account1 = new Account("1",
            "123",
            "123",
            "Rossita",
            "Aaronson",
            "aaronsonrossita@gmail.com",
            "0546574969",
            "street",
            "Rehovot",
            "IL",
            "76654",
            "IL",
            "english",
            "CATS",
            true,
            true);







    public static ChromeDriver setupDriver(){
        System.setProperty("webdriver.chrome.driver","res\\chromedriver.exe");
        return new ChromeDriver();
    }

}
