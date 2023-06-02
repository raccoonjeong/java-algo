package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());


        Set nSet = new HashSet<String>(Arrays.asList(sc.nextLine().split(" ")));

        int M = Integer.parseInt(sc.nextLine());
        String[] mArr = sc.nextLine().split(" ");

        int[] result = new int[M];

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < M; i++) {
            if (nSet.contains(mArr[i])) {
                result[i] = 1;
            }
            sb.append(result[i] + " ");
        }

        System.out.println(sb);
    }
}
