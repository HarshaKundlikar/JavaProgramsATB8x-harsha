package TaskApiAutomation;

public class TestClassApi extends BaseClassAPI {
    TestClassApi(){
        super();
        this.setMethod_Get("GET->>Test class");
        this.setMethod_Put("PUT->>Test class");
        this.setMethod_patch("Patch->>Test class");
        this.setMethod_delete("Delete->>Test class");

    }

    @Override
    public void setMethod_Get(String method_Get) {
        super.setMethod_Get(method_Get);
    }

    @Override
    public void setMethod_Put(String method_Put) {
        super.setMethod_Put(method_Put);
    }

    @Override
    public void setMethod_patch(String method_patch) {
        super.setMethod_patch(method_patch);
    }

    @Override
    public void setMethod_delete(String method_delete) {
        super.setMethod_delete(method_delete);
    }
}
