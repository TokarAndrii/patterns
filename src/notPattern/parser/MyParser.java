package notPattern.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by root on 07.11.15.
 */
public class MyParser {

    Map memory = new TreeMap<>();

    String path = "/home/tokarandrii/Documents/testParse";

    public void read() {

        try {
            Scanner sc = new Scanner(new File(path));

            String id = "";
            String id2 = "";
            String id3 = "";


            String value = "";
            String value2 = "";


            while (sc.hasNextLine()) {


                sc.useDelimiter(";");

                id = sc.next();

                if (id.startsWith("\n")) {
                    id2 = id.substring(2, id.length());
                    System.out.println(id2);
                } else {
                    int point = id.indexOf("");
                    id2 = id.substring(point + 1, id.length());
                    System.out.println(id2);
                }


                value = sc.next();

                if (value.endsWith("")) {
                    value2 = value.substring(0, value.length() - 1);
                    System.out.println(value2);

                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
