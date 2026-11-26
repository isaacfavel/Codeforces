import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P_469A {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());

        StringTokenizer x=new StringTokenizer(br.readLine());
        StringTokenizer y=new StringTokenizer(br.readLine());

        int p=Integer.parseInt(x.nextToken());
        int q=Integer.parseInt(y.nextToken());

        String r="";

        for (int i = 0; i <p; i++) {
            r=r+""+x.nextToken();
        }
         for (int i = 0; i <q; i++) {
            r=r+""+y.nextToken();
        }
        StringBuilder resultado= new StringBuilder();
        for (int i = 0; i <r.length(); i++) {
            if(resultado.indexOf(String.valueOf(r.charAt(i))) == -1){
                resultado.append(r.charAt(i));
            }
        }
        boolean band=true;
        for (int i = 1; i <resultado.length()+1; i++) {
            if((resultado.charAt(i-1)- '0') != i ){
                band =false;
            }
        }
        
        if (band==true) {
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }

    }
}
