import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ResultTest {

    @Test
    public void searchResult() throws Exception {
        int[] m1 = {1, 2, 3, 4, -10};
        int[] m2 = {-1, -1, 4, 5, 3};
        int[] m3 = {-20, -2, 8, -15};
        int[] m4 = {12, -24, -14, -3};

        int[] resFor1 = {0, 3};
        int[] resFor2 = {2, 4};
        int[] resFor3 = {2, 2};
        int[] resFor4 = {0, 0};

        assertArrayEquals(Result.searchResult(m1), resFor1);
        assertArrayEquals(Result.searchResult(m2), resFor2);
        assertArrayEquals(Result.searchResult(m3), resFor3);
        assertArrayEquals(Result.searchResult(m4), resFor4);

    }
}