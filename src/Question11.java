//세 개의 숫자를 입력받고, 그 중에서 가장 큰 숫자를 출력하는 프로그램을 작성하세요.
import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = nextInt();

        if (a > b){
            max = a;
            if (a > c){
                max = a;
            }
            else{
                max = c;
            }
        }
        else if (a < b){
            max = b;
            if(b > c){
                max = b;
            }
            else{
                max = c;
            }
        }
        System.out.print("세개의 숫자 중 가장 큰 숫자는: " + max);

    }
}
