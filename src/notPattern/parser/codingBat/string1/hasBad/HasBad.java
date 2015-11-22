package notPattern.parser.codingBat.string1.hasBad;

/**
 * Created by tokarAndrii on 19.11.15.
 */

/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx".
 The string may be any length, including 0. Note: use .equals() to compare 2 strings*/

public class HasBad {

    public HasBad() {
    }

    public boolean hasBad(String str) {

        String bad = "bad";

        if (str == "") {
            return false;
        } else if (str.length() <= 3) {
            if (str.length() < 3) {
                return false;
            } else {
                String a = str.substring(0, 3);

                if (a.equalsIgnoreCase(bad))
                    return true;
            }

        } else if (str.length() > 3) {
            String d = str.substring(0,3);
            String b = str.substring(1, 4);

            if (b.equalsIgnoreCase(bad))
                return true;
            else if(d.equalsIgnoreCase(bad))
                return true;
        }

        return false;

    }
}
