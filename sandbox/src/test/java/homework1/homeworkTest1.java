package homework1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homeworkTest1 {
    @Test
    public void testDistance() {
        Point a = new Point(1,5);
        Point b = new Point(1,3);
        Assert.assertEquals(a.distance(a, b), 2);
    }
}
