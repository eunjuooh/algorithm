import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseNum = sc.nextInt();
		int a, b;
		
		for(int i=1; i<=caseNum; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a>0 && b <10) {
				System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
				
			}
		}
	}

}
