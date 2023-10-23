package Data;
import java.io.FileWriter;
import java.io.IOException;

public class FilePromo {

    private String fileString;

    public FilePromo(String fileString) {
        this.fileString = fileString;
    }

    public FilePromo() {
        this("exp2/list.txt");
    }

    /**
     * Записывает в файл
     */
    public void addFile(String str) {
        try (FileWriter fileWriter = new FileWriter(fileString, true)) {
            fileWriter.append(str + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
    }

}
