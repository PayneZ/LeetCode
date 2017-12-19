import java.util.HashMap;
import java.util.Map;

/**
 * Created by Payne on 2017/9/10.
 */
public class Problem1 {
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }
        for (int i = 0; i< nums.length; i++)
        {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i)
                return new int[]{i, map.get(diff)};
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
