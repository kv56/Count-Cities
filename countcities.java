import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countcities {
    public static void main(String[] args) {
       String file = "cities.csv";
       String line;
       int i=0;
       List<String[]>lines = new ArrayList<String[]>();
       try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                lines.add(line.split(","));
            }
        } catch (Exception e){
            System.out.println(e);
        }
        String[][] array =new String[lines.size()][0];
        lines.toArray(array);
        String[] B=new String[50];
        int[] C = new int[50];
        int k=0;
        for(i=1;i<=128;i++)
        {
            String j=array[i][9];
            if((Arrays.asList(B).contains(j))==false)
            {
                B[k]=j;
                
                C[k]=C[k]+1;
                k=k+1;
                
            }
            else{
                int o= Arrays.asList(B).indexOf(j);
                C[o]=C[o] + 1;
            }
        }
        C[0]+=1;
        for(i=0;i<46;i++){
            System.out.println(B[i]+":"+C[i]);
        }
        
    }
}
