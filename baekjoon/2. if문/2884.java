import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H, M;
		H = sc.nextInt();
		M = sc.nextInt();
		
		if(M>=45) M-=45;
		else {
			M = M-45+60;
			if(H == 0) H = 23;
			else H -= 1;
		}
		
		System.out.println(H+" "+M);
		
	}
}
