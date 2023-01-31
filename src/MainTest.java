public class MainTest {
    Main mainClass = new Main();

    @Test
    public void checkAverageCount(){
        int[] array = { 5,5,5 };
        int actualResult = mainClass.countAverage(array);
        Assertion.assertEquals(5, actualResult);
    }

    @Test
    public void checkSquareArrayIsTrue(){
        int [][] array = new int[2][2];
        boolean actualResult = mainClass.isSquareMatrix(array);
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void checkSquareArrayIsFalse(){
        int [][] array = new int[2][1];
        boolean actualResult = mainClass.isSquareMatrix(array);
        Assertions.assertFalse(actualResult);
    }
}

