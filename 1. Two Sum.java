class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;
            if(mp.containsKey(b)){
                arr[0]=i;
                arr[1]=mp.get(b);
            }
            mp.put(nums[i],i);
        }
        return arr;
    }
}
