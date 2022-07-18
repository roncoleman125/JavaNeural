package matrix;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

/**
 * Tests to run in sequence.
 * To extend this add a test class to the SuiteClasses, that is, the array.
 * @author Ron.Coleman
 */
@Suite.SuiteClasses({
        SliceStartTest.class,
        CommuteTest.class,
})

public class MopSuite {}
