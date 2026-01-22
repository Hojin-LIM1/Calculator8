package Calculator8;


public enum Operatortype {

    //전부다 제네릭 타입으로 변환

    SUM('+') {
        @Override
        public <T extends Number> double calculate(T num1, T num2) {return num1.doubleValue() + num2.doubleValue();}
    }, // SUM 열거

    SUB('-') {
        @Override
        public <T extends Number> double calculate (T num1, T num2){return num1.doubleValue() - num2.doubleValue();}
    }, // SUB 열거

    MUL('*') {
        @Override
        public <T extends Number> double calculate (T num1, T num2){return num1.doubleValue() * num2.doubleValue();}
    }, // MUL 열거


    DIV('/') {
        @Override
        public <T extends Number> double calculate (T num1, T num2){
            if (num2.doubleValue() == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            }
            return num1.doubleValue() / num2.doubleValue();
        }
    };  // DIV 열거

    private final char cal;
    // Operatetype 내에서만 쓸 수 있게 cal 상수화

    Operatortype(char cal) {this.cal = cal;}
    // Enum 생성자 SUM, SUB, MUL, DIV 강제

    public abstract <T extends Number> double calculate(T num1, T num2);

    // 열거된 기능을 사용하기 위한 추상 메서드 구현 <- 연산을 여기서 하기에 제네릭 추상메서드 구현(반환타입 추가)


}