package threads;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void testSingletonInstance() {
        // Get two instances of the Singleton class
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Check if both instances are the same object
        Assert.assertSame(singleton1, singleton2);
    }
}
