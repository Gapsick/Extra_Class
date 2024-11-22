import java.util.*;

public class lec1028 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 나이입력
        int age = sc.nextInt();

        // grade
        String grade ="";
        
        if (age < 0) {
            System.out.println("잘못된 입력 값 입니다.");
            return;
        }


        // 이용권 판별 후 출력
        if (age <= 12) {
            grade= "어린이";
        }
        else if (age >= 13 && age <= 18) {
            grade = "청소년";
        }
        else {
            grade = "어른";
        }

        System.out.println(grade + " 이용권을 사용할 수 있습니다.");






    }
}
