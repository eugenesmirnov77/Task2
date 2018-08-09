package by.epam.logic;

import by.epam.entity.WordModel;

import java.util.Comparator;

public class OrderByNumOfChar implements Comparator<WordModel> {

    @Override
    public int compare(WordModel o1, WordModel o2) {
        int flag = o1.getNumOfChar() - o2.getNumOfChar();
        if (flag == 0) {
            flag = o1.getName().compareTo(o2.getName());
        }
        return flag;
    }
}
