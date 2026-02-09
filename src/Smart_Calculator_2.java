import java.sql.SQLOutput;
import java.util.Scanner;

public class Smart_Calculator_2 {
    public static void main(String[] args) {
        System.out.println("-----Smart_Calculator_2-----");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Enter the first number: ");
            int number1=sc.nextInt();
            System.out.print("Enter the second number: ");
            int number2=sc.nextInt();
            System.out.print("Enter the operator(+,-,/,*) or n to stop: ");
            String operator = sc.next();
            if (operator.equals("n")){
                System.out.println("Goodbye ");
                break;
            }
            switch(operator){
                case ("+"):System.out.println("result"+(number1+number2));break;
                case ("-"): System.out.println("result"+(number1-number2));break;
                case ("*"):System.out.println("result"+(number1*number2));break;
                case ("/"):
                    if (number2 ==0){
                        System.out.println("Error! Division by zero");
                    }else{
                        System.out.println("result"+(number1/number2));
                    }break;

                default: System.out.println("Invalid Operator");


            }


        }
    }
}
