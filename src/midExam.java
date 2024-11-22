package ExtraClass;

import java.util.*;
public class midExam {

	public static void main(String[] args) {
		
		// + - * 1차원 배열 만들기
		// 무작위로 선택
		// 3개의 연산자를 1차원 Array에 저장
		// 라운드 시작시 라운드 번호 표시후 아무 값이나 입력하면 라운드 시작
		// 연속된 연산자일 경우 경우의 수에 맞게 콤보부여
		// 5점이상, -5점이하일 경우 승리, 패배 출력
		// 매 라운드가 끝나면 현재 점수를 출력
		
		Scanner sc = new Scanner(System.in);
		final int NUM_OF_ITEMS = 3;
		int bonusPoints = 0;
		int gameRound = 1;
		char selectedItem = 0;
		
		// 3개의 아이템을 가지는 슬롯 머신 구현
		char[] items = {'*', '+', '-'};
		char[] selectedItems = new char[NUM_OF_ITEMS];
		
		while(true) {
			System.out.println(gameRound + " 번째 게임");
			// 사용자로부터 아무키나 입력
			System.out.print("아무키나 입력 하세요");
			sc.next();
			
			// 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
			for(int i = 0; i <selectedItems.length; i++) {
				// char[] items = {'*', '+', '-'}
				int selectedIndex = (int) (Math.random() * NUM_OF_ITEMS);
				selectedItems[i] = items[selectedIndex];
			}
			
			System.out.println("---------------------------------");
			for(char item: selectedItems) {
				System.out.print("\t" + item);
			}
			System.out.println(" ");
			System.out.println("---------------------------------");
			
			// 포인트 점수 계산
			// A. 연속된 문자 2개
			int conCharCount = 0;
			for(int i = 0; i < selectedItems.length - 1; i++) {
				if (selectedItems[i] == selectedItems[i+1]) {
					conCharCount++;
					// 연속된 문자 종류 저장
					selectedItem = selectedItems[i];
				}
			}
			// A. 연속된 문자 2개
			if (conCharCount == 1) {
				switch(selectedItem) {
				case'+':
					System.out.println("+ 2 Combo - 보너스 점수 1점 획득");
					bonusPoints += 1;
					break;
				case'-':
					System.out.println("- 2 Combo - 보너스 점수 1점 감점");
					bonusPoints -= 1;
					break;
				case'*':
					bonusPoints += 2;
					System.out.println("* 2 Combo - 보너스 점수 2점 획득");
					break;
				default:
					System.out.println("something went wrong");
					
				}
			// B. 연속된 문자가 3개
			} else if (conCharCount == 2) {
				
				switch(selectedItem) {
				case'+':
					System.out.println("+ 3 Combo - 보너스 점수 3점 획득");
					bonusPoints += 3;
					break;
				case'-':
					System.out.println("- 3 Combo - 보너스 점수 3점 감점");
					bonusPoints -= 3;
					break;
				case'*':
					System.out.println("* 3 Combo - 보너스 점수 5점 획득");
					bonusPoints += 5;
					break;
				default:
					System.out.println("something went wrong");
				}
			// B. 연속된 문자가 3개
			}
						
			// 게임 종료 여부 판단
			if (bonusPoints >= 5) {
				System.out.println("승리, 보너스 포인트: " + bonusPoints);
				break;
			} else if (bonusPoints <= -5) {
				System.out.println("패배, 보너스 포인트: " + bonusPoints);
				break;
			}
			
			// 게임 끝, Round 추가
			System.out.println("현재 점수: " + bonusPoints);
			System.out.println(" ");
			gameRound++;	
		}
	}

}

