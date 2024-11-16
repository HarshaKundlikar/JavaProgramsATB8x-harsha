package SuperKeyword;

public class TestCase1 extends BaseClass{
    //Single inheritance
    TestCase1(){
        super();
        this.setBrowser("Edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);
    }
}
