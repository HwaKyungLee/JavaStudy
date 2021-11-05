import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String cmd;
        int pushnum;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < num; i++){
            cmd = sc.next();

            switch (cmd){
                case "push" :
                    pushnum = sc.nextInt();
                    stack.push(pushnum);
                case "pop" :
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        stack.peek();
                        stack.pop();
                case "size" :
                    stack.size();
                case "empty" :
                    if(stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                case "top" :
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        stack.peek();
            }
        }
    }
}
