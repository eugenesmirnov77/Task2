package by.epam.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class WriterFile {

    private static Logger logger = Logger.getLogger(WriterFile.class.getName());

    public void writeFile(String filePath, ArrayList arrayList) {

        File file = new File(filePath);

        FileWriter fr = null;

        try {

            fr = new FileWriter(file);
            fr.write(String.valueOf(arrayList));

        } catch (IOException e) {

            logger.info("Error with writing to file");

        } finally {
            //close resources
            try {

                fr.close();

            } catch (IOException e) {

                logger.info("Error with closing stream");

            }
        }
    }
}
