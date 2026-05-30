/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
class SingleNumber {
    public int singleNumber(int[] nums) {
        //using Bitmanipulation the best solution
        int num=0;
        for(int i=0;i<nums.length;i++){
            num^=nums[i];
        }
        return num;

       /*
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                set.remove(nums[i]);
             else
                set.add(nums[i]);
        }
        return set.iterator().next();
    */


        /*HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
        */

    }
}