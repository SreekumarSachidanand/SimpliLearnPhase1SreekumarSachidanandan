package businessoperations;

import businessoperationskelton.LockedMeAppOperationsSearch;

import java.io.File;
import java.io.IOException;


public class searchFile implements LockedMeAppOperationsSearch{

    /**Clas Name : searchFile
     * Method Name : searchFile
     * This method searches for a file in the directory irrespective of case -sensitivity
     * @param FolderPath
     * @param FileName
     * @return String
     * @throws IOException
     */

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
