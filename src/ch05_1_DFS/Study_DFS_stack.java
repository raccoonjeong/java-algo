package ch05_1_DFS;

public class Study_DFS_stack {

    // 방문처리에 사용할 배열선언
    static boolean[] visited = new boolean[9];

    // 그래프의 연결상태를 2차원 배열로 표현
    static int[][] graph = {
            {},
            {2,3,8},
            {1,5},
            {5,7},
            {3,4,7},
            {2},
            {4,5},
            {1,2}
    };
}
