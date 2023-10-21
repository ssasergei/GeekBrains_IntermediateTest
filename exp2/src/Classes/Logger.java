package Classes;

import java.io.FileWriter;

/**
 * Класс сохраняет переданные строки в файл.
 */
public class Logger {
    private String filePath;

    public Logger(String filePath) {
        this.filePath = filePath;
    }

    public Logger() {
        this("log.txt");
    }

    /**
     * Записывает строку в файл
     * 
     * @param str
     */
    public void log(String str) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.append(str);
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (Exception e) {
            System.out.println("Ошибка");
            ;
        }

    }
}
