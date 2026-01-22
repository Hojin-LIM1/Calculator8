package Calculator8;

import java.util.Scanner;
import java.util.ArrayList; // Calculator 미사용으로 ArrayList Import <- enum class에 작성하기 매우 어렵..

public class ArithmeticCalculator {
    private static final ArrayList<Integer> resultCollection = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        Calculator calculator = new Calculator(); <- enum 사용으로 삭제
        String workContinue = "";

        while (!workContinue.equals("exit")) {

            // 값 입력받기1(첫번째 숫자 = num1)(피드백 반영)
            System.out.println("연산할 첫번째 숫자를 입력해주세요");
            int num1 = scanner.nextInt();

            // 양의 정수인지 확인(피드백 추가)
            if( num1 <0 ) {
                System.out.println("0을 포함한 양의 정수를 입력해주세요");
                continue;
            }

            // 값 입력받기2(두번째 숫자 = num2)(피드백 반영)
            System.out.println("연산할 두번째 숫자를 입력해주세요");
            int num2 = scanner.nextInt();

            // 양의 정수인지 확인(피드백 추가)
            if( num2 <0 ) {
                System.out.println("0을 포함한 양의 정수를 입력해주세요");
                continue;
            }

            // 값 입력받기3(연산자)
            System.out.println("연산할 부호를 입력해주세요(+,-,*,/)");
            char cal = scanner.next().charAt(0);

            int result = 0; // enum 형식변경으로 변수 선언
            switch (cal) {
                case '+':
                    result = Operatortype.SUM.calculate(num1, num2); // enum 형식으로 변경
                    break;

                case '-':
                    result = Operatortype.SUB.calculate(num1, num2); // enum 형식으로 변경

                    break;
                case '*':
                    result = Operatortype.MUL.calculate(num1, num2); // enum 형식으로 변경
                    break;

                case '/':
                    result = Operatortype.DIV.calculate(num1, num2); // enum 형식으로 변경
                    break;

                default:
                    System.out.println("지원하지 않는 연산자 입니다.");
                    continue;

            }
            System.out.println("연산결과 :" + result);

            resultCollection.add(result); // 연산 종료 후 결과 저장
            System.out.println("계산 기록 :" + resultCollection);

            System.out.println("가장 오래된 기록을 삭제하시겠습니까? Y(삭제) or N(Press Any key)");
            String remove  = scanner.next();

            if (remove.equals("Y")) {
                removeResult();
                System.out.println("수정후 기록 :" + resultCollection);

            }

            System.out.println("연산을 종료하려면 exit를 작성하십시요 / 계속 진행하려면 아무키나 누르시오");
            workContinue = scanner.next();
        }

        System.out.println("연산을 종료합니다");
    }

    // 삭제 메소드 재반영(연산결과가 없을 때 isEmpty 사용 <- 튜터님 피드백 추가)
    public static void removeResult() {
        if (!resultCollection.isEmpty()) {
            resultCollection.remove(0);
        }
    }

}