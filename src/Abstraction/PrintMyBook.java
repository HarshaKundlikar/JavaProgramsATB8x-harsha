package Abstraction;

public class PrintMyBook extends Book{
    @Override
    void getdetails() {
        System.out.println("Bookdetails are here:");
        //System.out.println("BookName:"+author);
     //   System.out.println("BookName:"+price);
    }
    PrintMyBook(){
        System.out.println("Default cons of printmy boook");
    }
    PrintMyBook(String author,String name,int price){

        System.out.println("Para construcor"+author);
        System.out.println("Para construcor"+name);
        System.out.println("Para construcor"+price);
        ///super();
    }
}
