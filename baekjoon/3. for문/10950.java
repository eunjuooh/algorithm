import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		int count;
		
		count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
