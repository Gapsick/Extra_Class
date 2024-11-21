import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] pms = {'+', '-', '*'};
        int bonusPoint = 0;

        // 입력값이 유효할 때 까지 입력 받기
        int inputUser = 0;

        System.out.print("슬롯개수를 입력해주세요: ");
        while (true) {
            int num = sc.nextInt();
            if (3 <= num && num <= 7) {
                inputUser = num;
                break;
            }
            System.out.print("재입력: ");
        }

        char[] userSlot = new char[inputUser];

        while (true) {

            // 유저에게 값 입력 받기
            System.out.print("게임을 시작하려면 아무 값이나 입력하세요");
            String checkStart = sc.nextLine();

            // 랜덤 연산자 생성
            for (int i = 0; i < userSlot.length; i++) {
                int randomNum = (int) (Math.random() * 3);
                userSlot[i] = pms[randomNum];
            }

            System.out.println(userSlot);

            // count 변수 선언
            int count = 1;
            for (int i = 0; i < userSlot.length; i++) {

                // 앞뒤가 같을때
                if (i < userSlot.length - 1 && userSlot[i] == userSlot[i + 1]) {
                    // 동시에 맞을경우 count + 1을 한다
                    count++;
                } else {
                    if (count == 2) {
                        switch (userSlot[i]) {
                            case '+':
                                bonusPoint += 1;
                                System.out.println("+ 2 Combo - 보너스 점수 1점 획득");
                                break;
                            case '-':
                                bonusPoint -= 1;
                                System.out.println("- 2 Combo - 보너스 점수 -1점 감소");
                                break;
                            case '*':
                                bonusPoint += 2;
                                System.out.println("* 2 Combo - 보너스 점수 2점 획득");
                                break;
                        }
                    } else if (count >= 3) {
                        switch (userSlot[i]) {
                            case '+':
                                bonusPoint += 3;
                                System.out.println("+ " + count + " Combo - 보너스 점수 3점 획득");
                                break;
                            case '-':
                                bonusPoint -= 3;
                                System.out.println("- " + count + " Combo - 보너스 점수 -3점 감소");
                                break;
                            case '*':
                                bonusPoint += 5;
                                System.out.println("* " + count + " Combo - 보너스 점수 5점 획득");
                                break;
                        }
                    }
                    // 카운트 초기화
                    count = 1;
                }
            }
            // 게임 종료
            if (bonusPoint >= 5) {
                System.out.println("Win");
                break;
            } else if (bonusPoint <= -5) {
                System.out.println("Lose");
                break;
            }

            System.out.println("현재점수: " + bonusPoint);
        }
    }
}




