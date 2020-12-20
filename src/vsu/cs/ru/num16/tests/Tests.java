package vsu.cs.ru.num16.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vsu.cs.ru.num16.common.MaxLengthOfSubsequenceAndPositionOfFirstElement;

class Tests {

    @Test
    void firstTestGetPositionOfFirstElement() {
        int[] array = {2, 3, 1, 2, 3, 1, 2 , 3};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getPositionOfFirstElement();
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void firstTestGetMaxLength() {
        int[] array = {2, 3, 1, 2, 3, 1, 2 , 3};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getMaxLength();
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void secondTestGetPositionOfFirstElement() {
        int[] array = {1, 4, 7, -1, 2, 5, 8 , 1};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getPositionOfFirstElement();
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    void secondTestGetMaxLength() {
        int[] array = {1, 4, 7, -1, 2, 5, 8 , 1};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getMaxLength();
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    void thirdTestGetPositionOfFirstElement() {
        int[] array = {3, 2, 15, 2, 2, 2, 3, 4};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getPositionOfFirstElement();
        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void thirdTestGetMaxLength() {
        int[] array = {3, 2, 15, 2, 2, 2, 3, 4};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getMaxLength();
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void fourthTestGetPositionOfFirstElement() {
        int[] array = {1, -5, 2, 3, -2, 7, 0, 1};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getPositionOfFirstElement();
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    void fourthTestGetMaxLength() {
        int[] array = {1, -5, 2, 3, -2, 7, 0, 1};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getMaxLength();
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    void fifthTestGetPositionOfFirstElement() {
        int[] array = {1, 4, 9, 10, -2, 4, 5, 3};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getPositionOfFirstElement();
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void fifthTestGetMaxLength() {
        int[] array =  {1, 4, 9, 10, -2, 4, 5, 3};
        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(array);
        int actualResult = result.getMaxLength();
        Assertions.assertEquals(4, actualResult);
    }
}


