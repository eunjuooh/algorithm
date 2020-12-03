import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int[] nums = new int[10];
        
        for(int i = 0; i < nums.length; i++)
            nums[i] = sc.nextInt() % 42;

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        
        for(int j = 1; j < nums.length; j++)
        {
            if(nums[j] != list.get(list.size()-1))
                list.add(nums[j]);
        }
        
        System.out.println(list.size());
    }
}
