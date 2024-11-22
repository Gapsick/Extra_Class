package ExtraClass;
import java.util.*;
public class lec1112_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자로부터 M, N을 입력 받아, M X N Matrix를 출력하세요
		// 좌측상단에서 우측하단까지 대각선으로 빈공간 만들기
		
		System.out.print("M값을 입력해주세요: ");
		int m = sc.nextInt();
		System.out.print("N값을 입력해주세요: ");
		int n = sc.nextInt();
		
		int empty = m;
		
		
		for (int i = 1 ; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print(" ");
					continue;
				}
				else if (j == empty) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println(" ");
			empty -= 1;
		}
		
		
		
	}

}
