
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class test2 {
    static String answer = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size= scan.nextInt();
        int[] numbers = new int[size];
        System.out.println(solution(numbers));

    }

    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        // int -> String
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        // 객체정렬
        Arrays.sort(str, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });


        if (str[0].startsWith("0"))
            answer += "0";
        else {
            for (int i = 0; i < str.length; i++) {
                answer += str[i];
            }
        }

        return answer;

    }

}
