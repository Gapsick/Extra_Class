import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 사용자로부터 3 ~ 7 사이의 정수를 입력받아 슬롯 개수를 설정
        // 입력값이 유효하지 않으면 오류 메시지를 출력
        // 세가지 연산자를 포함하는 char type 1차원 배열을 생성
        // 연속된 동일 연산자의 개수를 그룹으로 탐지하여 점수 계산



        int plusPoint = 0;
        int minusPoint = 0;
        int starPoint = 0;
        int score = 0;

        // 슬롯 갯수 메세지 출력
        System.out.print("슬롯개수를 입력해주세요: ");

        // 입력값이 유효할 때 까지 입력 받기
        int inputUser = 0;

        while(true) {
            int num = sc.nextInt();
            if(3<= num && num <= 7) {
                inputUser = num;
                break;
            }
            System.out.print("재입력: ");
        }

        // 연산자 배열 생성
        char[] pms = {'+', '-', '*'};
        // 유저 배열 생성
        char[] userSlot = new char[inputUser];

        // 게임 시작
        while(true) {

            // 유저에게 값 입력 받기
            System.out.print("게임을 시작하려면 아무 값이나 입력하세요");
            String checkStart = sc.nextLine();

            // 랜덤 연산자 생성
            for(int i = 1; i < userSlot.length; i++) {
                int randomNum = (int) (Math.random() * 3);
                userSlot[i] = pms[randomNum];
            }

            int plusCombo = 0;
            int minusCombo = 0;
            int starCombo = 0;

            for (int i = 0; i < userSlot.length - 1; i++) {
                // 변수 선언 및 초기화
                int count = 0;
                char checkSlot = ' ';

                // 앞뒤가 같을때
                if (userSlot[i] == userSlot[i + 1]) {
                    // 슬롯의 길이 만큼 for문을 돌려 연속된 문자가 몇개인지 확인을 한다
                    for (int j = i; j < userSlot.length - 1; j++) {
                        // 동시에 맞을경우 count + 1을 한다
                        if (userSlot[j] == userSlot[i + 1]) {
                            count += 1;
                        } else {
                            break;
                        }
                    }
                    // 연속된 문자가 안나왔을 경우 끝나느 해당하는 문자를 확인후, count값 확인

                    checkSlot = userSlot[i];
                    // + 경우
                    if (checkSlot == '+') {
                        // 플러스 콤보 변수 생성
                        plusCombo = count;
                        // 반복되는 문자가 3개이상일 경우 2점 추가
                        if (count > 2) {
                            plusPoint += 2;
                        }
                        // 반복되는 문자가 2개일 경우
                        plusPoint++;
                    }
                    // - 경우
                    else if (checkSlot == '-') {
                        // 마이너스 콤보 변수 생성
                        minusCombo = count;
                        // -가 3개 이상
                        if (count > 2) {
                            minusPoint += 2;
                        }
                        // -가 2개
                        minusPoint++;
                    }
                    // * 경우
                    else {
                        // 곱하기 콤보 변수 생성
                        starCombo = count;
                        // * 3개 이상
                        if (count > 2) {
                            starPoint += 2;
                        }
                        // * 2개
                        starPoint++;
                    }

                    // 그리고 i에 값을 추가 한후 continue로 다시 시작하게 만든다
                    i += count - 1;
                    continue;


                }
            }
            // 총 포인트 점수 배열을 만든다

            // 각 포인트가 1점이라도 있을 경우
            if (plusPoint >= 1) {
                if(plusPoint >= 2) {
                    score += 3;
                    System.out.println("+ " + plusCombo + " Combo - 보너스 점수 3점 획득");
                }
                else {
                    score += 1;
                    System.out.println("+ 2 Combo - 보너스 점수 1점 획득");
                }
            }
            if (minusPoint >= 1) {
                if(minusPoint >= 2) {
                    score -= 3;
                    System.out.println("- " + minusCombo + " Combo - 보너스 점수 -3점 감소");
                }
                else {
                    score -= 1;
                    System.out.println("- 2 Combo - 보너스 점수 -1점 감소");
                };
            }
            if (starPoint >= 1) {
                if(starPoint >= 2) {
                    score += 5;
                    System.out.println("* " + starCombo + " Combo - 보너스 점수 5점 증가");
                }
                else{
                    score += 2;
                    System.out.println("* 2 Combo - 보너스 점수 2점 증가");
                }
            }




            System.out.println();
            System.out.println(userSlot);
            System.out.println();
            System.out.println("현재 점수" + score);
            System.out.println();

            if (score >= 5) {
                System.out.println("Win");
            } else if (score <= -5) {
                System.out.println("Lose");
            }

            }



        }




    }

