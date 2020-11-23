import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();

        int result = 0;

        for(int i = 0; i < num; i++) {
            result += str.charAt(i) - '0'; // char에서 int로 변환
        }

        System.out.println(result);
        

    }
}
