import java.util.Scanner;

public class Smart_Calculator {
    public static void main(String[] args) {
        System.out.println("-----Smart Calculator-----");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter Number1: ");
            int number1 = sc.nextInt();
            System.out.print("Enter Operator (+,-,*,/): ");
            String operator = sc.next();
            System.out.print("Enter Number2: ");
            int number2 = sc.nextInt();


            if (operator.equals("+")){
                System.out.println("Result: "+ (number1+number2));

            } else if (operator.equals("-")) {
                System.out.println("Result: " + (number1-number2));
            } else if (operator.equals("/")) {
                if( number2==0 ){
                    System.out.println("This is not allowed");
                }else{
                    System.out.println("Result"+(number1/number2));
                }

            } else if (operator.equals("*")) {
                System.out.println("Result: "+ (number1*number2));
            } else {
                System.out.println("Invalid operator try again!");
            }
            System.out.print("Do you want to continue?: ");
            String ans = sc.next();
            if (ans.equals("n")){
                System.out.println("Goodbye!");
                break;
            }
        }
    }
}