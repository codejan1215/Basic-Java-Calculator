package Java.SimpleCalculatorOOP;

public class modulus {
    
    public void modulus(input input){
        if (input.getNum2() != 0) {
            System.out.printf("%nResult: %.2f %% %.2f = %.2f%n", input.getNum1(), input.getNum2(), input.getNum1() % input.getNum2());
        } else System.out.println("\nError: Cannot divide by zero.");
    }
}
