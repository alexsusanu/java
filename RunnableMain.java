import java.io.File;

public class RunnableMain{
    public static void main(String[] args){
        FileExample f = new FileExample();
        File dir = f.newDir();
        f.newFile();
        f.listFilesDIR(dir);
    }
}
