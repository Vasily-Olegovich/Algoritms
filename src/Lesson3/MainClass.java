package Lesson3;

public class MainClass {
    public static void main(String[] args) {
        String s = "a<a>a(a{a}a[a<a>a]a)a(aa";
        System.out.println(Brackets.check(s));
    }
}
