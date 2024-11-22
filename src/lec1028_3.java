
import java.util.Scanner;

public class lec1028_3 {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.print("나이 입력하세요: ");
            int age = sc.nextInt(); // 나이

            System.out.print("예약하려는 이벤트코드를 입력하세요: ");
            String evnetCode = sc.next();
            
            System.out.print("원하시는 예약 날짜를 입력하세요: ");
            int reservationDate = sc.nextInt();

            
            switch (evnetCode) {
                case "E1":
                    if (age < 18) {
                        System.out.println("나이 제한");
                        return;
                    }
                case "E2":
                    if (reservationDate % 2 != 0) {
                        System.out.println("선택하신 날짜에는 예악 X");
                        return;
                    }
                case "E3":
                    if (age < 16){
                        System.out.println("나이 제한");
                        return;
                    }
                    else if (reservationDate % 7 != 0){
                        System.out.println("날짜 제한");
                        return;
                    }
                }
            
            System.out.println("예약 성공");


    }


}

