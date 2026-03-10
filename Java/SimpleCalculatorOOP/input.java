package Java.SimpleCalculatorOOP;

public class input {
    private double num1;
    private double num2;

    input(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    double getNum1() {
        return num1;
    }

    double getNum2() {
        return num2;
    }

    void setNum1(double num1) {
        this.num1 = num1;
    }

    void setNum2(double num2) {
        this.num2 = num2;   
    }
    
}
