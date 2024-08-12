
import java.util.Scanner;

public class conditionaloperator {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first input : " );
        int enter  =input.nextInt();
        System.out.println("enter the secound input :");
        int enter2 =input.nextInt();
        if(enter==enter2)
        {
            System.out.println("equal");

        }
        else if (enter<=enter2)
        {
            System.out.println("enter the right number :");
            int enter3 =input.nextInt();
            System.out.println("you enter that : "+(enter3));
        }
        else
        {
            System.out.println("invalid");

        }
 
        Scanner input1 =new Scanner(System.in);
        String day =input1.nextLine(); 

        switch (day) {
            case "1":
                System.out.println("monday");
                break;
            case "2":
                System.out.println("tuesday");
                break;    
            case "3":
                System.out.println("wednesday");
                break;
            default:
                System.out.println("invalid");
                break;
        }

    }
    
}
