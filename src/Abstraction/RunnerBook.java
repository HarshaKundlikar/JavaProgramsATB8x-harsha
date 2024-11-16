package Abstraction;

public class RunnerBook {
    public static void main(String[] args) {
        Book mybook=new PrintMyBook();
        mybook.getdetails();
        Book mybook1=new PrintMyBook("J K Rolling","Harry potter",1000);
    }
}
