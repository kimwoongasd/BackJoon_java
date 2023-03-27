package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        double a = Double.parseDouble(arr[0]);
        double b = Double.parseDouble(arr[1]);
        System.out.println(a / b);
    }
}
