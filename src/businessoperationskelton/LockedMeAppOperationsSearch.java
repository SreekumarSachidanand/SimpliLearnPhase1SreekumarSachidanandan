package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsSearch {
    /**
     *interface Name  : LockedMeAppOperationsSearch
     * Method Name  : searchFile
     * @param FolderPath
     * @param FileName
     * @return String
     * @throws IOException
     */
    public String searchFile(String FolderPath,String FileName) throws IOException;
}
