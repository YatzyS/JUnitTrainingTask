import org.junit.Test;

import static org.junit.Assert.*;

public class ToTestTest {

    /***
     *
     * TODO Tests
     *
     * “ABCD” => “BCD”
     * “AACD” => “CD”
     * “BACD” => “BCD”
     * “BBAA” => “BBAA”
     * "AABAA” => “BAA”
     *
     *
     */
    @Test
    public void removeA() {
        ToTest tt = new ToTest();
        String ans = tt.removeA("ABCD");
        assertEquals("BCD", ans);
        ans = tt.removeA("AACD");
        assertEquals("CD", ans);
        ans = tt.removeA("BACD");
        assertEquals("BCD", ans);
        ans = tt.removeA("BBAA");
        assertEquals("BBAA", ans);
        ans = tt.removeA("AABAA");
        assertEquals("BAA", ans);
    }
}