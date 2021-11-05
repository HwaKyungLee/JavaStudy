import java.util.Scanner;

public class sep7th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int N;
        int M;
        int [][] arrN;

        int result;
        int sum;

        for(int i = 0; i < T; i++){
              N = sc.nextInt();
              M = sc.nextInt();
              arrN = new int[N][N];
              result = 0;


              for(int a = 0; a < N; a++){
                  for(int b = 0; b < N; b++){
                      arrN[a][b] = sc.nextInt();
                  }
              }

              for(int c = 0; c < N; c ++){
                  for(int d = 0; d < N; d++){
                      sum = 0;
                      if(c + M > N || d + M > N){
                          continue;
                      }else {
                          for (int f = c; f < M + c; f++) {
                              for (int g = d; g < M + d; g++) {
                                  sum += arrN[f][g];
                              }
                          }
                      }
                      if(sum > result) result = sum;
                  }
              }

            System.out.println("#"+T+" "+result);

        }

    }
}
