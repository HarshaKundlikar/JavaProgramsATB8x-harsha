package Oct;

public class Calling_Class {
    public static void main(String[] args) {


        Ahuman A1 = new Ahuman();
        A1.put();
        TestConstructor1 T1 = new TestConstructor1();
        TestConstructor1 T2 = new TestConstructor1("Tushar");
        TestConstructor1 T3 = new TestConstructor1("Tushar","Kottal");
        TestConstructor1 T4 = new TestConstructor1("Tushar","Patil","Akola");
        TestConstructor1 T5 = new TestConstructor1("Tushar","Patil","Akola","Hotel management");
       // String s1=T2.name;
       // System.out.println("Parameterized TestConstructor1 value passed "+T2.name);

        System.out.println("Calling action class");
        HumanAction h= new HumanAction();
        h.walk();
        h.talk();
        h.sleep("aa");
        h.Sing("ar_rehman","Itni shakti");
    }
}
