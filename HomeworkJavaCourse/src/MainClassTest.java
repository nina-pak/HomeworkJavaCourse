import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    /*
    @Test           //Homework Test 1.1
    public void testGetLocalNumber()
    {
        int expected = 14;
        int actual = this.getLocalNumber();
        Assert.assertTrue("The number is not equal to 14", expected==actual);
    }
    */

    /*
    @Test           //Homework Test 1.2
    public void testGetClassNumber()
    {
        int expected = 45;
        int actual = this.number;
        Assert.assertTrue("The number is less than 45", actual > expected);
    }
    */

    @Test           //Homework Test 1.3
    public void testGetClassString() {

        Assert.assertTrue("There is no word \"Hello\" in this line", contains());
    }

    private boolean contains() {
        return test_string.toLowerCase().contains("Hello".toLowerCase());
    }
}