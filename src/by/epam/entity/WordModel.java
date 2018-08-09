package by.epam.entity;

public class WordModel {

    private int numOfChar;
    private String name;

    public WordModel(int numOfChar, String name) {

        this.numOfChar = numOfChar;
        this.name = name;
    }

    public int getNumOfChar() {
        return numOfChar;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "| Number of chars = " + numOfChar +
                "| name = " + name + "\n";
    }
}
