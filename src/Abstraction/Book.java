package Abstraction;

abstract class Book {
    abstract void getdetails();
    String author;
    String name;
    int price;
    Book(){
        System.out.println("Default construcor");

    }
    Book(String author,String name){
        System.out.println("Para construcor"+author);
        System.out.println("Para construcor"+name);
        //System.out.println("Para construcor"+price);
    }

}
