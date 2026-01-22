public enum Operatortype {
    SUM('+') {
        public double calculate(double num1 +double num2) {
            return num1 +num2;
        }
    }

    SUB('-') {
        public double calculate ( double num1 - double num2){
            return num1 - num2;
        }
    }

    MUL('*') {
        public double calculate ( double num1 *double num2){
            return num1 * num2;
        }
    }


    DIV('/') {
        public double calculate ( double num1 /double num2){
            if (num2 == 0){
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            }
            return num1 / num2;
    }

    private final char cal;

        Operatetype(char cal) {
            this.cal = cal
        }

        public abstract double calculate(double num1, double num2);


}