import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("let calculate motion third equation ");
        System.out.println("enter the value of initial :");
        int intial = scanner.nextInt();
        System.out.println("enter the value of time :");
        double  time= scanner.nextInt();
        System.out.println("enter the value of acceleration : ");
        double acceleration=scanner.nextInt();
        double distance=(intial * time ) + (0.5 * acceleration * time * time);
        System.out.println("distance : "+distance);  
        
        //System.out.println(s=ut+1/2at*t);
    }
    
}
