import java.util.Arrays;

public class fourth {
    public static void main(String[] args)  
    {
        int[] marks = new int[5];
        marks[0]=12;
        marks[1]=25;
        marks[2]=35;
        marks[3]=45;
        marks[4]=65;
        System.out.println(Arrays.toString(marks));
        
        int[] number= new int[] {25,35,62,45,25};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        
        int [][] data= new int[][] {{25,62},{95,36}};
        System.out.println(Arrays.deepToString(data));


        
    }
    
}
