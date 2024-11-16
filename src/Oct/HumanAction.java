package Oct;

public class HumanAction {
    void walk(){
        System.out.println("I am:  no reutrn no argument");
    }

    int talk(){
        System.out.println("I reutrn value but no argument");
        return 10;
    }
    String sleep(String name){
        System.out.println("I reutrn value and return argument");
        return "harsha";
    }
    String Sing(String song, String prayer){
        System.out.println("I reutrn 2 value and 2 return argument");
        //return song;
        return "shubham";
    }

}
