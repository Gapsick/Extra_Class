
import java.util.Scanner;

public class lec1030 {
    public static void main(String[] args) {

        // 키보드로부터 정수 n을 입력받아
        // n개의 int형 원소를 가지는 1차원 배열을 만드세요

        // n은 1 ~ 10, 아니면 제입력


        Scanner sc = new Scanner(System.in);

        // 변수선언
        int input = 0;

        System.out.print("n 입력: ");

        // 1 ~ 10 받을때 까지 무한 반복
        while (true) { 
            
            input = sc.nextInt();
            
            if (1 <= input && input <=10 ) {
               
                break;
            }
        
            System.out.print("다시 입력: ");

        }

        int bar[] = new int[input];


    }
    
}
