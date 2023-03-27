package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (String x : arr) {
            if (v == Integer.parseInt(x)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
