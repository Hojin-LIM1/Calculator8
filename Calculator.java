package Calculator8;

import java.util.ArrayList;

public class Calculator {

    //컬렉션 생성 * 속성과 생성자 동시 생성
    // 캡슐화
    private final ArrayList<Integer> resultCollection = new ArrayList<>();

    // 기능
    //[1] method1 더하기
    public int sum(int num1, int num2) {
        int result = (num1 + num2);
        resultCollection.add(result);
        return result;
    }

    //[2] method2 빼기
    public int sub(int num1, int num2) {

        int result = (num1 - num2);
        resultCollection.add(result);
        return result;
    }

    //[3] method3 곱하기
    public int mul(int num1, int num2) {

        int result = (num1 * num2);
        resultCollection.add(result);
        return result;
    }

    //[4] method4 나누기
    public int div(int num1, int num2) {
        int result = (num1 / num2);
        if (num2 == 0){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
        }
            resultCollection.add(result);
            return result;
        }

    // [5]method5 연산결과 삭제
    public void removeResult() {
        resultCollection.remove(0);
    }

    //getter [array 캡슐화에 따른 array get으로 불러오기] /
    public ArrayList<Integer> getResultCollection(){return resultCollection; }


    //setter [변수 수정] / private 캡슐화로 해당클래스에 작성 -> 외부에서 변수를 수정할 경우가 없어서 setter는 삭제
    //public void setResultCollection(ArrayList<Integer> resultCollection) {
        //this.resultCollection = resultCollection;
}



