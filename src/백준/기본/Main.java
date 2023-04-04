package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    private static int a, b;
    private static int res = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        if (b == 0) {
            res--;
            System.out.println(res);
        } else {
            System.out.println(res);
        }
    }

    private static void dfs(int total, int idx) {
        if (idx == a) {
            if (total == b) res++;
            return;
        }
        dfs(total + arr[idx], idx + 1);
        dfs(total, idx + 1);
    }
}
