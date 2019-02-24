package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPage{

	private WebDriver driver;
    private WebDriverWait wait;
    
    @FindBy(xpath = "//label[@for='fullName']")
    private WebElement fullNameInput;
    
    @FindBy(id = "user-login-btn")
    private WebElement signInBtn;

    @FindBy(css = "form .join-link")
    private WebElement loginForm;

    @FindBy(css= "#logemail")
    private WebElement logemail;

    @FindBy(css= "#logpassword")
    private WebElement loaginPasswordInput;

    @FindBy(css= "#btnlogin")
    private WebElement loginBtn;

    @FindBy(css= ".join-link")
    private WebElement joinlink;

    @FindBy(css = "form button.loginBtn--Google")
    private WebElement GoogleElementFromStartNowBtn;
    
    @FindBy(css ="form button.loginBtn--Google")
    private WebElement googleBtnLogin;
    
    @FindBy(css ="form button.loginBtn--Facebook")
    private WebElement facebookBtnLogin;
    
    @FindBy(xpath = "//*[@id=\"visitor-signup\"]/div/div/div/div/div[2]/div[2]/form/button")
    private WebElement FacebookElementFromStartNowBtn;

    
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
    
    public void goTo(){
        this.driver.get("https://artlist.io/");
    }

	public void setfullNameBtn(String fullname) {
        waitForElement(fullNameInput, 10);
        fullNameInput.click();
        fullNameInput.sendKeys(fullname);

    }
    
    
    private void waitForElement(WebElement fullNameInput2, int i) {
		// TODO Auto-generated method stub
		
	}


	public WebElement clickSignInBtn() {
		this.wait.until(ExpectedConditions.visibilityOf(this.signInBtn));
		this.signInBtn.click();
        return signInBtn;

    }

    public void setEmail(String email){
    	 this.wait.until(ExpectedConditions.visibilityOf(this.logemail));
    	 this.logemail.sendKeys(email);
    }

    public void setPassword(String password){
    	 this.wait.until(ExpectedConditions.visibilityOf(this.loaginPasswordInput));
    	 this.loaginPasswordInput.sendKeys(password); 
    }

    public void clickLoginBtn() {
    	this.wait.until(ExpectedConditions.visibilityOf(this.loginBtn));
    	this.loginBtn.click();
    	
    }

    public WebElement clickJoinLink() {
    	this.wait.until(ExpectedConditions.visibilityOf(this.joinlink));
    	this.joinlink.click(); 
        return joinlink;
        
    }


    public WebElement clickGoogleBtn() {
    	this.wait.until(ExpectedConditions.visibilityOf(this.googleBtnLogin));
    	this.googleBtnLogin.click();
        return googleBtnLogin;

    }
    
    public WebElement clickFacebookBtn() {
        this.wait.until(ExpectedConditions.visibilityOf(this.facebookBtnLogin));
    	this.facebookBtnLogin.click();
        return facebookBtnLogin;


    }
    
    public WebElement clickFacebookBtnAfterClickingStartNowBtn() {
       this.wait.until(ExpectedConditions.visibilityOf(this.FacebookElementFromStartNowBtn));
    	this.FacebookElementFromStartNowBtn.click();
        return FacebookElementFromStartNowBtn;

    }
    
    public WebElement clickGoogletnAfterClickingStartNowBtn() {
        this.wait.until(ExpectedConditions.visibilityOf(this.GoogleElementFromStartNowBtn));
    	this.GoogleElementFromStartNowBtn.click();
        return GoogleElementFromStartNowBtn;
    }
    
 }
