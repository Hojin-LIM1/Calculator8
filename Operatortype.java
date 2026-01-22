package Calculator8;


public enum Operatortype {

    SUM('+') {
        @Override
        public int calculate(int num1, int num2) {return num1 +num2;}
    }, // SUM 열거

    SUB('-') {
        @Override
        public int calculate ( int num1, int num2){return num1 - num2;}
    }, // SUB 열거

    MUL('*') {
        @Override
        public int calculate ( int num1, int num2){return num1 * num2;}
    }, // MUL 열거


    DIV('/') {
        @Override
        public int calculate ( int num1, int num2){
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            }
            return num1 / num2;
        }
    };  // DIV 열거

    private final char cal;
    // Operatetype 내에서만 쓸 수 있게 cal 상수화

    Operatortype(char cal) {this.cal = cal;}
    // Enum 생성자 SUM, SUB, MUL, DIV 강제

    public abstract int calculate(int num1, int num2);

    // 열거된 기능을 사용하기 위한 추상 메서드 구현


}