import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        List<Integer> three = new ArrayList<Integer>();
        String threeStr = "";
        
        while(true)
        {
            three.add(n % 3);
            if(n < 3) break;
            n /= 3;
            
        }
       
        for(int i = 0; i < three.size(); i++)
            threeStr += three.get(i); 
        
        threeStr = threeStr.replaceAll("^0+", "");
        
        answer = Integer.valueOf(threeStr, 3);
        
        
        return answer;
    }
    
    public static void main(String[] args)
    {
        System.out.println(new Solution().solution(45));
    }
}