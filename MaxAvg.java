class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        for(int i=0;i<k;i++)
        {
            wsum+=nums[i];
        }
        int maxsum=wsum;
        for(int i=k;i<nums.length;i++)
        {
            wsum+=nums[i]-nums[i-k];
            if(maxsum<wsum)
            {
                maxsum=wsum;
            }
        }
        double avg=(double)maxsum/k;
        return avg;
    }
}
