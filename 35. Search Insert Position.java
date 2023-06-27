class Solution {
    public int searchInsert(int[] nums, int target) {
        Set<Integer> li=new TreeSet<>();
        for(int i:nums){
            li.add(i);
        }
        ArrayList<Integer> al=new ArrayList<>();
         //al.addAll(li);
        if(!li.contains(target)){
            li.add(target);
            al.addAll(li);
            return al.indexOf(target);
            
        }
        else{
            al.addAll(li);
            return al.indexOf(target);
        }
    }
}
