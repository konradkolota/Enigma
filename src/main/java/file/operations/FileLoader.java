package file.operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

    public static String getFileContent(String pathToFile) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Culd not find the file: " + pathToFile);
        } catch (IOException e) {
            System.out.println("Some problem with file ... : " + e);
        }
        return stringBuilder.toString();
    }

}
