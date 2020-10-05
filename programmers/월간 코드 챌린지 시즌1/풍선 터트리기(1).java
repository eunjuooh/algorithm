class Solution 
{
    public int solution(int[] a) 
	{
        int answer = 0;
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int[][] map = new int[a.length][2];

        for(int i = 0; i < a.length; i++) 
		{
            if(left > a[i])
                left = a[i];
            map[i][0] = left;
        }

        for(int i = a.length-1; i >= 0; i--) 
		{
            if(right>a[i])
                right = a[i];
            map[i][1] = right;
        }

        for(int i=0; i<a.length; i++) 
		{
            if(a[i] <= map[i][0] || a[i] <= map[i][1])
                answer++;
        }

        return answer;
    }
}