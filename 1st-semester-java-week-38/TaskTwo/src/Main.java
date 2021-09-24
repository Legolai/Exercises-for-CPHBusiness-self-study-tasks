/*
2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
2.b Write a function that receives to integers as parameters and returns the sum of them.
2.c Write a function that receives a string and returns it as uppercase. (Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. (Hints: ".charAt(0)" and "Character.isUpperCase('a');" )
*/

public class Main {
    public static boolean happy = true;

    public static void main(String[] args) {
        if (iAmHappy()) {
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands");
        }

        System.out.println(sum(10, 24));
        System.out.println(toUpperString("Hello world"));
        System.out.println(isCapitalized("hello world"));

    }

    public static boolean iAmHappy() {
        // fill out what is missing here:
        return happy;
    }

    public static int sum(int a, int b) {
        return (a + b);
    };

    public static String toUpperString(String s) {
        return s.toUpperCase();
    }

    public static boolean isCapitalized(String s) {
        char stort = toUpperString(s).charAt(0);
        return stort == s.charAt(0);
        // return (Character.isUpperCase(s.charAt(0)));
    }
}
