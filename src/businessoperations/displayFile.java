package businessoperations;
import businessoperationskelton.LockedMeAppOperationsDisplay;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class displayFile implements LockedMeAppOperationsDisplay {

    /**
     * class Name : displayFile
     * Methods : displayFiles
     * This method shows files in the directory in sorted order
     * @param FolderPath
     * @throws IOException
     */


    @Override
    public void displayFiles(String FolderPath) throws IOException {
        Files.list(Paths.get(FolderPath)).filter(Files::isRegularFile).sorted().forEach(System.out::println);
    }

    /**
     * Method Name : countOfFiles
     * This method returns the countOfFiles in the directory
     * @param FolderPath
     * @return int
     */
    @Override
    public int countOfFiles(String FolderPath) {
       File FileCount=new File(FolderPath);
       String files[]=FileCount.list();
        return files.length;
    }

    /**
     * Method Name : isEmpty
     * This method checks whether the directory is empty or not
     * @param FolderPath
     * @return boolean
     */

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
