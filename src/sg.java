package ExtraClass;

import java.util.*;
public class sg {
		    public static void printGameResult(int gmaeCount, int gameScore, char rrEsult) {
		        if (gmaeCount == 1) {
		            switch (rrEsult) {
		                case '+':
		                    gameScore +=1;
		                    System.out.println("+ 2 Combo : 보너스 점수 1점  증가");
		                    break;
		                case '-':
		                    gameScore -=1;
		                    System.out.println("- 2 Conbo : 보너스 점수 1점 감점");
		                    break;
		                case '*':
		                    gameScore +=2;
		                    System.out.println("* 2 Combo : 보너스 점수 2점 증가");
		                    break;
		                default:
		                    System.out.println("is nothing anywhere");
		                    break;
		            }
		        } else if (gmaeCount == 2) {
		            switch (rrEsult) {
		                case '+':
		                    gameScore +=3;
		                    System.out.println("+ 3 Combo : 보너스 점수 3점 증가");
		                    break;
		                case '-':
		                    gameScore -=3;
		                    System.out.println("- 3 Conbo : 보너스 점수 3점 감점");
		                    break;
		                case '*':
		                    gameScore +=5;
		                    System.out.println("* 3 Combo : 보너스 점수 5점 증가");
		                    break;
		                default:
		                    System.out.println("is nothing anywhere");
		                    break;
		            }
		    }
		}
	
		    public static void main(String[] args) {

		        final int MATH = 3;
		        Scanner sc = new Scanner(System.in);
		    
		        
		        // 연산자 배열 "+, -, *" char 타입 생성
		        char [] operatorArray = {'+', '-', '*'};
		        int count = 1;
		        
		        int gameScore = 0;
		        char rrEsult = 0;

		        while(true){
		            // 아무 입력구문 출력
		            System.out.println(count + "번째 게임");
		            System.out.println("게임을 시작하려면 아무 값이나 입력하세요: ");
		            sc.next();
		            System.out.println("------------------------------------------");
		            // 컴퓨터 난수로 랜덤된 연산자 생성
		            char [] randOperator = new char[MATH];

		            for (int i = 0; i < randOperator.length; i++) {
		                int randValue = (int)(Math.random() * 3);
		                randOperator[i] = operatorArray[randValue];
		            }
		            // 랜덤으로 생성된 연산자 출력
		            for (char value : randOperator) {
		                System.out.print(value + "\t");
		            }
		            System.out.println("\n------------------------------------------");
		        
		            // 콤보 점수 계산
		            int gmaeCount = 0;
		            for (int i = 0; i < randOperator.length - 1; i++) {
		                if (randOperator[i] == randOperator[i + 1]){
		                    gmaeCount++;
		                    rrEsult = randOperator[i];
		                }
		            }

		            // 연속된 문자 2개  
		            // 연속된 문자 3개
		            printGameResult(gmaeCount, gameScore, rrEsult);
		            
		            // 게임종료 5 or -5
		            if (gameScore >= 5) {
		                System.out.println("게임승리!");
		                break;
		            } else if (gameScore <= -5) {
		                System.out.println("게임 패배!");
		                break;
		            }

		               //게임 카운트 증가
		            count++;
		        
		        }
		    }    
		}

	

