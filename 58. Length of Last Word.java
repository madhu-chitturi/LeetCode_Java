class Solution {
    public int lengthOfLastWord(String s) {
        String res=s.trim();
        String[] arr=res.split(" ");
        return arr[arr.length-1].length();
    }
}
