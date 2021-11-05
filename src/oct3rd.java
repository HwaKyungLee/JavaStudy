import java.util.Scanner;

public class oct3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        int[] number = new int[max-min+1];
        char[] english = new char[max-min+1];

        String num = min + "";
        for (int i = 0; i < number.length; i++){
            number[i] = min + i;
            System.out.print(number[i]);
        }

        for(int j = 0; j < number.length; j++){
            while (number[j] > 0){

            }
        }

    }
}
