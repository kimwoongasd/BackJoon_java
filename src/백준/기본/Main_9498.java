package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char c;
        /*if (a >= 90) {
            c = 'A';
        } else if (a >= 80) {
            c = 'B';
        } else if (a >= 70) {
            c = 'C';
        } else if (a >= 60) {
            c = 'D';
        } else {
            c = 'F';
        }*/

        // 삼항연산자
        c = ((a >= 90) ? 'A' : (a >= 80) ? 'B' : (a >= 70) ? 'C' : (a >= 60) ? 'D' : 'F');
        System.out.println(c);
    }
}
