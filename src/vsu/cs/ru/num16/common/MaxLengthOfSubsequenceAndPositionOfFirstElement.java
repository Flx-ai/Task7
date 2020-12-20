package vsu.cs.ru.num16.common;

public class MaxLengthOfSubsequenceAndPositionOfFirstElement {

    private int positionOfFirstElement;
    private int maxLength;

    public MaxLengthOfSubsequenceAndPositionOfFirstElement(int[] arrayOfIntegers) {
        calcMaxLengthOfIncreasingSubsequenceAndPositionOfFirstElement(arrayOfIntegers);
    }

    public int getPositionOfFirstElement() {
        return positionOfFirstElement;
    }

    public void setPositionOfFirstElement(int positionOfFirstElement) {
        this.positionOfFirstElement = positionOfFirstElement;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    private void calcMaxLengthOfIncreasingSubsequenceAndPositionOfFirstElement(int[] arrayOfIntegers) {
        int currentLength = 1;
        int temporaryPositionOfFirstElement = 0;
        int maxLength = 1;
        int permanentPositionOfFirstElement = 0;

        for (int i = 0; i < arrayOfIntegers.length - 1; i++) {
            if (arrayOfIntegers[i] < arrayOfIntegers[i + 1]) {
                currentLength++;
            }
            if (arrayOfIntegers[i] >= arrayOfIntegers[i + 1] || (i + 1) == arrayOfIntegers.length - 1) {
                if (currentLength >= maxLength) {
                    maxLength = currentLength;
                    permanentPositionOfFirstElement = temporaryPositionOfFirstElement ;
                }
                temporaryPositionOfFirstElement = i + 1;
                currentLength = 1;
            }
        }
        this.maxLength = maxLength;
        this.positionOfFirstElement = permanentPositionOfFirstElement + 1;
    }
}
