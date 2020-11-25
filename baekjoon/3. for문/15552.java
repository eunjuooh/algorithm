import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine().trim());
		
		for(int i =0; i<a; i++) {
			String str = br.readLine();
			String[] word = str.split(" ");
			int b = Integer.parseInt(word[0]);
			int c = Integer.parseInt(word[1]);
			bw.write((b+c) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
