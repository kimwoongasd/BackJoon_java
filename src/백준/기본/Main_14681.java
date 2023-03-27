package 백준.기본;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        /*int res = ((x > 0 && y > 0) ? 1 : (x < 0 && y > 0) ? 2 :
                (x < 0 && y < 0) ? 3 : 4);*/
        int res;
        if (x > 0 && y > 0) {
            res = 1;
        } else if ((x < 0 && y > 0)) {
            res = 2;
        } else if ((x < 0 && y < 0)) {
            res = 3;
        } else {
            res = 4;
        }
        System.out.println(res);
    }
}
