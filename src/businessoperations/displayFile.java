package businessoperations;
import businessoperationskelton.LockedMeAppOperationsDisplay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class displayFile implements LockedMeAppOperationsDisplay {


    @Override
    public void displayFiles(String FolderPath) throws IOException {
        String testpath="root";
        Files.list(Paths.get(FolderPath)).filter(Files::isRegularFile).sorted().forEach(System.out::println);
    }

    @Override
    public int countOfFiles(String FolderPath) {
       File FileCount=new File(FolderPath);
       String files[]=FileCount.list();
        return files.length;
    }

    @Override
    public boolean isEmpty(String FolderPath) {
        File FileCount=new File(FolderPath);
        String files[]=FileCount.list();
        if (files.length>0){
            return false;
        }
        else {
            return true;
        }
    }

}
