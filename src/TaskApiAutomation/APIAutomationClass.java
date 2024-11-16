package TaskApiAutomation;

public class APIAutomationClass {
    public static void main(String[] args) {
        BaseClassAPI b1=new TestClassApi();
        b1.setMethod_Get();
        b1.setMethod_Put();
        b1.setMethod_patch();
        b1.setMethod_delete();
    }
}
