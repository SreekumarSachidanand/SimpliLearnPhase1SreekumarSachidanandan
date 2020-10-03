package businessoperations;
import businessoperationskelton.LockedMeAppOperationsAdd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class addFile implements LockedMeAppOperationsAdd{

    /**
     * Class Name : addFile
     * Method Name :AddFileToDirectory
     * This method adds a File to the directory.It also checks whether a file already exists
     * if a file exists then it wont be added
     * @param Foldername
     * @param FileName
     * @throws IOException
     */

    @Override
    public void AddFileToDirectory(String Foldername, String FileName) throws IOException {
        displayFile obj = new displayFile();
        int count = obj.countOfFiles(Foldername);
        if (count >= 0) {
            if(!Files.exists(Paths.get(Foldername,FileName))){
                Files.createFile(Paths.get(Foldername,FileName));
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File Already Exists in the Directory");
            }
        }

    }
}
