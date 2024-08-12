import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        int a=3;
        System.out.print("enter your input : ");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        System.out.println("your input  "+ input);
        System.out.println( "result a==input:"+(a==input));
        System.out.println( "result a!=input:"+(a!=input));
        System.out.println( "result a>=input:"+(a>=input));
        System.out.println( "result a<=input :"+(a<=input));
        System.out.println( "result a<input :"+(a<input));
        System.out.println( "result a>input :"+(a>input));
        
        boolean isPassed=true;
        boolean inuniform=true;
        boolean achaBacha=isPassed || inuniform;
        System.out.println(achaBacha);
    }
    
}
