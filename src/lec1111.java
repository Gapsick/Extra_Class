import java.util.Scanner;

public class lec1111 {
    public static void main(String[] args) {

        // 사용자로부터 가위, 바위, 보를 입력 받음
        // 컴퓨터는 가위, 바위, 보를 랜덤하게 선택
        // 사용자와 컴퓨터의 결과 값을 공개
        // 승리하면 + 1
        // Exit 를 입력하기 전까지 계속해서 게임 실행

        
        int userPoint = 0;
        int computerPoint = 0;
        int win = 0, lose = 0, draw = 0;
        Scanner sc = new Scanner (System.in);
        String result;
        


        while (true) { 

            System.out.print("가위, 바위, 보 입력해주세요 (종료하려면 'Exit' 입력): ");
            String bar = sc.nextLine();
            
            int userChoice = switch (bar) {
                case "가위" -> 0;
                case "바위" -> 1;
                case "보" -> 2;
                case "Exit" -> 3;
                default -> -1;
            };

            // 가위, 바위, 보 이외의 값일 경우 다시 입력
            if (userChoice == -1) {
                System.out.println("잘못된 입력입니다. 다시 ㄱ");
                continue;
            }

            // Exit이면 종료
            if (userChoice == 3) {
                System.out.println("종료할게~");
                break;
            }

            // 컴퓨터 입력
            int comChoice = (int)(Math.random() * 3);


            // 쇼부닷
            // 무승부
            if (userChoice == comChoice) {
                draw++;
                result = "Draw";
            }

            // 승리
            else if (userChoice == 0 && comChoice == 2 || userChoice == 1 && comChoice == 0 || userChoice == 2 && comChoice == 1) {
                win++;
                result = "Win";
            }

            // 패배
            else {
                lose++;
                result = "Lose";
            }


            // 결과 공개 ~
            String[] list = {"가위", "바위", "보"};
            System.out.println("결과: " + result);
            System.out.println("나: "+ bar + "컴퓨터: " + list[comChoice] 
            );
            







        }
            





    }
    
}
