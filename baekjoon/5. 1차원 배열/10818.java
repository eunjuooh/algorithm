import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int min = 1000000;
        int max = -1000000;
        
        int[] count = new int[sc.nextInt()];
        
        for(int i = 0; i < count.length; i++)
        {
            count[i] = sc.nextInt();
            if(count[i] < min)
                min = count[i];
            if(count[i] > max)
                max = count[i];
        }
        
        System.out.println(min + " " + max);
        
    }
}
