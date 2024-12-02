import java.util.Scanner;
public class chp5Lab2 {

    static void showStuMatrix (int numStd, float[][] stuMatrix) {
        for (int i = 0; i < numStd; i++) {
            System.out.print("[학번: " + (int) stuMatrix[i][0] + "]" + "\t");
            System.out.print("국어: " + stuMatrix[i][1] + ",\t");
            System.out.print("영어: " + stuMatrix[i][2] + ",\t");
            System.out.print("수학: " + stuMatrix[i][3] + ",\t");
            System.out.print("합계: " + stuMatrix[i][4] + ",\t");
            System.out.println("평균: " + stuMatrix[i][5]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Lab1 이랑 동일한 조건
        // 입력 데이터 초과 시 배열 확장
        // 학번이 이미 존재하는 경우 메시지 출력

        // 변수 선언
        Scanner sc = new Scanner(System.in);
        int NUM_FIELD = 3;
        int NUM_COL = 6;
        int numStd = 0;
        boolean choice4 = true;

        // 2차원 리스트 생성
        float stuMatrix[][] = new float[NUM_FIELD][NUM_COL];

        while (choice4) {
            // 메뉴 출력
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            // 1 ~ 4 입력 받기
            int choice = sc.nextInt();

            // 1 ~ 4 입력에 따라 해당 case 실행
            switch (choice) {
                // 1번 - 학생 성적 입력
                case 1:
                    System.out.print("학번을 입력하세요: ");
                    float stuNum = sc.nextFloat();

                    // 중복 학번 검사
                    boolean qCheck = false;
                    boolean yCheck = false;
                    for (int i = 0; i < numStd + 1; i++) {
                        // 중복일 경우
                        if (stuMatrix[i][0] == stuNum) {
                            // 유저에게 입력값 받기
                            System.out.println("중복된 학번입니다.");
                            System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");
                            char userChoice = sc.next().charAt(0);

                            // 입력값이 Y일 경우
                            if (userChoice == 'Y') {
                                yCheck = true;
                                numStd = i;
                                break;
                            }
                            // 입력값이 q일 경우
                            else {
                                qCheck = true;
                                break;
                            }
                        }
                    }

                    // q를 눌렀을 경우
                    if (qCheck) {
                        System.out.println("입력이 취소되었습니다. 메뉴로 돌아갑니다.");
                        System.out.println();
                        break;
                    }

                    // 학생 값 배열에 입력
                    stuMatrix[numStd][0] = stuNum;
                    System.out.print("국어 성적: ");
                    stuMatrix[numStd][1] = sc.nextFloat();
                    System.out.print("영어 성적: ");
                    stuMatrix[numStd][2] = sc.nextFloat();
                    System.out.print("수학 성적: ");
                    stuMatrix[numStd][3] = sc.nextFloat();
                    stuMatrix[numStd][4] = stuMatrix[numStd][1] + stuMatrix[numStd][2] + stuMatrix[numStd][3];
                    stuMatrix[numStd][5] = stuMatrix[numStd][4] / 3;

                    // Y를 눌렀을 경우
                    if (yCheck) {
                        System.out.println("덮어쓰기가 완료되었습니다.");
                        System.out.println();
                    }
                    else {
                        System.out.println("입력이 완료되었습니다.");
                        System.out.println();
                    }

                    // 학생수 + 1
                    numStd++;
                    break;

                // 2번 - 입력된 학생 목록 출력
                case 2:
                    showStuMatrix(numStd, stuMatrix);
                    break;

                // 3번 - 학생 삭제하기
                case 3:
                    showStuMatrix(numStd, stuMatrix);
                    System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
                    // 삭제할 학생의 학번 입력 받기
                    int delNum = sc.nextInt();
                    // -1을 눌렀을 경우
                    if (delNum == -1) {
                        break;
                    }

                    // 삭제할 학번이 인덱스 몇번에 있는지 확인
                    int checkIndex = -1;
                    for (int i = 0; i < numStd; i++) {
                        if (stuMatrix[i][0] == delNum) {
                            checkIndex = i;
                        }
                    }

                    // 학번이 없는 경우
                    if (checkIndex == -1) {
                        System.out.println("해당 학번이 존재하지 않습니다. 다시 입력해주세요.");
                    }

                    // 삭제할 학번을 빼고 push
                    for (int i = checkIndex; i < numStd - 1; i++) {
                        stuMatrix[i] = stuMatrix[i+1];
                    }

                    // 학생수 -1
                    numStd--;


                // 4번 - 종료
                case 4:
                    System.out.print("프로그램을 종료합니다.");
                    choice4 = false;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                    System.out.println();
            }

        }


    }
}
