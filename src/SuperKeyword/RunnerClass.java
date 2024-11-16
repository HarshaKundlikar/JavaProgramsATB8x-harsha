package SuperKeyword;

public class RunnerClass
{
    public static void main(String[] args) {
        BaseClass t1=new TestCase1();//Dynamic dispatch
        t1.openBrowser("Edge");
        t1.closeBrowser();
    }
}
