package Java.SimpleCalculatorOOP;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean stillContinue = true;

        add addition = new add();
        minus sub = new minus();
        multiply times = new multiply();
        divide div = new divide();
        modulus mods = new modulus();

        while (stillContinue) {
            System.out.println("\n====Basic Calculator====\n");
            System.out.println("ADDITION:       + \nSUBTRACTION:    - \nMULTIPLICATION: * \nDIVISION:       / \nMODULOS:        %");

            System.out.print("Choose a sign(+, -, *, /, %): ");
            char sign = sc.next().charAt(0);

            input userInput = new input(0, 0);

            System.out.print("Enter a first number: ");
            double num1 = sc.nextDouble();
            userInput.setNum1(num1);

            System.out.print("Enter a second number: ");
            double num2= sc.nextDouble();
            userInput.setNum2(num2);
            sc.nextLine();

            switch (sign) {
                case '+':
                    addition.add(userInput);
                    break;
                case '-':
                    sub.minus(userInput);
                    break;
                case '*':
                    times.multiply(userInput);
                    break;
                case '/':
                    div.divide(userInput);
                    break;
                case '%':
                    mods.modulus(userInput);
                    break;
            
                default:
                    System.out.println("Invalid. Please try again.");
                    break;
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            String decision = sc.nextLine();

                if (decision.equalsIgnoreCase("n")) {
                    stillContinue = false;
                    System.out.println("Thank you for using us!");
                    break;
                }
        }
        sc.close();
    }
    
}
