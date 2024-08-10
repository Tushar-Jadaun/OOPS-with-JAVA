import java.awt.*;

public class Secound {
    // call by value
        public static void main(String[]args)
    {
        int a = 5;
        int b = a;
        a=6;
        System.out.println(b);
    } 
    // call by reference
    public static void main(String[]args)
    {
       Point a =  new Point(1,2);
        Point b = a ;
        a.x=4;
        System.out.println(b);
    }
    
}
