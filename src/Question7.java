//월(1~12)을 입력받고, 해당 월에 맞는 계절을 출력하는 프로그램을 작성하세요.
// 봄 : 3-5, 여름 : 6-8, 가을 : 9-11, 겨울 : 12-2
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("월(1~12)을 입력하세요: ");
        int month = sc.nextInt();

        if (month >= 3  && month <= 5) {
            System.out.println("봄입니다.");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("여름입니다.");
        }
        else if (month >= 9 && month <= 11) {
            System.out.println("가을입니다.");
        }
        else{
            System.out.println("겨울입니다.");
        }

    }
}
