package file.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FileOperationsTest {
    private final int NUMBER_OF_LINES = 22;
    private final String PATH_TO_FILE = getClass().getResource("/fileOperations/test.txt").getPath();
    private final String FIRST_LINE = "Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,";

    @Test
    protected void testIfNumberOfLineAreEquals() {
        String fileContent = FileLoader.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(NUMBER_OF_LINES, split.length);
    }

    @Test
    protected void testIfFirstLinesAreEqual() {
        String fileContent = FileLoader.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(FIRST_LINE, split[0]);

    }

}
