package ua.com.juja;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FromVideoTest {
    @Test
    public void test01() {
        assertMethod("codex", "codey");
    }

    @Test
    public void test02() {
        assertMethod("x", "y");
    }

    @Test
    public void test03() {
        assertMethod("xxhixx", "yyhiyy");
    }

    @Test
    public void test04() {
        assertMethod("xhixhix", "yhiyhiy");
    }

    @Test
    public void test05() {
        assertMethod("hiy", "hiy");
    }

    @Test
    public void test06() {
        assertMethod("h", "h");
    }

    @Test
    public void test07() {
        assertMethod("", "");
    }

    @Test
    public void test08() {
        assertMethod("xxx", "yyy");
    }

    @Test
    public void test09() {
        assertMethod("yyhxyi", "yyhyyi");
    }

    @Test
    public void test10() {
        assertMethod("hihi", "hihi");
    }


    private static void assertMethod(String input, String expected) {
        String actual = Main.changeXY(input);
        assertEquals(expected, actual);
    }
}
