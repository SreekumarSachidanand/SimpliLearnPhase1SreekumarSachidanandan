package businessoperationskelton;

import java.io.IOException;

public interface LockedMeAppOperationsDisplay {
    public void displayFiles(String FolderPath) throws IOException;
    public int  countOfFiles(String FolderPath);
    public boolean  isEmpty(String FolderPath);

}
