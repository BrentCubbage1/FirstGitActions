import org.junit.Assert;
import org.junit.Test;

public class BasicMathTests {



    @Test
    public void addNumbersTest(){
        BasicMath basicMath = new BasicMath();

        int expected = 3;
        int actual = basicMath.addNumbers(3,2);

        System.out.println("This test run yields: " + actual);
        Assert.assertTrue(expected == actual);

    }

    @Test
    public void addTest(){
        Assert.assertEquals(1+2, 3);
    }
}
