import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution
{
    public int[] solution(int[] numbers) {
        /*
         *      1. 모두 더하기
         *      2. 중복 없애기
         *      3. 오름차순
         */
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < numbers.length - 1; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        int index = 0;
        
        for(int i : list)
            answer[index++] = i;
        
        return answer;
    }
    
    public static void main(String[] args)
    {
        int[] numbers = {2,1,3,4,1};
        int[] result = new Solution().solution(numbers);
        
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
