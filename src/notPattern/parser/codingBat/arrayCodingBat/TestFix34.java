package notPattern.parser.codingBat.arrayCodingBat;

/**
 * Created by tokarAndrii on 21.11.15.
 */
public class TestFix34 {
   /* fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}*/
    public static void main(String[] args) {
        Fix34 fix34 = new Fix34();
        int[] mas = {1, 3, 1, 4, 4, 3, 1};

        int[] newMas = fix34.fix34(mas);
        for (int i = 0; i < newMas.length ; i++) {
            System.out.print(newMas[i]);

        }
    }
}
