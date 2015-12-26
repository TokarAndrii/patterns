package notPattern.parser.codingBat.arrayCodingBat;

/**
 * Created by tokarAndrii on 21.11.15.
 * <p>
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4.
 * Do not move the 3's, but every other number may move.
 * The array contains the same number of 3's and 4's, every 3 has a number after
 * it that is not a 3 or 4, and a 3 appears in the array before any 4.
 * <p>
 * fix34({1, 3, 1, 4}) → {1, 3, 4, 1}
 * fix34({1, 3, 1, 4, 4, 3, 1}) → {1, 3, 4, 1, 1, 3, 4}
 * fix34({3, 2, 2, 4}) → {3, 4, 2, 2}
 */

public class Fix34 {

    public Fix34() {
    }

    public int[] fix34(int[] nums) {
        int[] array = new int[nums.length];
        int counterArrayStart = 0;
        int counterArrayEnd = array.length - 1;
        int counterNumsStart = 0;
        int counterEndNums = nums.length - 1;
        if (nums.length < 1) {
            return array;
        } else {
            int countCycles = 0;
            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] == 3) {
                    array[i] = 3;
                    countCycles++;
                    for (int j = countCycles; j <= nums.length - 1; j++) {
                        if (nums[j] == 4) {
                            array[i + 1] = 4;
                            int transfer = nums[i + 1];
                            nums[i + 1] = 4;
                            //nums[j] = transfer;
                            array[j] = transfer;
                            nums[j] = transfer;
                            countCycles++;

                            break;
                        }
                    }
                }
            }

            int totalCounter = 0;

            for (int i = 0; i < nums.length; i++) {
                int p = nums.length - 1;
                if (totalCounter == array.length) {
                    return array;
                } else if (nums[i] == 3) {
                    i++;
                    totalCounter++;
                } else if (nums[i] == 4) {
                    i++;
                    totalCounter++;
                } else {
                    for (int j = nums.length - 1; j >= 0; j--) {
                        if (totalCounter == array.length) {
                            return array;
                        } else if (nums[j] == 3) {
                            j--;
                            totalCounter++;
                        } else if (nums[j] == 4) {
                            j--;
                            totalCounter++;
                        } else {
                            int transfer = nums[i];
                            nums[i] = nums[j];
                            array[i] = nums[j];
                            nums[j] = transfer;
                            array[j] = transfer;
                            totalCounter = totalCounter + 2;
                        }
                    }
                }
            }
        }
        return array;
    }
}

