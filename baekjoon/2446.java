import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int maxNum = num * 2 - 1;
        int star = maxNum;
        int space = 0;
        
        for(int i = 1; i <= maxNum; i++)
        {
            if(space > 0)
            {
                for(int k = 1; k <= space; k++)
                {
                    System.out.print(" ");
                }
            }
            
            for(int j = 1; j <= star; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
            if(i < num)
            {
                star -= 2;
                space += 1;
            }
            else
            {
                star += 2;
                space -= 1;
            }
        }
    }
    
}