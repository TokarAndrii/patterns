package notPattern.parser.codingBat.Array2.only14.only14;

/**
 * Created by tokarAndrii on 21.11.15.
 * <p>
 * Task:
 * Given an array of ints, return true if every element is a 1 or a 4.
 * <p>
 * only14({1, 4, 1, 4}) → true
 * only14({1, 4, 2, 4}) → false
 * only14({1, 1}) → true
 */
public class Only14 {

    public Only14() {
    }

    public boolean only14(int[] nums) {
        if (nums.length < 1) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 4) {
                //   i++;
            } else return false;


        }

        return true;

    }

}




