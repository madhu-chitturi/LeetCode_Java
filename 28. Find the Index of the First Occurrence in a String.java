class Solution {
    public int strStr(String a, String b) {
        int p1=0,p2=0;
        while(p1<a.length() && p2<b.length()){
            int cnt=0;
            while((p1<a.length() && p2<b.length()) && (a.charAt(p1)==b.charAt(p2))){
                p1++;
                p2++;
                cnt++;
            }
            if(cnt==b.length()){
                return p1-p2;
            }
            else{
                p1-=p2-1;
                p2=0;
            }
        }
    return -1;
    }
}
