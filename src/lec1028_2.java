import java.util.Scanner;

public class lec1028_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 문제볼때 유의할점
        // Datatype - 변수가 실수인지 정수인지
        // 변수의 유효범위가 어느정도 인지

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();

        //
        String triangle = "";

        // 삼각형 형성 조건 검사
        if (input1 + input2 <= input3 || input1 + input3 <= input2 || input2 + input3 <= input1) {
            System.out.println("삼각형을 형성할 수 없습니다");
            return;
        }

        // 정삼각형
        if (input1 == input2 && input2 == input3) {
            triangle = "정삼각형";
        }

        // 이등
        else if (input1 == input2 || input2 == input3 || input1 == input3){
            triangle = "이등변삼각형";
        }

        // 부등
        else {
            triangle = "부등변삼각형";
        }

        System.out.println(triangle + "입니다");

    }
    
}
