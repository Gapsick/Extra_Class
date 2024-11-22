package ExtraClass;

import java.util.*;

public class lec1113 {
	public static void printDiagonalMatrix(int argRow, int argCol, boolean isBidirectional) {
		
		for (int i = 1, checkn = argRow; i <= argRow; i++, checkn--) {
			for (int j = 1; j <= argCol; j++) {
				if (i == j || (checkn == j && isBidirectional)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	
	public static void case1(int argRow, int argCol) {
		for (int i = 1; i <= argRow; i++) {
			for (int j = 1; j <= argCol; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 1;

		while (true) {

			// 변수 선언
			int m = 0;
			int n = 0;
			int userMenu = 0;

			// 매뉴 출력
			System.out.println(count + "번째 실행");
			System.out.println("1. M X N Matrix를 출력");
			System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
			System.out.println("4. 종료");

			// 1 ~ 4가 아니면 다시 재입력
			while (true) {

				userMenu = sc.nextInt();

				// 1 ~ 4 확인
				if (1 <= userMenu && userMenu <= 4) {
					break;
				}

				// 다른값일 경우 메뉴는 출력하지 않고, 입력만 재실행
				System.out.print("재입력: ");
			}

			// userMenu가 4면 종료
			if (userMenu == 4) {
				System.out.println("종료");
				break;
			}

			// M, N값 입력받기
			while (true) {
				System.out.print("M값 입력해주세요: ");
				m = sc.nextInt();
				System.out.print("N값 입력해주세요: ");
				n = sc.nextInt();

				if (m > 0 && n > 0) {
					break;
				}

				System.out.println("잘못된 입력(M,N)");
			}

			switch (userMenu) {
			case 1:
				System.out.println("M X N Matrix 출력");
				case1(m, n);
				break;

			case 2:
				System.out.println("좌상단 -> 우하단 대각선 삭제 후 M X N Matrix 출력");
				printDiagonalMatrix(m, n, false);
				break;
			case 3:
				System.out.println("좌상단 -> 우하단 + 우하단 -> 좌하단 대각선 삭제후 M X N Matrix 출력");
				printDiagonalMatrix(m, n, true);
				break;

			}

			count++;
			System.out.println(" ");
		}

	}

}
