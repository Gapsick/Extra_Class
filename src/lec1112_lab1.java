package ExtraClass;

import java.util.*;
public class lec1112_lab1 {
	public static void main(String[] args) {
		
		// 가위, 바위, 보 게임
		// 사용자에게 입력받기
		// Exit 입력받으면 종료
		// 컴퓨터는 랜덤하게 선택
		// -7 or 7점 될때까지 무한 반복
		// 연승시 + 3
		
		Scanner sc = new Scanner(System.in);
	
		int win = 0, draw = 0, lose = 0;
		String[] rcs = {"Rock", "Paper", "Scissors"};
		String checkResult = "none";
		
		int combo = 0;
		
		while (true) {
			
			System.out.print("Rock, Paper, Scissors (나갈려면 Exit): ");
			String bar = sc.nextLine();
			
			
			// 유저 입력 결과 int형으로 변환
			int userChoice = switch (bar) {
				case "Rock" -> 0;
				case "Paper" -> 1;
				case "Scissors" -> 2;
				case "Exit" -> 3;
				default -> 4;
			};
			
			// Exit -> 나가기
			if (userChoice == 3) {
				System.out.println("게임종료 (Exit)");
				break;
			}
			
			// 잘못된 값 입력되면 다시 입력받기
			if (userChoice == 4) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			// 컴퓨터 선택
			int comChoice = (int) (Math.random() * 3);
			
			// 게임시작
			// 무
			if (userChoice == comChoice) {
				draw += 1;
				checkResult = "Draw";
				
				combo = 0;
			}
			
			// 승
			else if (userChoice == 0 && comChoice == 2 || 
					userChoice == 1 && comChoice == 0 || 
					userChoice == 2 && comChoice == 1) {
				
				win++;
				
				if(combo >= 2) {
					win += 3;
				}
				
				if (checkResult == "USER") {
					win += 3;
				}
				else {
					win += 1;
				}
				checkResult = "USER";
			}
			
			// 패
			else {
				if (checkResult == "Com") {
					lose += 3;
				}
				else {
					lose += 1;
				}
			
				checkResult = "Com";
				
				combo = 0;
			}
			
			// 결과 변환
			String userResult = rcs[userChoice];
			String comResult = rcs[comChoice];
			
			// 결과 출력
			System.out.println("결과");
			System.out.println("유저: " + userResult + "컴퓨터: " + comResult );
			System.out.println("승: " + win + " 무: " + draw + " 패: " + lose);
			
			
			// 종료 조건
			if (win >= 7) {
				System.out.println("승!");
				break;
			}
			else if (lose >= 7) {
				System.out.println("패..");
				break;
			}
			
		}
		
	}

}
