package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsDisplay {
    /**
     * interface Name : LockedMeAppOperationsDisplay
     * interface Methods : displayFiles,countOfFiles,isEmpty
     * @param FolderPath
     * @throws IOException
     */
    public void displayFiles(String FolderPath) throws IOException;
    public int  countOfFiles(String FolderPath);
    public boolean  isEmpty(String FolderPath);

}
