package Sept_one;

public class Lab006_Operators {
    public static void main(String args[]){
        //+,-,*,/,%
        int i= 24;
        int i2= 10;
        byte b= 2;
        float f = 1.1F;
        double d= 333.9f;
        char c='a';
        boolean b1= true;

        System.out.println("Add="+i+f);
        System.out.println(i-i2);
        System.out.println("Mul="+i*i2);
        System.out.println("Div="+i/i2);
        System.out.println("module="+i%i2);

        //<,>,==,=,<=,>= relational operator
        System.out.println("Greater than >");
        System.out.println("Less than <");
        System.out.println("Greater than equal to >= ");
        System.out.println("Less than equal to <=");
        System.out.println("Equal to =");
        System.out.println("Equal to equal to ==");

        //Increment & Decrement
        System.out.println("Increment & Decrement");
        System.out.println("i="+i);
        System.out.println(++i);
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i + 1);

        System.out.println(--i);
        System.out.println(i);
        System.out.println(i--);
        System.out.println(i);
        System.out.println(--i -i);






        
    }
}
