class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        for(int ele:nums){
            hs.add(ele);
        }
        int idx=0;
        for(int i:hs){
            nums[idx++]=i;
        }
        return hs.size();
    }
}
