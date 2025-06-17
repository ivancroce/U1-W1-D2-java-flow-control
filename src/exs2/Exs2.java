package exs2;

public class Exs2 {
    public static String numberToWord(int number) {
        String result;

        switch (number) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            default:
                result = "Error: the number must be between 0 and 3.";
        }

        // Switch statement can be replaced with enhanced 'switch'
        /* String result = switch (number) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "Error: the number must be between 0 and 3.";
        }; */

        return result;
    }
}
