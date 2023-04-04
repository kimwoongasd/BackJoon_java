package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main_14225 {
    private static int n;
    static int[] arr;
    static int[] ch = new int[20 * 100000 + 20];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    private static void dfs(int idx, int total) {
        if (idx == n) {
            ch[total] = 1;
            return;
        }

        dfs(idx + 1, total);
        dfs(idx + 1, total + arr[idx]);
    }
}
