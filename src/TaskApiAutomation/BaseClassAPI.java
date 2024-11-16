package TaskApiAutomation;

public class BaseClassAPI {
    String method_Get;
    String method_Put;
    String method_patch;
    String method_delete;
    BaseClassAPI()
    {
        System.out.println("BaseClass default constructor");
    }
    BaseClassAPI(String name)
    {
        System.out.println("parameterized Constructor- Base class");
    }


    public String getMethod_Get() {
        return method_Get;
    }
    public void setMethod_Get() {
        //this.method_Get = method_Get;
        System.out.println("GET METHOD1");
    }
    public void setMethod_Get(String method_Get) {
        this.method_Get = method_Get;
    }


    public String getMethod_Put() {
        return method_Put;
    }

    public void setMethod_Put() {
        System.out.println("PU METHOD1");
    }
    public void setMethod_Put(String method_Put) {
        this.method_Put = method_Put;
    }

    public String getMethod_patch() {
        return method_patch;
    }

    public void setMethod_patch() {
        System.out.println("PATCH METHOD1");
    }
    public void setMethod_patch(String method_patch) {
        this.method_patch = method_patch;
    }

    public String getMethod_delete() {
        return method_delete;
    }
    public void setMethod_delete() {
        System.out.println("DELETE METHOD1");
    }

    public void setMethod_delete(String method_delete) {
        this.method_delete = method_delete;
    }
}

