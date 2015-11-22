package notPattern.parser.codingBat.string1.lastChar;

/**
 * Created by tokarAndrii on 19.11.15.
 */
public class LastChars {

    public String lastChars(String a, String b) {

        String c = "";

        if (a != "") {
            c = a.substring(0, 1);
        }

        else {
            c = "@";
        }


        int length = b.length();

        if (length > 0) {
            String d = (b.substring(length - 1, length));

            c += d;

        } else {
            c += "@";
        }


        return c;
    }
}
