package Oct;

public class TestConstructor1 {
    int age;
    String name;
    String Surname;
    String address;
    String Accupation;

    //Default Constructor
    TestConstructor1() {
        System.out.println("TestConstructor1 Default Constructor");
    }

    // Parameterized Constructor
    TestConstructor1(String name) {
        System.out.println("TestConstructor1 Parameterized Constructor");
        System.out.println("Name:" + name);
    }

    TestConstructor1(String name, String Surname) {
        System.out.println("TestConstructor2 Parameterized Constructor");
        System.out.println("Name:" + name);
        System.out.println("Surname:" + Surname);

    }

    TestConstructor1(String name, String Surname, String address) {
        System.out.println("TestConstructo31 Parameterized Constructor");
        System.out.println("Name:" + name);
        System.out.println("Surname:" + Surname);
        System.out.println("Address:" + address);
        //System.out.println("Name:"+Surname);
    }

    TestConstructor1(String name, String Surname, String address, String Accupation) {
        System.out.println("TestConstructor4 Parameterized Constructor");
        System.out.println("Name:"+name);
        System.out.println("Surname:"+Surname);
        System.out.println("Address:"+address);
        System.out.println("Accupation:"+Accupation);
    }
}