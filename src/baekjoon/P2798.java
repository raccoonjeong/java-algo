package baekjoon;

import java.util.Scanner;

public class P2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int cardCount = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[] cardArray = new int[cardCount];

        String[] cardStringArray = (sc.nextLine()).split(" ");
        for (int i = 0; i < cardCount; i++) {
            cardArray[i] = Integer.parseInt(cardStringArray[i]);
        }

        int A = 0;
        int B = 0;
        int C = 0;

        int result = 0;
        int max = 0;
        int min = M;
        for (int i = 0; i < cardArray.length; i++) {
            A = cardArray[i];
            for (int j = 0; j < cardArray.length; j++) {
                if (j == i) continue;
                B = cardArray[j];
                for (int k = 0; k < cardArray.length; k++) {
                    if (k == j || k == i) continue;
                    C = cardArray[k];
                    result = A+B+C;
                    if (result <= min && max < result) {
                        max = result;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
