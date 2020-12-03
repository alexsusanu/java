import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOExample{
    public static void main(String[] args){
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("file not found");
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("IO problem");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
