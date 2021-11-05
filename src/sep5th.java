import java.util.Scanner;

public class sep5th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt() ;
        int N;
        String WG;

        for(int TN = 1; TN <= T; TN++){
            sc.nextLine();
            N = sc.nextInt();
            int [][] arrWG = new int[N+2][N+2];
            int sum = 0;
            int answer = 0;

            for(int i = 1; i < N+1; i++){
                for(int j = 1; j < N+1; j++){
                        WG = sc.next();
                        if (WG.equals("W")) {
                            arrWG[i][j] = 1;
                        } else arrWG[i][j] = 0;
                }
            }

            for(int a = 1; a < N + 1; a++){
                for(int b = 1; b < N + 1; b++){
                    if (arrWG[a][b] == 1){
                        for(int c = a - 1; c < a + 2; c++){
                            for(int d = b - 1; d < b + 2; d++){
                                sum += arrWG[c][d];
                            }
                        }
                        if(answer < sum){
                            answer = sum;
                        }
                        sum = 0;
                    }
                }
            }

            if(answer == 1){
                System.out.println("#"+TN+" "+answer);
            }else System.out.println("#"+TN+" "+(answer - 1));

        }

        sc.close();

    }
}
