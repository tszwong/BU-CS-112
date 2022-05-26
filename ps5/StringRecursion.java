// StringRecursion.java
// By: Tsz Kit Wong
// Email: wongt@bu.edu

public class StringRecursion {

    // method uses recursion to print individual characters in the string 
    // followed by spaces
    public static void printWithSpaces(String str) {
        if (str == null || str == "") {
            System.out.println();
            return;
        }
        System.out.print(str.charAt(0) + " ");
        printWithSpaces(str.substring(1));
    }

    // method uses recursion to create and return a "reflected" version of
    // the string in which the original string is followed by the characters
    // of the string in reverse order
    public static String reflect(String str) {
        if (str == null || str == "") {
            return "";
        } else {
            String restCall = reflect(str.substring(1));
            return str.charAt(0) + restCall + str.charAt(0);
        }
        
    }

    // use recursion to determine and return the number of differences between the two strings
    public static int numDiff(String str1, String str2) {
        if (str1.length() == 0) {
            int diffAdd = str2.length();
            return diffAdd;

        } else if (str2.length() == 0) {
            int diffAdd = str1.length();
            return diffAdd;

        } else {
            
            int restCall = numDiff(str1.substring(1), str2.substring(1));
            
            if (str1.charAt(0) != str2.charAt(0)) {
                return 1 + restCall;
            } else {
                return restCall;
            }
        }
    }

    // This method should use recursion to find and return the 
    // index of the first occurrence of the character ch in the string
    public static int indexOf(char ch, String str) {
        if (str == null || str == "") {
            return -1;
        } else {
            int restCall = indexOf(ch, str.substring(1));
            if (str.charAt(0) == ch) {
                return 0;
            } else {
                if (restCall == -1) {
                    return -1;
                } else {
                    return 1 + restCall;
                }
            }
        }
    }

    // test implementation of methods in StringRecursion class
    public static void main(String args[]) {

        // test printWithSpaces()
        printWithSpaces("space");
        System.out.println();

        // test reflect()
        System.out.println(reflect("method"));
        System.out.println(reflect("abc"));
        System.out.println();

        // test numDiff()
        System.out.println(numDiff("alien", "allen")); // should return 1
        System.out.println(numDiff("alien", "alone")); // should return 3
        System.out.println(numDiff("same", "same")); // should return 0
        System.out.println(numDiff("same", "sameness")); // should return 4
        System.out.println(numDiff("", "abc")); // should return 3
        System.out.println(numDiff("abc", "")); // should return 3
        System.out.println();

        // test indexOf()
        System.out.println(indexOf('b', "Rabbit")); // should return 2
        System.out.println(indexOf('P', "Rabbit")); // should return -1
        System.out.println();
    }
}
