package Calculator8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String workContinue = "";

        while (!workContinue.equals("exit")) {

            // 값 입력받기1(첫번째 숫자 = first)
            System.out.println("연산할 첫번째 숫자를 입력해주세요");
            int first = scanner.nextInt();

            // 양의 정수인지 확인(피드백 추가) - first
            if( first <0 ) {
                System.out.println("0을 포함한 양의 정수를 입력해주세요");
                continue;
            }

            // 값 입력받기2(두번째 숫자 = second)
            System.out.println("연산할 두번째 숫자를 입력해주세요");
            int second = scanner.nextInt();

            // 양의 정수인지 확인(피드백 추가) - second
            if( second <0 ) {
                System.out.println("0을 포함한 양의 정수를 입력해주세요");
                continue;
            }

            // 값 입력받기3(연산자)
            System.out.println("연산할 부호를 입력해주세요(+,-,*,/)");
            char cal = scanner.next().charAt(0);

            switch (cal) {
                case '+':
                    System.out.println(first + second);
                    break;

                case '-':
                    System.out.println(first - second);
                    break;

                case '*':
                    System.out.println(first * second);
                    break;

                case '/':
                    if (second == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue; // 기존 return 0; 에서 재입력으로 바꿈(피드백 추가
                    }
                    System.out.println(first / second);
                    break;

                default:
                    System.out.println("지원하지 않는 연산자 입니다.");
                    continue;

            }

            System.out.println("연산을 종료하려면 exit를 작성하십시요 / 계속 진행하려면 아무키나 누르시오");
            workContinue = scanner.next();
        }

        System.out.println("연산을 종료합니다");
    }

}