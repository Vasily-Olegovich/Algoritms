package Lesson3;

import java.io.IOException;

public class Brackets {
    private static void error(char ch, int i) {
        System.out.printf("Error: %c at %d\n", ch, i);
    }

    public static boolean check(String input) {
        int size = input.length();
        Stack st = new Stack(size);
        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);

            if (ch == '[' || ch == '(' ||
                    ch == '{' || ch == '<')
                st.push(ch);
            else if (ch == ']' || ch == ')' ||
                    ch == '}' || ch == '>') {
                if (st.isEmpty()) {
                    error(ch, i);
                    return false;
                }

                try {
                    char c = (char) st.pop();
                    if (!((c == '[' && ch == ']') ||
                            (c == '<' && ch == '>') ||
                            (c == '{' && ch == '}') ||
                            (c == '(' && ch == ')'))) {
                        error(ch, i);
                        return false;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if (!st.isEmpty()) {
            try {
                error((char) st.peek(), size - 1);
                return false;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return true;
    }
}
