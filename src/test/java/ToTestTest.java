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
    ToTest tt;

    @Test
    public void remove1() {
        tt = new ToTest();
        String ans = tt.removeA("ABCD");
        assertEquals("BCD", ans);
    }

    @Test
    public void remove2() {
        tt = new ToTest();
        String ans = tt.removeA("AACD");
        assertEquals("CD", ans);
    }

    @Test
    public void remove3() {
        tt = new ToTest();
        String ans = tt.removeA("BACD");
        assertEquals("BCD", ans);
    }

    @Test
    public void remove4() {
        tt = new ToTest();
        String ans = tt.removeA("BBAA");
        assertEquals("BBAA", ans);
    }

    @Test
    public void remove5() {
        tt = new ToTest();
        String ans = tt.removeA("AABAA");
        assertEquals("BAA", ans);
    }

}