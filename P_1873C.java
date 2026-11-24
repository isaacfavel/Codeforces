import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_1873C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n= Integer.parseInt(reader.readLine());
        int matrix[][]={{1,1,1,1,1,1,1,1,1,1},
                        {1,2,2,2,2,2,2,2,2,1},
                        {1,2,3,3,3,3,3,3,2,1},
                        {1,2,3,4,4,4,4,3,2,1},
                        {1,2,3,4,5,5,4,3,2,1},
                        {1,2,3,4,5,5,4,3,2,1},
                        {1,2,3,4,4,4,4,3,2,1},
                        {1,2,3,3,3,3,3,3,2,1},
                        {1,2,2,2,2,2,2,2,2,1},
                        {1,1,1,1,1,1,1,1,1,1}};
        
        for (int i = 0; i < n; i++) {
            int total=0;
            for (int j = 0; j <10; j++) {
                String s=reader.readLine();
                for (int k = 0; k < matrix.length; k++) {
                    if(s.charAt(k) =='X')
                        total+=matrix[j][k];
                }

            }
            System.out.println(total);
        }

        


    }
}