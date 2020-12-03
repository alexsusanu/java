import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOExample2{
    public static void main(String[] args) throws IOException{
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } finally {
            fileReader.close();
        }
    }
}
