public class sep12th {
    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};

        int[] answer = new int[prices.length];
        int time;

        for (int i = 0; i < prices.length; i++) {
            time = 0;
            if ( i == prices.length -1 ){
                answer[i] = 0;
                break;
            }
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] <= prices[j]) {
                    time++;
                }
            }
            answer[i] = time;

        }
        System.out.println(answer);
    }
}