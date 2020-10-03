package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsAdd {
    /**
     * interface Name  : LockedMeAppOperationsAdd
     * interface Methods : AddFileToDirectory
     * @param Foldername
     * @param FileName
     * @throws IOException
     */

    public void AddFileToDirectory(String Foldername,String FileName) throws IOException;

}
