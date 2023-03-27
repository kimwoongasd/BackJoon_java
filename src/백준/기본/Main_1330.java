package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        /*String result;

        if (a > b) {
            result = ">";
        } else if (a < b) {
            result = "<";
        } else {
            result = "==";
        }
        System.out.println(result);*/

        // 삼항연산자
        String result = (a > b) ? ">" : ((a < b) ? "<" : "==");
        System.out.println(result);
    }
}
