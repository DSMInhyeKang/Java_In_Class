import java.util.stream.IntStream;

public class A2202
{
    int sum = 0;
    int run(int[] nums) {
        for (int arrs: nums) {
            sum += arrs;
        }
        return sum;
    }
}
