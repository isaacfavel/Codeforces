import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_996A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int res = num;
        int contador = 0;

        if (num / 100 > 0) {
            contador += num / 100;
            num = num % 100;
        }
        if (num / 20 > 0) {
            contador += num / 20;
            num = num % 20;
        }
        if (num / 10 > 0) {
            contador += num / 10;
            num = num % 10;
        }
        if (num / 5 > 0) {
            contador += num / 5;
            num = num % 5;
        }
        if (num / 1 > 0) {
            contador += num / 1;
            num = num % 1;
        }

        System.out.println(contador);

    }
}