package by.epam.logic;

import by.epam.entity.WordModel;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sorter {

    private static String match;
    private static ArrayList<WordModel> wordArr = new ArrayList<>();

    public ArrayList sortText(StringBuilder stringBuilder) {
        Pattern pattern = Pattern.compile("(\\w*)o(\\w*)");

        Matcher matcher = pattern.matcher(stringBuilder);

        while (matcher.find()) {

            match = matcher.group();
            int count = howMuchChar();

            wordArr.add(new WordModel(count, match));
        }
        wordArr.sort(new OrderByNumOfChar());

        return wordArr;
    }

    private int howMuchChar() {
        int count = 0;
        for (int i=0; i<match.length(); i++) {
            if (match.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

}
