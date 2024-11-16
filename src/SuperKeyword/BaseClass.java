package SuperKeyword;

import java.security.PrivateKey;

public class BaseClass {

    private String browser;
    boolean isAuth;
   BaseClass(){
System.out.println("Default Constructor- Base class");
   }
   BaseClass(String b){
       System.out.println("parameterized Constructor- Base class");

  }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
       if(isAuth) {
           this.browser = browser;
       }else {
           System.out.println("Not Allowed");
       }
    }
    void openBrowser(){
       System.out.println("Chrome Browser");
    }
    void openBrowser(String browserName){
       System.out.println("Open browser->"+browserName);
    }
    void closeBrowser(){
       System.out.println("Close Browser ");
    }

}

