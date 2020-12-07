import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] scores = new int[sc.nextInt()];
        String[] ox = new String[scores.length];
        
        for(int i = 0; i < ox.length; i++)
            ox[i] = sc.next();
        
        for(int i = 0; i < scores.length; i++)
        {
            int score = 0;
            
            for(int j = 0; j < ox[i].length(); j++)
            {
                if(ox[i].charAt(j) == 'O')
                {
                    score++;
                    scores[i] += score;
                }
                else
                    score = 0;
            }
            
            System.out.println(scores[i]);
        }
    }
}
