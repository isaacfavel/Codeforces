import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String s = reader.readLine().toLowerCase();

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);

            if (resultado.indexOf(String.valueOf(letra)) == -1) {
                resultado.append(letra);
            }
        }

        if (resultado.length() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
