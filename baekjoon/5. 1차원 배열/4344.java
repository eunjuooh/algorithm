import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int caseNum = sc.nextInt();
        String[] cases = new String[caseNum];
        double[] results = new double[caseNum];
        sc.nextLine();
        int index = 0;
        int count = 0;
        
        for(int i = 0; i < caseNum; i++) 
        {
            
            cases[i] = sc.nextLine();
            
            String[] scores = cases[i].split(" "); 
            
            int sum = 0;
            double avg = 0.0;
            
            for(int j = 1; j < scores.length; j++) 
            {
                count = 0;
                sum += Integer.parseInt(scores[j]);
            }
            
            avg = sum / Integer.parseInt(scores[0]);
            
            for(int k = 1; k < scores.length; k++)
            {
                if(Integer.parseInt(scores[k])*1.0 > avg)
                    count++;
            }
            
            results[index++] = count * 1.0 / Integer.parseInt(scores[0]) * 100; 
        }
        
        for(int l = 0; l < caseNum; l++)
        {
            System.out.printf("%.3f", results[l]);
            System.out.println("%");
            
        }
        
    }
}
