import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_151A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int l=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int p=Integer.parseInt(st.nextToken());
        int nl=Integer.parseInt(st.nextToken());
        int np=Integer.parseInt(st.nextToken());

        k=k*l;
        nl=k/nl;
        c=c*d;
        p=p/np;

        if(nl<=c && nl<=p)
            System.out.println(nl/n);
        else 
            if( c<=nl && c<=p)
                System.out.println(c/n);
            else
                if(p<=nl && p<=c )
            System.out.println(p/n);
    }
}
