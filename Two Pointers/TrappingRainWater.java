class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax= new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,height[i]);
            leftmax[i]=max;
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            rightmax[i]=max;
        }
        int water=0;
        for(int i=0;i<n;i++){
            water=water+(Math.min(leftmax[i],rightmax[i])-height[i]);
        }
        return water;
    }
}