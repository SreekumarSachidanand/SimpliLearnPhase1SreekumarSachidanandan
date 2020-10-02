package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsDelete {

    public void deleteFileIfExists(String folderpath,String filename) throws IOException;
}
