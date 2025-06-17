package exs1;

public class Exs1 {
    // if the string's length is even => true, else odd => false
    public static boolean evenOddString(String s) {
        int length = s.length();
        if (length % 2 == 0) {
            return true;
        } else {
            return false;
        }

        // if statement can be simplified in:
        // return length % 2 == 0;
}


public static boolean leapYear(int year) {
    if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else if (year % 4 == 0) {
        return true;
    } else {
        return false;
    }

    // if statement can be simplified in:
    /* if (year % 400 == 0) {
        return true;
    } else if (year % 100 == 0) {
        return false;
    } else return year % 4 == 0; */

    // && and || or
    // It is divisible by 4 and (not divisible by 100 or divisible by 400)
    //return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
}
    }
