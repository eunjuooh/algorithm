import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int j=0; j<a.length; j++) {
			if(a[j]<x) System.out.print(a[j]+" ");

		
		}
		

	}

}
