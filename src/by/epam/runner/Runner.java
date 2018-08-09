package by.epam.runner;

import by.epam.logic.Sorter;
import by.epam.util.ReaderFile;
import by.epam.util.WriterFile;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Runner {

    private static Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main(String[] args) {

        String input = "input_text.txt";
        String output = "output_text.txt";

        logger.info("Get text from file" + input);
        ReaderFile readerFile = new ReaderFile();

        logger.info("Reading file");
        StringBuilder stringBuilder;
        stringBuilder = readerFile.readFile(input);

        logger.info("Sorting words");
        Sorter sorter = new Sorter();
        ArrayList arrayList = sorter.sortText(stringBuilder);

        logger.info("Writing to file" + output);
        WriterFile writerFile = new WriterFile();
        writerFile.writeFile(output, arrayList);

        logger.info("Success!");

    }
}


