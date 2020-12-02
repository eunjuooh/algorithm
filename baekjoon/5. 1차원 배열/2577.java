import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;
        
        while(true)
        {
            if(result == 0)
                break;

            else
            {
                int num = result % 10;
                
                switch(num)
                {
                case 0 : nums[0]++; break;
                case 1 : nums[1]++; break;
                case 2 : nums[2]++; break;
                case 3 : nums[3]++; break;
                case 4 : nums[4]++; break;
                case 5 : nums[5]++; break;
                case 6 : nums[6]++; break;
                case 7 : nums[7]++; break;
                case 8 : nums[8]++; break;
                case 9 : nums[9]++; break;
                }
                
                result /= 10;
            }
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
