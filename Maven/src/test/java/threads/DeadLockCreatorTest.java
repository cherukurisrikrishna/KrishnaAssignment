package threads;

import org.junit.Test;

public class DeadLockCreatorTest {

    @Test(timeout = 2000)
    public void testCreateDeadlock() {
        DeadLockCreator deadlockCreator = new DeadLockCreator();
        deadlockCreator.createDeadlock();
    }
}
