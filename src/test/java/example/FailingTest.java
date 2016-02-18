package example;

/**
 * Created by ashokk on 2/17/2016.
 */
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.fail;

public class FailingTest {

    @Test
    public void testAuthenticator() throws Exception {
        fail("FAIL!");
    }
}
