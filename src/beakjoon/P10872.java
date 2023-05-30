package beakjoon;

import java.util.Scanner;

public class P10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int result = 1;
        for (; N > 0; N--) {
            result *= N;
        }

        System.out.println(result);
    }
}
