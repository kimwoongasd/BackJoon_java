package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(p(a));
    }

    public static int p(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * p(x - 1);
    }
}