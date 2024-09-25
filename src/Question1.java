//사용자로부터 정수를 입력받고, 그 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        } else{
            System.out.println("입력하신 숫자는 홀수입니다.");
        }
    }
}
