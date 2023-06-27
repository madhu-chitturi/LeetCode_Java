class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        StringBuilder s1=new StringBuilder(Integer.toString(x));
        StringBuilder s2=new StringBuilder(s1);
        if(s2.reverse().toString().equals(s1.toString())){
            return true;
        }
        return false;
    }
}
