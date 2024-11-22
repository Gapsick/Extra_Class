package ExtraClass;

public class test1 {

	public static void main(String[] args) {
		
		char[] selectedItems = {'+', '-', '-'};
		char selectedItem = 0;
		int bonusPoints = 0;
		
		// 포인트 점수 계산
		// 연속된 문자 카운트
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
		

		

		}

	}
}
