package datatypes;

public class KeyWords {
    private String keyWord;
    private int expectedCount;


    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public int getExpectedCount() {
        return expectedCount;
    }

    public void setExpectedCount(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    public KeyWords(String keyWord, int expectedCount) {
        this.keyWord = keyWord;
        this.expectedCount = expectedCount;
    }

}
