/**
 * Created by user on 26.09.2017.
 */
public class Result {

    public static int[] searchResult(int[] array) {
        int maxRes = array[0];
        int rightIndex = 0;
        int leftIndex = 0;
        int startPos = -1;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

            if (sum > maxRes) {
                maxRes = sum;
                rightIndex = i;
                leftIndex = startPos + 1;
            }

            if (sum < 0) {
                sum = 0;
                startPos = i;
            }
        }
        return new int[]{leftIndex, rightIndex};
    }
}

