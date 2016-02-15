package ua.com.juja;

public class Main {

    public static String changeXY(String input) {
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
