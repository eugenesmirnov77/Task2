package by.epam.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class ReaderFile {

    private static Logger logger = Logger.getLogger(ReaderFile.class.getName());
    private static BufferedReader in;
    private static StringBuilder stringBuilder = new StringBuilder();

    public StringBuilder readFile(String fileName) {
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            logger.info("File not found");
        }

        try {

            String inputText;
            while ((inputText = in.readLine()) != null) {
                if (inputText.startsWith("/*")) {
                    while (!inputText.endsWith("*/")) {
                        String temp = in.readLine();
                        if (temp == null) {
                            break;
                        }
                        inputText = temp;
                    }
                }
                stringBuilder.append(inputText);
            }

        } catch (IOException e) {
            logger.info("Error with accessing to file");
        }

        try {
            in.close();
        } catch (IOException e) {
            logger.info("Error with closing stream");
        }

        return stringBuilder;
    }
}
