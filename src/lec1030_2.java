import java.util.Scanner;

public class lec1030_2 {
    public static void main(String[] args) {
        
        // 생성된 N 개의 원소에 정수 값을 입력하는 구문을 작성하시오.
        
        // 변수 정의
        int input = 0;
        
        // N 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("N값을 입력하세요: ");
        int n = sc.nextInt();

        // N개의 원소 가지고 있는 배열 만들기
        int bar[] = new int[n];

        // 반복문 이용해 집어 넣기

        for (int i = 0; i < n; i++) {

            System.out.print((i+1) + "번째 원소: ");
            bar[i] = sc.nextInt();

        } 


        // 입력된 원소 값을 출력하는 구문을 작성하시오
        // 배열 출력하기

        int highValue = bar[0];
        int lowValue = bar[0];
        int plus = 0;

        for (int i = 0; i < bar.length; i++) {
            
            if (bar[i] > highValue) {
                highValue = bar[i];
            }
            else if (bar[i] < lowValue) {
                lowValue = bar[i];
            }

            plus += bar[i];

        }
        
        int average = plus / n;
        
        System.out.println(highValue + "," + lowValue + "," + average);



    }
    
}
