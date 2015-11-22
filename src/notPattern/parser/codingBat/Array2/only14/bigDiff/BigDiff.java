package notPattern.parser.codingBat.Array2.only14.bigDiff;

/**
 * Created by tokarAndrii on 21.11.15.
 * <p>
 * Given an array length 1 or more of ints, return the difference between
 * the largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
 * and Math.max(v1, v2) methods return the smaller or larger of two values.
 * <p>
 * bigDiff({10, 3, 5, 6}) → 7
 * bigDiff({7, 2, 10, 9}) → 8
 * bigDiff({2, 10, 7, 2}) → 8
 */
public class BigDiff {

    public BigDiff() {
    }

    public int bigDiff(int[] nums) {
        if (nums.length < 1) {
            return -1;
        } else {
            if (nums.length == 1) {
                return 0;
            } else if (nums.length >= 2) {
                int i = 0;
                int max = nums[i];
                int min = nums[i+1];

                for (; i < nums.length; i++) {
                    if (nums[i] > max) {
                        max = nums[i];
                    }
                    if (nums[i] < min) {
                        min = nums[i];
                    }
                }
                return max - min;
            }
            return -1;
        }
    }
}
