package businessoperations;

import businessoperationskelton.LockedMeAppOperationsSearch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class searchFile implements LockedMeAppOperationsSearch{


    @Override
    public String searchFile(String FolderPath,String FileName) throws IOException {
        displayFile obj =new displayFile();
        int count=obj.countOfFiles(FolderPath);
        String DirectoryName=FolderPath+"\\";
        String fileFound=null;
        if(count>0) {
            File file =new File(DirectoryName+FileName);
            if(file.exists()){
                fileFound=DirectoryName+FileName;
                System.out.println("File Exists"+" "+DirectoryName+FileName);
            }
            else{
                fileFound=null;
                System.out.println("File Not Found");
            }
        }
        else{
            System.out.println("Directory is empty");
        }

        return fileFound;
    }

}
