import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class cities {
    public static void main(String[] args) {
       String file = "cities.csv";
       String line;
       int i=0;
       List<String[]>lines = new ArrayList<String[]>();
       HashMap<String,Integer> hm=new HashMap<String,Integer>();
       try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                lines.add(line.split(","));
                String key = (line.split(","))[9];
                if(hm.containsKey(key)== true)
                {
                    hm.put(key,hm.get(key)+1);
                }
                else{
                    hm.put(key,1);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
            System.out.println(hm);    
        }
    }

