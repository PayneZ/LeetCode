/**
 * Created by Payne on 2017/9/9.
 * Accepted
 */
public class Problem283 {
    public static void moveZeros(int[] nums)
    {
        int i = 0;
        int sentinel = -1;
        int temp;

        for(i = 0; i < nums.length; i++)
        {
            if(i == 0 && nums[i] == 0)
                sentinel = i;
            if(i >= 1 && nums[i] == 0 && nums[i-1] != 0)
                sentinel = i;
            if(nums[i] != 0 && sentinel != -1)
            {
                temp = nums[sentinel];
                nums[sentinel] = nums[i];
                nums[i] = temp;
                sentinel++;
            }
        }
    }

    public static void display(int[] nums)
    {
        int i;
        for(i = 0; i < nums.length - 1; i++)
            System.out.print(nums[i]+", ");

        System.out.println(nums[i]);
    }

    public static void main(String[] args)
    {
        int[] nums = {1, 0, 1, 0, 1, 0};
        display(nums);
        moveZeros(nums);;
        display(nums);

        int[] nums2 = {0, 0, 0, 1, 0, 1};
        display(nums2);
        moveZeros(nums2);;
        display(nums2);
    }


}
