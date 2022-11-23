package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        Fibonacci fibonacci = new Fibonacci();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N번째 수 출력하기
        System.out.println(fibonacci.find(N,1,1));
    }
    private int find(int N,int prev,int now) {
        if(N<=2) return now;
        return find(N-1,now,prev+now);
    }
}
