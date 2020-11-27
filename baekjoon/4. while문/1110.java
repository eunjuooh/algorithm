import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = num;
        int cnt = 0;
        int a, b, c;
        
        
        while(true)
        {
            cnt++;
            
            a = tmp < 10 ? 0 : tmp / 10;
            b = tmp % 10;
            c = a + b >= 10 ? (a + b) % 10 : a + b;
            tmp = b*10 + c;
            
            if(num == tmp)
                break;
            
            a = b;
            b = c;
        }
        
        System.out.println(cnt);
        
    }
}
