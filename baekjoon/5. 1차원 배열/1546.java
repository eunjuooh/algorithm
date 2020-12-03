import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] score = new int[sc.nextInt()];
        float max = 0;
        float sum = 0;
        
        for(int i = 0; i < score.length; i++)
        {
            score[i] = sc.nextInt();
            if(score[i] > max)
                max = score[i];
        }
        
        
        for(int j = 0; j < score.length; j++)
        {
            sum += score[j] / max * 100;
        }
          
        System.out.println(sum / score.length);
    }
}
