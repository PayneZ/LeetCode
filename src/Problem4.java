/**
 * Created by Payne on 2017/12/17.
 */
public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){

        int index1 = 0, index2 = 0;
        int totalLength = nums1.length + nums2.length;
        int medianIndex = totalLength/2;

        int index = 0;
        int[] nums = new int[totalLength];


        while(index <= totalLength){
            if(index > medianIndex){
                if(totalLength % 2 == 0){
                    if(totalLength == 2){
                        return (nums[0] + nums[1])/2.0;
                    } else {
                        return (nums[index-2] + nums[index-1])/2.0;
                    }
                } else{
                    if(totalLength == 1){
                        return nums[0];
                    } else {
                        return nums[index - 1];
                    }
                }
            }

            if(index1 >= nums1.length){
                nums[index++] = nums2[index2++];
            } else if(index2 >= nums2.length){
                nums[index++] = nums1[index1++];
            } else {
                if(nums1[index1] <= nums2[index2]){
                    nums[index++] = nums1[index1++];
                } else{
                    nums[index++] = nums2[index2++];
                }
            }
        }

        return -1;
    }


    public static void main(String[] args){
        Problem4 problem = new Problem4();

        int[] nums1 = {};
        int[] nums2 = {1};
        System.out.println(problem.findMedianSortedArrays(nums1, nums2));
    }
}
