
import java.util.Scanner;

public class ExpressionCheck {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Expression");
        String expr=scan.nextLine();
        if(isValid(expr))
            System.out.println("Valid Expression");
        else
            System.out.println("Invalid expression");
    }
    public static boolean isValid(String c){
        char a;
        StackA A=new StackA();
        for(int i=0;i<=c.length()-1;i++) {
            if (c.charAt(i) == '(' || c.charAt(i) == '{' || c.charAt(i) == '[')
                A.push(c.charAt(i));
            else if (c.charAt(i) == ')' || c.charAt(i) == '}' || c.charAt(i) == ']') {
                if (A.isEmpty()) {
                    System.out.println("Nothing left to compare with.");
                    return false;
                } else {
                    a = c.charAt(i);
                    if (!match(A.pop(),a))
                        return false;
                }
            }
        }
        if(A.isEmpty())
            return true;
        return false;
    }
    public static boolean match(char a,char b){
        if(a=='(' && b==')')
            return true;
        else if(a=='{' && b=='}')
            return true;
        else if(a=='[' && b==']')
            return true;
        else return false;
    }
}
