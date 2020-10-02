package businessoperations;
import businessoperationskelton.LockedMeAppOperationsDelete;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class deleteFile implements LockedMeAppOperationsDelete {

    @Override
    public void deleteFileIfExists(String folderpath, String filename) throws IOException {
        displayFile obj = new displayFile();
        int count = obj.countOfFiles(folderpath);
        if (count > 0) {
            Path path = Paths.get(folderpath, filename);
            if (Files.exists(path)) {
                Files.deleteIfExists(Paths.get(folderpath, filename));
                System.out.println("File Deleted Successfully");

            } else {
                System.out.println("File Doesn't Exist in the Directory");
            }
        } else {
            System.out.println("Directory is Empty");
        }
    }
}
