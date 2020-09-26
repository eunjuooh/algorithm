import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public int[] solution(int n) 
    {
        /*
         *      1. 채우기
         *      - int[n][n]
         *      - 이중 for문 (i, j): i++ j  >>  i j++  >>  i-- j--
         *      - 하나씩 줄어드는 숫자만큼 채우기
         *      - 한개 채우고는 끝 
         *      
         *      2. 출력     
         *      - 이중 for문 (i, j): j 1씩 증가하면서 출력
         */
        
        int[][] box = new int[n][n];
        int num = 0;
        int m = n;
        int i = -1;
        int j = 0;
        
        while(true)
        {
            for(int a = 0; a < n; a++)
                box[++i][j] = ++num;
            
            if(--n == 0) break;
            
            for(int a = 0; a < n; a++)
                box[i][++j] = ++num;
            
            if(--n == 0) break;
            
            for(int a = 0; a < n; a++)
                box[--i][--j] = ++num;
            
            if(--n == 0) break;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < m; j++)
            {
                if(box[i][j] != 0)
                    list.add(box[i][j]);
            }
        }
        
        int[] answer = new int[list.size()];
        int index = 0;
        
        for(int k : list)
            answer[index++] = k;
            
        return answer;
    }
    
    
    public static void main(String[] args)
    {
        int[] result = new Solution().solution(6);
        
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}