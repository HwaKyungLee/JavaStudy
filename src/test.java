import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int number = sc.nextInt();
        int total = 0;

        for (int i = 0; i < number; i++ ){
            int input = sc.nextInt();

            stack.push(input);


            if(input == 0){
                stack.pop();
                stack.pop();
            }
        }

        while(!stack.isEmpty()) total += stack.pop();

        System.out.println(total);


    }
}
