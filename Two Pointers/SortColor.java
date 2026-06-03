/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
*/
class Solution {
    public void sortColors(int[] nums) {
        //DNF
        int low=0;
        int high=nums.length-1;
        int mid=0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }

      /*
      using Loops
      int count0=0;
      int count1=0;
      int count2=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==0) count0++;
        if(nums[i]==1) count1++;
        if(nums[i]==2) count2++;
      }
      for(int i=0;i<count0;i++){
            nums[i]=0;
      }
      for(int i=0;i<count1;i++){
        nums[i+count0]=1;
      }
      for(int i=0;i<count2;i++){
        nums[i+count0+count1]=2;
      }
      */
    }

}