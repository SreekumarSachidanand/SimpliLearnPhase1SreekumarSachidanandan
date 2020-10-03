package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsDelete {
    /**
     * interface Name : LockedMeAppOperationsDelete
     * interface Method : deleteFileIfExists
     * @param folderpath
     * @param filename
     * @throws IOException
     */

    public void deleteFileIfExists(String folderpath,String filename) throws IOException;
}
