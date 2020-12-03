import java.io.File;
import java.io.IOException;

public class FileExample{
    public void newFile(){
        for (int i = 1; i < 11; i++){
            String filename = "example" + i +".txt";
            File f = new File("ExampleDIR/" + filename);
            try{
                f.createNewFile();
            }catch (IOException e){}
        }
    }

    public File newDir(){
        File f = new File("ExampleDIR");
        f.mkdir();
        return f;
    }

    public void listFilesDIR(File dir){
        if(dir.isDirectory()){
            File[] files = dir.listFiles();
            for (File f : files){
                System.out.println(f.getName());
            }
        }
    }
}
