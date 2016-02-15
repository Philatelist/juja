package ua.com.juja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromVideoTest {
    @Test
    public void test_codex_codey() {
        assertMethod("codex", "codey");
        assertMethod("primaxcome", "primaycome");
    }

    @Test
    public void test_x_y() {
        assertMethod("x", "y");
        assertMethod("xx", "yy");
        assertMethod("xxx", "yyy");
    }

    @Test
    public void test_xxhixx_yyhiyy() {
        assertMethod("xxhixx", "yyhiyy");
    }

    @Test
    public void test_xhixhix_yhiyhiy() {
        assertMethod("xhixhix", "yhiyhiy");
    }

    @Test
    public void test_hiy_hiy() {
        assertMethod("hiy", "hiy");
        assertMethod("yih", "yih");
    }

    @Test
    public void test_h_h() {
        assertMethod("h", "h");
        assertMethod("a", "a");
    }

    @Test
    public void test_empty() {
        assertMethod("", "");
    }

    @Test
    public void test_yyhxyi_yyhyyi() {
        assertMethod("yyhxyi", "yyhyyi");
    }

    @Test
    public void test_without_change() {
        assertMethod("hihi", "hihi");
        assertMethod("haha", "haha");
    }


    private static void assertMethod(String input, String expected) {
        String actual = Main.changeXY(input);
        assertEquals(expected, actual);
    }
}
