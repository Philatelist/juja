package ua.com.juja;

public class fromVideo {
    public static void main(String[] args) {
        assertMethod("codex", "codey");
        assertMethod("x", "y");
        assertMethod("xxhixx", "yyhiyy");
        assertMethod("xhixhix", "yhiyhiy");
        assertMethod("hiy", "hiy");
        assertMethod("h", "h");
        assertMethod("", "");
        assertMethod("xxx", "yyy");
        assertMethod("yyhxyi", "yyhyyi");
        assertMethod("hihi", "hihi");
    }

    private static void assertMethod(String input, String expected) {
        String actual = changeXY(input);
        String status = actual.equals(expected)
                ? "OK"
                : "FAIL expected: '" + expected + "' but was: '" + actual + "'";
        System.out.println(status);
    }

    private static String changeXY(String input) {
        char[] chars = input.toCharArray();
        char[] result = new char[input.length()];
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x') {
                result[index] = 'y';
            } else {
                result[index] = chars[index];
                // do nothing
            }
        }
        return new String(result);
    }

    // make it work -> Make it better -> Make it fast
}
