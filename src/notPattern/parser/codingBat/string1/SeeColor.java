package notPattern.parser.codingBat.string1;

//from CodingBat string1-seeColor

public class SeeColor {

    public String seeColor(String str) {

        if (str != null) {
            if (str.startsWith("blue")) {
                return "blue";
            } else if (str.startsWith("red")) {
                return "red";
            } else return "";

        }

        return "";
    }
}